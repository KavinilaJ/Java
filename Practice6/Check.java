
package Practice6;

import java.util.Scanner;


public class Check {
   public static void main (String[] args){
    System.out.println("Check if input is Digit/Alphabet/Special Character");
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter a input");
    char ch = sc.next().charAt(0);
     if (Character.isLetter(ch)) {
         System.out.println("Given input is an Alphabet.");
     }else if(Character.isDigit(ch)){
	  	System.out.println("Given Input is Digit.");
	 } else{
	     System.out.println("Given Input is Special Character.");
	 } 
  } 
}
