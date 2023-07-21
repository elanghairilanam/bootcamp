public class main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Arthfael Viktorija");
        person.setAge(25);
        person.setCountry("Amerika Serikat");

        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());
        System.out.println("Country : " + person.getCountry());
    }
}
