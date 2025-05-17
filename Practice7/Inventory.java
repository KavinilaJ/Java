
package Practice7;


public interface Inventory {
    public void order();
    public void stock();
}
class Customer implements Inventory{

    @Override
    public void order() {
        System.out.println("Customers can order from inventory");
    }

    @Override
    public void stock() {
        System.out.println("customers can check the stock in inventory");
    }
    public static void main(String[] args) {
        Customer c=new Customer();
        c.order();
        c.stock();
    }
    
}
