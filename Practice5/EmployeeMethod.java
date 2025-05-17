
package Practice5;


public class EmployeeMethod {
       String name="nina";
       int age=19;
       static int salary=10000;
       static int increment;
       static int experience=6;
       
         public void GetDetails(){
             System.out.println("Name:"+name);
             System.out.println("Age:"+age);
             //System.out.println("The details are recieved");
         }
         public static void calculate(){
             if(experience>5){
                 increment=salary+1000;
                 System.out.println("Your incremented salary is " +increment);
             }
         }
   
public static void main(String[] args){
   EmployeeMethod emp=new EmployeeMethod();
   emp.GetDetails();
   calculate();
   


}
}
