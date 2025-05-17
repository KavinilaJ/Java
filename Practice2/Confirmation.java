
package Practice2;

import java.util.Scanner;


public class Confirmation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String des;
        do{
        System.out.println("Do you want to save changes(yes or no) ?");
        des=sc.nextLine().toLowerCase();
        }while(!des.equals("yes")&& !des.equals("no"));
        if(des.equals("yes")){
            System.out.println("Changes has been saved.");
        }
        if(des.equals("no")){
            System.out.println("Changes is not saved.");
        }
    }
}
