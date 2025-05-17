
package ExceptionHandling;

import java.util.Scanner;

public class DivisionByZero {
   public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=a/b;
       if(b==0){
               throw new ArithmeticException("Division by zero");               } 
       else{
                System.out.println("Arithmetic Exception");
                 }
          }
        
        
} 

