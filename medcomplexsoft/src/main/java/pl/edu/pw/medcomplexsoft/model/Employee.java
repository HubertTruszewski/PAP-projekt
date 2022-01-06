package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Data @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class Employee extends Person{
    private LocalDate hireDate;
    private double salary;
}
