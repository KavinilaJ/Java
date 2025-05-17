
package Practice3;


public class SumFind {
    public static int Finding13(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        System.out.println(Finding13(1, 2, 3));   
    }
}


