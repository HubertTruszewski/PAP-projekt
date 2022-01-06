package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Access(AccessType.FIELD)
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Data @NoArgsConstructor
public abstract class Person {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_gen")
    @SequenceGenerator(name = "person_gen", sequenceName = "person_seq", allocationSize = 1)
    @Id
    private long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String username;
    private String password;
    private String pesel;
    private char gender;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    private String mailAddress;

    public String getFullName()
    {
        return this.name + " " + this.surname;
    }
}
