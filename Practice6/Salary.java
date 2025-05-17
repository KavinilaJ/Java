
package Practice6;
//A company decided to give bonus of 5% to employee if his/her year of service 
//is more than 5 years.Ask user for their salary and year of service and 

import java.util.Scanner;

//print the net bonus amount

public class Salary {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the years of experience");
       int years=sc.nextInt();
       double salary=10000;
       if(years>5){
           salary+=salary*0.05;
           System.out.println("Salary : "+salary);
       }
       else{
        System.out.println("Salary :"+salary);
       }
    }
}
