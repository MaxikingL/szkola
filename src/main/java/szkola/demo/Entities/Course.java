package szkola.demo.Entities;


import javax.persistence.*;

@Entity
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue
    private long id;


    @Column(name = "name", nullable = false)
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
