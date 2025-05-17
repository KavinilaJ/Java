
package Practice5;


public class ShoppingClass {
    public void addItem(String name,int quantity){
       System.out.println("NAME : "+name);
       System.out.println("QUANTITY   : "+quantity);
     } 
    public void addItem(String name,int quantity,double price){
       System.out.println("NAME : "+name);
       System.out.println("QUANTITY   : "+quantity);
       System.out.println("PRICE : "+price);
       System.out.println("COST : " + price*quantity);

      }
    public static void main(String[] args) {
        ShoppingClass e=new ShoppingClass();
        e.addItem("XXX", 3);
        e.addItem("YYY", 2,50);
   }
}
