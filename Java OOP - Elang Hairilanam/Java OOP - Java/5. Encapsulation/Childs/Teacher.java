package Childs;

import Parents.Person;

public class Teacher extends Person {
    private String subject;

    void teaching(){
        System.out.println("I can teach " + subject + ", son anyone how want to learn can talk to me.");
    }

    public Teacher(String subject) {
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }

    public void greeting(){
        super.greeting();
        System.out.println("My job is a " + subject +" teacher");
    }
}

