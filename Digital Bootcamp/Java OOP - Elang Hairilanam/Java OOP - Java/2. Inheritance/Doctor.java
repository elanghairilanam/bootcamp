public class Doctor extends Person{

    String specialist;

    void surgery(){
        System.out.println("I can surgery operation Patiens");
    }

    void greeting(){
        super.greeting();
        System.out.println("My occupation is " + specialist +" doctor");
    }
}
