public class hospital
{
    private doctor Doctor;
    private patient Patient;

//setters
    public void setDoctor(doctor Doctor)
    {
        this.Doctor = Doctor;
    }

    public void setPatient(patient Patient)

    {
        this.Patient = Patient;
    }

//output
    public static void displayHospitalDetails(doctor doctor, patient patient)
    {
        System.out.println("Doctor's Details:");
        doctor.displayInfo();
        System.out.println("\nPatient's Details:");
        patient.displayInfo();
    }
}
