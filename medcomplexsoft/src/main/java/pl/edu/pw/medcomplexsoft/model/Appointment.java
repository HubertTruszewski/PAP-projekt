package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data @NoArgsConstructor
public class Appointment{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private LocalDateTime date;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Patient patient;
    private int duration;
    private String office;
    @Enumerated(EnumType.STRING)
    private Status status;
    @ManyToMany
    private List<Service> services;
}
