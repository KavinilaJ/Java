
package Practice6;

import java.util.Scanner;


public class Decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        double a=sc.nextDouble();
        System.out.println("Enter first number");
        double b=sc.nextDouble();
        a=Math.round(a*1000);
        b=Math.round(b*1000);
        if(a==b){
            System.out.println("The last three digits are same");
        }
        else{
            System.out.println("The last three digits are different");
        }
    }
 
}
