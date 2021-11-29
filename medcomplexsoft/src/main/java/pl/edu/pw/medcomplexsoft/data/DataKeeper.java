package pl.edu.pw.medcomplexsoft.data;

import java.time.LocalDate;
import java.util.ArrayList;

import pl.edu.pw.medcomplexsoft.model.*;

public class DataKeeper {
    public static ArrayList<Patient> patientsList = new ArrayList<Patient>();

    public static ArrayList<Address> addressesList = new ArrayList<Address>();

    public static ArrayList<Appointment> appointmentsList = new ArrayList<Appointment>();
    public static ArrayList<Prescription> prescriptionsList = new ArrayList<Prescription>();
    public static ArrayList<Medicine> medicinesList = new ArrayList<Medicine>();
    public static ArrayList<PrescriptionPosition> prescriptionPositionsList = new ArrayList<PrescriptionPosition>();

    public static void loadData()
    {
        Address address1 = new Address(12, "Koloejow", 23, 0, "Warszawa", "00-001", "Ameryka");
        Patient patient1 = new Patient(1, "Jan", "Nowak", LocalDate.of(2012, 12, 12), "Jann", "123", "1235434534", 'M', address1, "Jann@pw.edu.pl", new ArrayList<Prescription>(), new ArrayList<Appointment>());
        Address address2 = new Address(7, "Nowowiejska", 7, 5, "Krakow", "70-400", "Polska");
        Patient patient2 = new Patient(2, "Jurek", "Ogorek", LocalDate.of(2011, 11, 11), "JUREKOGOREK", "abcd", "234325346", 'M', address2, "ogorek@gmail.com", new ArrayList<Prescription>(), new ArrayList<Appointment>());
        DataKeeper.patientsList.add(patient1);
        DataKeeper.patientsList.add(patient2);
        DataKeeper.patientsList.add(new Patient(5, "Jan",
                                    "Kowalski", LocalDate.of(2000, 12, 12), "jan", "jan123", "12345678900", 'M', new Address((long)4, "Nowa", (long)15, (long)9, "Warszawa", "00-000", "PL"),
                                    "jan@example.com", new ArrayList<Prescription>(), new ArrayList<Appointment>()));
        DataKeeper.medicinesList.add(new Medicine(2, "APAP", "USP"));
        DataKeeper.medicinesList.add(new Medicine(3, "Ibuprom", "USP"));
    }

}
