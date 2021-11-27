package pl.edu.pw.medcomplexsoft.model;

import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.OneToMany;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

public class Patient extends Person implements Jsonable {
    @OneToMany
    private List<Prescription> prescriptions;
    @OneToMany
    private List<Appointment> appointments;

    public List<Prescription> getPrescriptions() {
        return this.prescriptions;
    }

    public List<Appointment> getAppointments() {
        return this.appointments;
    }

    public Patient(){
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
        json.put("pesel", this.getPesel());
        json.put("gender", this.getGender());
        json.put("address", getAddress().getId());
        json.put("mailAddress", getMailAddress());
        json.toJson(writer);
    }
}
