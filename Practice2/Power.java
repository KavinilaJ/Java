
package Practice2;

import java.util.Scanner;


public class Power {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the base"); 
    int base=sc.nextInt();
    System.out.println("Enter the exponent"); 
    int exponent=sc.nextInt();
    int result=1;
    for(int i=1;i<=exponent;i++){
        result*=base;
    }
        System.out.println("The power of number is "+result);
    }   
}
