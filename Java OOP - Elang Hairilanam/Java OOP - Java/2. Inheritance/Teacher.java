import java.util.Random;
import java.util.Scanner;

public class Teacher extends Person {
    String subject;

    void teaching(){
        System.out.println("I can teach " + subject + ", son anyone how want to learn can talk to me.");
    }

    void greeting(){
        super.greeting();
        System.out.println("My job is a " + subject +" teacher");
    }
}

