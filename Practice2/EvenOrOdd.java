
package Practice2;

import java.util.Scanner;


public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        String des;
        while(true){
            System.out.println("Enter a number to check even or odd ");   
            num=sc.nextInt();
            if(num%2==0){
                System.out.println("The number is even");
            }else{
                System.out.println("The number is odd");
            }
            System.out.println("Do you want to stop checking");
            des=sc.next().toLowerCase();
            if(des.equals("yes")){
                break;
            } }
        System.out.println("End.");
    }
}
