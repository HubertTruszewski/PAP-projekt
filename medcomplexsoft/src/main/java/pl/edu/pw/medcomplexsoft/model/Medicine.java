package pl.edu.pw.medcomplexsoft.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Medicine {
    @Id
    private long id;
    private String name;
    private String manufacturer;
    public Medicine(){
    }

    public Medicine(long id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
