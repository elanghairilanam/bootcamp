public class Doctor extends Person{

    String specialist;

    void surgery(){
        System.out.println("I can surgery operation Patiens");
    }

    public Doctor(String name, String address, String specialist) {
        super(name, address);
        this.specialist = specialist;
    }

    void greeting(){
        super.greeting();
        System.out.println("My occupation is " + specialist +" doctor");
    }
}
