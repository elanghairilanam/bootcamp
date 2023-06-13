package Childs;

import Parents.Product;

public class Item extends Product {
    private int price;

    public Item(String name, int price) {
        super(name);
        this.price = price;
    }

    public Item() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInformation(){
        System.out.println("Product name "+super.getName());
        System.out.println("Priduct price " + getPrice());
    }
}
