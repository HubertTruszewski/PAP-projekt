package pl.edu.pw.medcomplexsoft.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class Employee extends Person{
    private LocalDate hireDate;
    private double salary;
}
