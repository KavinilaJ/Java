
package Practice2;

import java.util.Random;
import java.util.Scanner;


public class Guess {
    public static void main(String[] args) { 
        Scanner sc =new Scanner(System.in);
        Random ran=new Random();
        int num=ran.nextInt(101);
        int guess;
        do{
            System.out.println("Enter a number between 0 and 100");
            guess=sc.nextInt();
            if(guess > num){
                System.out.println("Too high.Try again.");
            }
            if(guess < num){
                System.out.println("Too low.Try again.");
            }
        }while(num!=guess); 
        System.out.println("The number is guessed correctly.");
    }
}
