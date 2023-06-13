public class Person {

    String name, address;

    public Person() {

    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void greeting(){
        System.out.println("Hello my name is "+ name +".\nI come from "+ address +".");
    }
}
