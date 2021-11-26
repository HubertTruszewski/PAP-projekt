package pl.edu.pw.medcomplexsoft.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private long id;
    private String street;
    private long houseNumber;
    private long flatNumber;
    private String city;
    private String postalCode;
    private String country;

    public Address(long id, String street, long houseNumber, long flatNumber, String city, String postalCode,
            String country) {
        this.id = id;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }
    public Address(){
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public long getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(long houseNumber) {
        this.houseNumber = houseNumber;
    }
    public long getFlatNumber() {
        return flatNumber;
    }
    public void setFlatNumber(long flatNumber) {
        this.flatNumber = flatNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }


}
