
package Practice1;


public class Prime {
   public static void main(String[] args) {
      int num = 15;
      System.out.println("The given number is: " + num);
      int count = 0;
     for(int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
               count++;
            }
         }
         if(count == 2) {
            System.out.println(num + " is  a prime number");
         } else {
            System.out.println(num + " is not a prime number");
         }
      }
   }
  

