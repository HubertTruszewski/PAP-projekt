package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;

public class Doctor extends Employee{
    private String specialization;

    public Doctor(){
    }
    public Doctor(long id, String name, String surname, LocalDate brithDate, String username, String password,
            String pesel, char gender, Address address, String mailAddress, LocalDate hireDate, double salary,
            String specialization) {
        super(id, name, surname, brithDate, username, password, pesel, gender, address, mailAddress, hireDate, salary);
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
