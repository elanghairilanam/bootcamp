package Childs;

import Parents.Person;

public class Doctor extends Person {

    private String specialist;

    void surgery(){
        System.out.println("I can surgery operation Patiens");
    }

    public Doctor(String specialist) {
        this.specialist = specialist;
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

    public String getSpecialist() {
        return specialist;
    }

    public void greeting(){
        super.greeting();
        System.out.println("My occupation is " + specialist +" doctor");
    }
}
