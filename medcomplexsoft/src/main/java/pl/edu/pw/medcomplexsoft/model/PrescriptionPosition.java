package pl.edu.pw.medcomplexsoft.model;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;

public class PrescriptionPosition implements Jsonable {
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
        json.put("dosage", dosage);
        json.put("medicine", medicine.getId());
        json.toJson(writer);
    }
}
