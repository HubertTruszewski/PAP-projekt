package pl.edu.pw.medcomplexsoft.model;

import java.io.IOException;
import java.io.Writer;
import java.io.StringWriter;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.persistence.OneToMany;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;
import java.time.LocalDate;

public class Patient extends Person implements Jsonable {
    @OneToMany
    private ArrayList<Prescription> prescriptions;
    @OneToMany
    private ArrayList<Appointment> appointments;

    public ArrayList<Prescription> getPrescriptions() {
        return this.prescriptions;
    }

    public ArrayList<Appointment> getAppointments() {
        return this.appointments;
    }



    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public Patient(){
    }

    public Patient(ArrayList<Prescription> prescriptions, ArrayList<Appointment> appointments, String name, String surname, LocalDate birthDate, String username, String password, String pesel, char gender, Address address, String mailAddress) {
        super(name, surname, birthDate, username, password, pesel, gender, address, mailAddress);
        this.prescriptions = prescriptions;
        this.appointments = appointments;
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

    public Patient(long id, String name, String surname, LocalDate birthDate, String username, String password,
            String pesel, char gender, Address address, String mailAddress, ArrayList<Prescription> prescriptions,
            ArrayList<Appointment> appointments) {
        super(id, name, surname, birthDate, username, password, pesel, gender, address, mailAddress);
        this.prescriptions = prescriptions;
        this.appointments = appointments;
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
        json.put("gender", String.valueOf(getGender()));
        json.put("address", getAddress().getId());
        json.put("mailAddress", getMailAddress());
        json.put("appointments", appointments);
        json.put("prescriptions", prescriptions);
        json.toJson(writer);
    }
}
