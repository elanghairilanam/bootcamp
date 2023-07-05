package Childs;

import Parents.Person;

public class Programmer extends Person {
    private String technology;

    void hacking(){
        System.out.println("I can hacking a website");
    }

    void coding(){
        System.out.println("I can create a application using technology " + technology +".");
    }

    public Programmer(String technology) {
        this.technology = technology;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getAddress() {
        return super.getAddress();
    }

    public void setAddress(String address) {
        super.setAddress(address);
    }

    public String getTechnology() {
        return technology;
    }

    public void greeting(){
        super.greeting();
        System.out.println("My job is a " + technology +" programmer");
    }
}
