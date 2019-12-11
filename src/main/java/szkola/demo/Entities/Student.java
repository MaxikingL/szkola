package szkola.demo.Entities;

import javax.persistence.*;

@Entity
public class Student{

    @Id
    @GeneratedValue
    private Long id;

    @Column( nullable = false)
    private String name;

    @OneToOne
    private Passport passport;

    protected Student(){}
    public Student(String name){this.name=name;}

    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public Long getId(){return id;}

    @Override
    public String toString() {
        return String.format("Student name -> [%s]",name);
    }
}