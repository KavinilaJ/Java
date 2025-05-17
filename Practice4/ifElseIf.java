
package Practice4;


public class ifElseIf {
    public static void main(String args[]){
        int side1=2,side2=3,side3=4;
        if(side1==side2&&side1==side3){
            System.out.println("It is an equilateral triangle");
        }
        else if(side1==side2||side2==side3||side1==side3){
            System.out.println("It is an isoceles triangle");
        }
        else if(side1!=side2&&side2!=side3&&side1!=side3){
            System.out.println("It is a scalene triangle");
        }
        else{
            System.out.println("It is an invalid triangle");
        }
        
    }
}
