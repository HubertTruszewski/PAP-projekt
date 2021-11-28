package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public abstract class Person {
    @Id
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

    public Person() {
    }

    public Person(String name, String surname, LocalDate birthDate, String username, String password, String pesel, char gender, Address address, String mailAddress) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.username = username;
        this.password = password;
        this.pesel = pesel;
        this.gender = gender;
        this.address = address;
        this.mailAddress = mailAddress;
    }

    
    
    public Person(long id, String name, String surname, LocalDate birthDate, String username, String password,
            String pesel, char gender, Address address, String mailAddress) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.username = username;
        this.password = password;
        this.pesel = pesel;
        this.gender = gender;
        this.address = address;
        this.mailAddress = mailAddress;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}
