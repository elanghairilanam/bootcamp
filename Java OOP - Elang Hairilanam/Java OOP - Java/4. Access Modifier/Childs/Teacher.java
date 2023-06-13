package Childs;

import Parents.Person;

public class Teacher extends Person {
    public String subject;

    void teaching(){
        System.out.println("I can teach " + subject + ", son anyone how want to learn can talk to me.");
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

