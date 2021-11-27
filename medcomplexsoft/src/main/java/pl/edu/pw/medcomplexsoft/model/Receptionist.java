package pl.edu.pw.medcomplexsoft.model;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

public class Receptionist extends Employee implements Jsonable{

    public Receptionist(){
    }
    public Receptionist(long id, String name, String surname, LocalDate brithDate, String username, String password,
            String pesel, char gender, Address address, String mailAddress, LocalDate hireDate, double salary,
            String specialization) {
        super(id, name, surname, brithDate, username, password, pesel, gender, address, mailAddress, hireDate, salary);
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
    public void toJson(Writer writer) throws IOException {
        JsonObject json = new JsonObject();
        json.put("id", getId());
        json.put("name", getName());
        json.put("surname", getSurname());
        json.put("birthDate", getBirthDate().format(DateTimeFormatter.ISO_DATE));
        json.put("username", getUsername());
        json.put("password", getPassword());
        json.put("pesel", getPesel());
        json.put("gender", getGender());
        json.put("adress", getAddress());
        json.put("mailAdress", getMailAddress());
        json.put("hireDate", getHireDate());
        json.put("salary", getSalary());
        json.toJson(writer);
    }
}
