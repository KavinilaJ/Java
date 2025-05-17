
package Practice4;

public class ClassProgram {
    
       
       String name="nina";
       int age=19;
       int salary=10000;
       int increment;
       int experience=6;
       
         public void GetDetails(){
            
             System.out.println("The details are recieved");
         }
         public void calculate(){
             if(experience>5){
                 increment=salary+1000;
                 System.out.println("your incremented salary is"+increment);
             }
         }
   
public static void main(String[] args){


}
}