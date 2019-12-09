package szkola.demo.Repository;

import jdk.internal.jline.internal.TestAccessible;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import szkola.demo.Entities.Course;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;


@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager em;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public Course findbyId(long id) {
        return em.find(Course.class, id);

    }

    public Course deleteById(long id) {
        Course courseToDelet = findbyId(id);
        em.remove(courseToDelet);
        return courseToDelet;
    }
    public Course save(Course course){
        if(course.getId()==null){
            em.persist(course); //nowy wpis
        }else{
            em.merge(course); // aktualizacja poprzedniego
        }
        return course;
    }
    public void playWithEntitiesManager(){
        logger.info("Jestem w metodzie playEntitiesManager");
    }
    public void playWithEM(){
        Course course = new Course("TEEEEST");
            em.persist(course);
            course.setName("TEEEST - UPDATE");//zmiana zapisu

    }
    public void playWithEM2(){
        Course course = new Course ("TEEEEST 2");
        em.persist(course);
        em.flush(); // Wymuszenie natychmiastowego zakończenia transakcji
    }

}
