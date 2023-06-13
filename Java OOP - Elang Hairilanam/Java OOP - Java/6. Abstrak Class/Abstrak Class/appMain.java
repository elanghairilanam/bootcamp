import Childs.Doctor;
import Childs.Item;
import Childs.Programmer;
import Childs.Teacher;
import Parents.Person;
import Parents.Product;

public class appMain {
    public static void main(String[] args) {
        Product product = new Item("HP",500);
        product.printInformation();
    }
}
