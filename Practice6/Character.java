
package Practice6;

//Write a program to check whether a entered character is lowercase 
//( a to z ) or uppercase ( A to Z ).
import static java.lang.Character.isLowerCase;
import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char a=sc.next().charAt(0);
        if(isLowerCase(a)){
            System.out.println("It is Lowercase letter");
        }
        else{
            System.out.println("It is uppercase letter");
        }
    }

    static boolean isLetter(char ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static boolean isDigit(char ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
