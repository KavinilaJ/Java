
package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class EvenSum {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of elements");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
        System.out.println("Enter the item to add:");
        int num= sc.nextInt();
        list.add(num);
        }
        for(int ele:list){
            if(ele%2==0){
                sum+=ele;
            }
        }
        System.out.println("The sum of even elements is "+sum);
    }
}
