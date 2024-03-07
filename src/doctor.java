public class doctor extends person
{
    private String specialization;

    public doctor(String name, int age, String specialization)
    {
        super(name, age);
        this.specialization = specialization;
    }

    // Getters and setters
    public String getSpecialization()
    {
        return specialization;
    }

    public void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }

    // Override output
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }

    }
