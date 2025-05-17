
package Practice4;

public class prime {
    public static void main(String args[]){
        int num=4;
        int count=0;
        if(num!=0&&num!=1)
        {
            for(int i=2;i<=(num/2);i++)
            {
                if(num%i==0)
                {
                    System.out.println("Not a prime number");
                    count=1;
                    break;
                }
                
            }
        }
if(count==0)
{
      System.out.println("Prime number");
            

        }
    
}}
