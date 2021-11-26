package pl.edu.pw.medcomplexsoft.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service {
    @Id
    private long id;
    private String name;
    private double price;
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Service(){
    }

    public Service(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
