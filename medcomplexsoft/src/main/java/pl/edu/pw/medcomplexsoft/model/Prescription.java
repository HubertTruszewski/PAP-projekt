package pl.edu.pw.medcomplexsoft.model;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

@Entity
public class Prescription  implements Jsonable{

    @Id
    private long id;
    @ManyToOne
    private Doctor prescribingDoctor;
    @ManyToOne
    private Patient recivingPatient;
    private LocalDate issueDate;
    private LocalDate expirationDate;
    private String status;
    @OneToMany
    private List<PrescriptionPosition> postions;

    public Prescription() {
    }

    public Prescription(long id, Doctor prescribingDoctor, Patient recivingPatient, LocalDate issueDate,
            LocalDate expirationDate, String status, List<PrescriptionPosition> postions) {
        this.id = id;
        this.prescribingDoctor = prescribingDoctor;
        this.recivingPatient = recivingPatient;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
        this.status = status;
        this.postions = postions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Doctor getPrescribingDoctor() {
        return prescribingDoctor;
    }

    public void setPrescribingDoctor(Doctor prescribingDoctor) {
        this.prescribingDoctor = prescribingDoctor;
    }

    public Patient getRecivingPatient() {
        return recivingPatient;
    }

    public void setRecivingPatient(Patient recivingPatient) {
        this.recivingPatient = recivingPatient;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PrescriptionPosition> getPostions() {
        return postions;
    }

    public void setPostions(List<PrescriptionPosition> postions) {
        this.postions = postions;
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
        json.put("prescribingDoctor", prescribingDoctor.getId());
        json.put("recivingPatient", recivingPatient.getId());
        json.put("issueDate", issueDate.format(DateTimeFormatter.ISO_DATE));
        json.put("expirationDate", expirationDate.format(DateTimeFormatter.ISO_DATE));
        json.put("status", status);
        ArrayList<Long> postionsIdList = new ArrayList<Long>();
        for(var i : postions)
            postionsIdList.add(i.getId());
        json.put("positions", postionsIdList);
        json.toJson(writer);
    }
}
