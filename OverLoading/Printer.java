
package OverLoading;

public class Printer {
    
    void print(int num) {
        System.out.println("Printing integer: " + num);
    }

    void print(String text) {
        System.out.println("Printing string: " + text);
    }
}

class OverloadingExample {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(100);         // Printing integer: 100
        p.print("Hello");     // Printing string: Hello
    }
}

