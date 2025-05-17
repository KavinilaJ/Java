
package OopsPractice;



class Supply {
    protected String name;
    protected double price;

    public Supply(String name, double price) {
        this.name = name;
        this.price = price;
    }

}

class Electronics extends Supply{
   String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

}

public class Product {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 999.99, "HP");
        System.out.println("Product: " + laptop.name + ", Brand: " + laptop.brand + ", Price: $" + laptop.price);
    }
}
