package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    private Doctor prescribingDoctor;
    @ManyToOne
    private Patient recivingPatient;
    private LocalDate issueDate;
    private LocalDate expirationDate;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToMany
    private List<PrescriptionPosition> postions;
}
