public class appMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Elang Hairilanam";
        person.address = "Jakarta";

        Teacher teacher = new Teacher();
        teacher.name = "Udin";
        teacher.address = "Bandung";
        teacher.subject = "Matematika";

        Doctor doctor = new Doctor();
        doctor.name = "Ubed";
        doctor.address = "Majalengka";
        doctor.specialist = "Dentis";

        Programmer programmer = new Programmer("Elang Hairilanam","Jakarta", "Javascript");

        person.greeting();
        System.out.println("");

        teacher.greeting();
        System.out.println("");

        doctor.greeting();
        System.out.println("");

        programmer.greeting();
        System.out.println("");
    }
}
