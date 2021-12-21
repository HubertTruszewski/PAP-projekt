package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;


@MappedSuperclass
@Data @NoArgsConstructor
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String username;
    private String password;
    private String pesel;
    private char gender;
    @OneToOne
    private Address address;
    private String mailAddress;
}
