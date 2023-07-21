public class Employee extends Person{
    private String companyName;

    public Employee(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void greeting() {
        System.out.println("Hallo, nama saya "+ super.getName() + ", berumur " + super.getAge() + " tahun");
        System.out.println("Saya Bekerja di " + getCompanyName());
        System.out.println("Salam Kenal");
    }
}
