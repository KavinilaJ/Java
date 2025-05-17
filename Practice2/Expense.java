
package Practice2;
//You are working on a finance application. Users input their daily expenses, 
//and you need to calculate the total expenses for the month. How would you use 
//loops to efficiently sum up the expenses entered by the user for each day?
import java.util.Scanner;

public class Expense {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of days");
        double Days=sc.nextDouble();
        double total=0;
        for(int i=1;i<=Days;i++){
            System.out.println("Enter the expense of the day "+i); 
            double money=sc.nextDouble();
            total+=money;
        }
        System.out.println("The total expense of this month is "+total);
    }
}
