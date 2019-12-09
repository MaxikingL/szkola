package szkola.demo.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue
    private long id;

    @GeneratedValue
    private String name;

    protected Course(){ }
    public Course(String name){ this.name = name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String toString(){
        return "Course{"+ "id="+id+", name="+name+" }";
    }
}
