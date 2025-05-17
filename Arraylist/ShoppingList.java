package Arraylist;
//Create a program to manage a shopping list using an ArrayList. 
//Allow users to add items, remove items, and display the current list.

import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingList {
   public static void main(String[] args) {
    ArrayList<String> list=new ArrayList();
    Scanner sc=new Scanner(System.in);
    while(true){
            System.out.println("1.Add item");
            System.out.println("2.Remove item");
            System.out.println("3.Display list");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
        
    switch(choice){
        case 1:
            System.out.println("Enter the item to add:");
            String str= sc.next();
            list.add(str);
            System.out.println("Item : "+ str + "has been added to the list");
            break;
        case 2:
            System.out.println("Enter the item number to be removed:");
            int index=sc.nextInt();
            list.remove(index);
            System.out.println("Item number:"+index+ "has been removed from the list");
            break;
        case 3:
            System.out.println("The current shopping list is");
            System.out.println(list);
            break;
     }
    }
   }   
}
