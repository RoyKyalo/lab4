public class Main
{
    public static void main(String[] args) {
        // Create a doctor
        doctor Doctor = new doctor("Dr. Nyarangi", 33, "Oncologist");

        // Create a patient
        patient Patient = new patient("Peter Marangi", 75, "Colon cancer");

        // Display hospital details
        hospital.displayHospitalDetails(Doctor, Patient);
    }
}
