package pl.edu.pw.medcomplexsoft.model;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

public class Doctor extends Employee implements Jsonable{
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
    @Override
    public String toJson() {
        final StringWriter writable = new StringWriter();
        try {
            this.toJson(writable);
        } catch (final IOException e) {
        }
        return writable.toString();
    }
    @Override
    public void toJson(Writer arg0) throws IOException {
        JsonObject json = new JsonObject();
        json.put("id", this.getId());
        json.put("name", this.getName());
        json.put("surname", this.getSurname());
        json.put("birthDate", this.getBirthDate().format(DateTimeFormatter.ISO_DATE));
        json.put("username", this.getUsername());
        json.put("password", this.getPassword());
        json.put("pesel", this.getPesel());
        json.put("gender", this.getGender());
        json.put("Address", this.getAddress().getId());
        json.put("mailAddress", this.getMailAddress());
        json.put("hireDate",  this.getHireDate().format(DateTimeFormatter.ISO_DATE));
        json.put("salary", this.getSalary());
        json.put("specialization", specialization);

    }

}
