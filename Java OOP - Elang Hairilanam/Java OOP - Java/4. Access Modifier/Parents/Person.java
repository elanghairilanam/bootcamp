package Parents;

public class Person {

    public String name, address;

    public Person() {

    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void greeting(){
        System.out.println("Hello my name is "+ name +".\nI come from "+ address +".");
    }
}
