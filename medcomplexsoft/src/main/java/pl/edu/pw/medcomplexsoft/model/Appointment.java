package pl.edu.pw.medcomplexsoft.model;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;


@Entity
public class Appointment implements Jsonable{
    @Id
    private long id;
    private LocalDateTime date;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Patient patient;
    private int duration;
    private String office;
    private List<Service> services;
    public Appointment() {
    }
    public Appointment(long id, LocalDateTime date, Doctor doctor, Patient patient, int duration, String office,
            List<Service> services) {
        this.id = id;
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
        this.duration = duration;
        this.office = office;
        this.services = services;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public List<Service> getServices() {
        return services;
    }
    public void setServices(List<Service> services) {
        this.services = services;
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
        json.put("id", id);
        json.put("date", date.format(DateTimeFormatter.ISO_DATE));
        json.put("doctor", doctor.getId());
        json.put("patient", patient.getId());
        json.put("duration", duration);
        json.put("offie", office);
        ArrayList<Long> servicesidlist = new ArrayList<Long>();
        for(var i : services)
                servicesidlist.add(i.getId());
        json.toJson(writer);
	}
}
