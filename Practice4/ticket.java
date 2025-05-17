
package Practice4;


public class ticket {
    public static void main(String args[]){
        int number=2;
        int age=30;
        int price;
        if(age>0&&age<=12){
            price=number*10;
            System.out.println("The price is" +price);
        }
        else if(age>12&&age<=30){
            price=number*20;
            System.out.println("The price is" +price);
        }
        else if(age>30&&age<=60){
            price=number*40;
            System.out.println("The price is" +price);
        }
        else if(age>60){
            price=number*5;
            System.out.println("The price is" +price);
        }
        else{
            System.out.println("The age is invalid");
         }
    }
}
