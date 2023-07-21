public class Programmer extends Employee {

    private String programmingLanguage;

    public Programmer(String name, int age, String companyName, String programmingLanguage) {
        super(name, age, companyName);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void greeting() {
        System.out.println("Hallo, nama saya "+ super.getName() + ", berumur " + super.getAge() + " tahun");
        System.out.println("Saya Bekerja di " + super.getCompanyName());
        System.out.println("Saya menguasai bahasa pemrograman " + getProgrammingLanguage());
        System.out.println("Saya adalah programmer " + getProgrammingLanguage() + " di " + super.getCompanyName());
    }
}
