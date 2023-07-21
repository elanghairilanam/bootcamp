public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void greeting() {
        System.out.println("Hallo, nama saya "+ super.getName() + ", berumur " + super.getAge() + " tahun");
        System.out.println("Saya menguasai mata pelajaran " + getSubject());
        System.out.println("Saya adalah seorang guru, mengajar " + getSubject());
    }
}
