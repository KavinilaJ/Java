
package Practice1;


public class Static {
    private int count = 0;

    public static void main(String[] args) {
        Static obj = new Static();
        obj.incrementCount();
        System.out.println("Count is: " + obj.count);
    }

    public void incrementCount() {
        count++;
    }
}
 

