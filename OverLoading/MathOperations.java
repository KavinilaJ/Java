
package OverLoading;
public class MathOperations {
   
    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

 class Overloading {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        System.out.println(mo.multiply(2, 3));       // 6
        System.out.println(mo.multiply(2, 3, 4));    // 24
    }
}
