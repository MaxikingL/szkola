package szkola.demo.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import szkola.demo.Entities.Student;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {



    EntityManager em;


    public Student findById(Long id) {
        return em.find(Student.class, id);
    }

}
