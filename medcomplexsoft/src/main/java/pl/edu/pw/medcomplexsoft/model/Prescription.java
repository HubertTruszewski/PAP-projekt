package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Prescription {
    @Id
    private long id;
    @ManyToOne
    private Doctor prescribingDoctor;
    @ManyToOne
    private Patient recivingPatient;
    private LocalDate issueDate;
    private LocalDate expirationDate;
    @OneToMany
    private List<PrescriptionPosition> postions;

    public Prescription() {
    }
    public Prescription(long id, Doctor prescribingDoctor, Patient recivingPatient, LocalDate issueDate,
            LocalDate expirationDate, List<PrescriptionPosition> postions) {
        this.id = id;
        this.prescribingDoctor = prescribingDoctor;
        this.recivingPatient = recivingPatient;
        this.issueDate = issueDate;
        this.expirationDate = expirationDate;
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
    public List<PrescriptionPosition> getPostions() {
        return postions;
    }
    public void setPostions(List<PrescriptionPosition> postions) {
        this.postions = postions;
    }
}
