package pl.edu.pw.medcomplexsoft.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor
public class Address{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String street;
    private long houseNumber;
    private long flatNumber;
    private String city;
    private String postalCode;
    private String country;
}
