package Practice5;

public class Test {

    int a = 10, b = 10;  //declaration and assignment
    static int c = 100;  // declaration and assignment

    public void display() {
        //inside instance method we can access static and non static variables
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void show() {
        //inside static method you can ONLY access static variables 
        //System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        Test t = new Test();  // classname var = new classname();
        t.display();
        Test.show();
    }

}
