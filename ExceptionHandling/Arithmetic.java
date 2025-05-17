
package ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Arithmetic {
    int a;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try{
        int n=sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("The input is not a integer ");
        }
    }
}
