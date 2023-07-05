import Childs.Doctor;
import Childs.Programmer;
import Childs.Teacher;
import Parents.Person;

public class appMain {
    public static void main(String[] args) {
        Person person1 = new Programmer("Java");
        person1.setName("Elang");
        person1.setAddress("Jakarta");

        Person person2 = new Doctor("Dentist");
        person2.setName("Budi");
        person2.setAddress("Cikarang");

        Person person3 = new Teacher("Matematika");
        person3.setName("Johan");
        person3.setAddress("Bekasi");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
    }

    static void sayHello(Person person){
        String message;
        if (person instanceof Programmer){
            Programmer programmer = (Programmer) person;
            message = "Hello, " + programmer.getName() + ". Seorang programmer " + programmer.getTechnology();
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello, "+ doctor.getName() + ". Seorang dokter "+doctor.getSpecialist();
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            message = "Hello, "+ teacher.getName() + ". Seorang guru "+teacher.getSubject();
        }else{
            message = "Hello, " + person.getName();
        }

        System.out.println(message);
    }
}
