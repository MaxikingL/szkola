package szkola.demo.Entities;

import javax.persistence.*;

@Entity
public class Passport{

    @Id
    @GeneratedValue
    private Long id;

    @Column( nullable = false)
    private String number;

    @OneToOne
    private Passport passport;


    public void setNumber(String number){this.number=number;}
    public String getNumber() { return number; }

    public Long getId() {return id;}

    @Override
    public String toString() {
        return String.format("Passport[%s]",number);
    }
}
