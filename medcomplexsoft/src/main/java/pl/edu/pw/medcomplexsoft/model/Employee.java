package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;

public abstract class Employee extends Person{
    private LocalDate hireDate;
    private double salary;
    public Employee(){
    }

    public Employee(long id, String name, String surname, LocalDate brithDate, String username, String password,
            String pesel, char gender, Address address, String mailAddress, LocalDate hireDate, double salary) {
        super(id, name, surname, brithDate, username, password, pesel, gender, address, mailAddress);
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
