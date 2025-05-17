
package Practice2;

import java.util.Scanner;


public class Gcd {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2");
        int num2=sc.nextInt();
        int gcd=0;
        System.out.println("The gcd of "+num1+" and "+num2+" is");
        for(int i=2;i<=num1 && i<=num2 ;i++){
            if(num1%i==0 && num2%i==0){
               gcd=i;
            }
         }
        System.out.println(gcd);
    }
}
