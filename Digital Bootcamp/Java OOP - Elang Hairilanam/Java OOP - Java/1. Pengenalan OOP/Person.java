public class Person {

    String firstName, lastName;

    Person() {
        this.firstName = "";
        this.lastName="";
    }

    public String sayHello(){
        return getFirstName() +" "+ getLastName();
    }

    Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
