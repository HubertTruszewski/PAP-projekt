package pl.edu.pw.medcomplexsoft.model;

import java.util.List;

import javax.persistence.OneToMany;

public class Patient {
    @OneToMany
    private List<Prescription> prescriptions;
    @OneToMany
    private List<Appointment> appointments;

    public List<Prescription> getPrescriptions() {
        return this.prescriptions;
    }

    public List<Appointment> getAppointments() {
        return this.appointments;
    }

    public Patient(){
    }

}
