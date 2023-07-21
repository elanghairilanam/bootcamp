public class Main {
    public static void main(String[] args) {
        Person person = new Person("Budi", 18);
        Person employee = new Employee("Nur",22,"KahteX");
        Person teacher = new Teacher("Anthony",26,"Matematika");
        Employee programmer = new Programmer("Hasbi",20,"AprilinDo","Java");
        Employee projectLeader = new ProjectLeader("Ridwan", 27, "BatuBintang",10);

        person.greeting();
        System.out.println();
        programmer.greeting();
        System.out.println();
        employee.greeting();
        System.out.println();
        projectLeader.greeting();
        System.out.println();
        teacher.greeting();
    }
}
