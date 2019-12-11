package szkola.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import org.slf4j.Logger;
import szkola.demo.Entities.Course;
import szkola.demo.Repository.CourseRepository;

import javax.persistence.EntityManager;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CourseRepositoryTest {

    private  Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    EntityManager em;

    @Test
    public void findById(){
        Course course = courseRepository.findbyId(10001L);
        assertEquals("Tekstowo", course.getName());
    }

    @Test
    @DirtiesContext
    public void deleteById_basic(){

        courseRepository.deleteById(10001L);
        assertNull(courseRepository.findbyId(10001L));
    }

    @Test
    @DirtiesContext
    public void save_edit(){
        //pobieramy kurs
        Course course = courseRepository.findbyId(10001L);
        assertEquals("Tekstowo", course.getName());

        //aktualizujemy i zapisujemy
        course.setName("Tekstowo - update");
        courseRepository.save(course);

        //sprawdzamy wartość
        Course course1 = courseRepository.findbyId(10001L);
        assertEquals("Tekstowo - update",course1.getName());

    }

    @Test
    @DirtiesContext
    public void save_insert(){
        //pobieramy course i upewniamy się że nie istnieje
        Course course = courseRepository.findbyId(1);
        assertNull(course);

        //tworzymy i zapisujemy
        course = new Course("Tekstowo-insert");
        courseRepository.save(course);

        //sprawdzamy zawartość
        Course course1 = courseRepository.findbyId(1);
        assertEquals("Tekstowo-insert",course1.getName());
    }

//      @Test
//    @DirtiesContext
//    public void PlayWithEntitiesManager(){
//        courseRepository.playWithEntitiesManager();
//    }



}
