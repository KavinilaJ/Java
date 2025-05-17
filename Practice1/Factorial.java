
package Practice1;


public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = factorial(n);
        System.out.println("Factorial of " + n  +" is: " + factorial);
    }

    public  static int factorial(int n) {
         int result;
        if (n == 0) {
            return 1;
        } else {
            result = n * factorial(n-1 );
        }
        return result;
    }


  

}



