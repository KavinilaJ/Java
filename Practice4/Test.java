package Practice4;



public class Test {
    
    public static void main(String args[]){
        int number=123,sum=0,last;
        
        while(number>0){
            last=number%10;
            sum=sum+last;
            number=number/10;
        }
        System.out.println("Sum of digits is " +sum);
    }
    
}
