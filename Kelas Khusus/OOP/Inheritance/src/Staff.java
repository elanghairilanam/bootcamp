public class Staff extends Employee{
    private String specialization;


    public Staff(String name, int age, double salary, String specialization) {
        super(name, age, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Specialization : " + getSpecialization());
    }
}
