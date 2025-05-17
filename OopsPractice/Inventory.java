
package OopsPractice;
import java.util.ArrayList;
import java.util.Scanner;

//Create a system to manage inventory for a store. Design classes for Product, 
//Inventory, and Order. Implement methods for adding products to the inventory, 
//processing orders, and tracking stock levels.
public class Inventory {
    public static void main(String[] args) {
     Product p=new Product();
     p.AddItem();
     Remove r=new Remove();
     r.remove();
     Stock s=new Stock();
     s.Display();
    }
}
class Product{
    ArrayList<String> list=new ArrayList();
    Scanner sc=new Scanner(System.in);
    public void AddItem(){
      System.out.println("Enter the item to add:");
      String str= sc.next();
      list.add(str);
      System.out.println("Item : "+ str + "has been added to the list");
    }
}
class Stock extends Product{
    public void Display(){
    System.out.println("The current shopping list is");
    System.out.println(list);
    }
}
class Remove extends Product{
    public void remove(){
    System.out.println("Enter the item number to be removed:");
    int index=sc.nextInt();
    list.remove(index);
    System.out.println("Item number:"+index+ "has been removed from the list");
    }
}
