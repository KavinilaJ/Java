
package Practice4;


public class divisible {
    public static void main(String args[]){
        int a=3;
        if(a%3==0&&a%4==0){
            System.out.println("It  is divisible by 3 and 4");
        }
        else if(a%3==0){
            System.out.println("It is divisible by 3");
        }
        else if(a%4==0){
            System.out.println("It is divisible by 4");
        }
        else{
            System.out.println("It is not divisible by 3 and 4");
        }
    }
}
