package pl.edu.pw.medcomplexsoft.model;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class PrescriptionPosition {
    @Id
    private long id;
    private String dosage;
    @ManyToOne
    private Medicine medicine;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDosage() {
        return dosage;
    }
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
    public Medicine getMedicine() {
        return medicine;
    }
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    public PrescriptionPosition(long id, String dosage, Medicine medicine) {
        this.id = id;
        this.dosage = dosage;
        this.medicine = medicine;
    }
    public PrescriptionPosition(){
    }
}
