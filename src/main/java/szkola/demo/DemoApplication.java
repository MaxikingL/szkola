package szkola.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import szkola.demo.Entities.Course;
import szkola.demo.Repository.CourseRepository;



@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository courseRepository;



    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);}


        @Override
        public void run (String...args) throws Exception {

            Course course = courseRepository.findbyId(10001L);
            logger.info("Course 10001 ->{}", course);

        }
    }
