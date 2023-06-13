public class appMain {
    public static void main(String[] args) {
        Person person1 = new Programmer("Elang","Jakarta","Java");
        Person person2 = new Doctor("Udin","Bandung", "Dentist");
        Person person3 = new Teacher("Ujang", "Cikarang","Matematika");

        sayHello(person1);
        sayHello(person2);
        sayHello(person3);
    }

    static void sayHello(Person person){
        String message;
        if (person instanceof Programmer){
            Programmer programmer = (Programmer) person;
            message = "Hello, " + programmer.name + ". Seorang programmer " + programmer.technology;
        } else if (person instanceof Doctor) {
            Doctor doctor = (Doctor) person;
            message = "Hello, "+ doctor.name + ". Seorang dokter "+doctor.specialist;
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            message = "Hello, "+ teacher.name + ". Seorang guru "+teacher.subject;
        }else{
            message = "Hello, " + person.name;
        }

        System.out.println(message);
    }
}
