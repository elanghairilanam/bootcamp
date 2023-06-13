import Childs.*;
import Parents.Person;
import Parents.Product;
import Parents.Shape;

public class appMain {
    public static void main(String[] args) {
        Shape circle = new Circle(7,"Red");
        Shape triangle = new Triangle(14, 7, "White");

        System.out.println("Luas segitiga berwarna "+circle.getColor()+" adalah "+circle.getArea());
        System.out.println("Luas lingkaran berwarna "+triangle.getColor()+" adalah "+triangle.getArea());
    }
}
