
package Practice4;

//Entity - Class (Noun)
public class Employee {
    
    public static void one(){
        System.out.println("inside static method one");
    }
    
    public static void two(){
        System.out.println("Inside static method two");
    }
    
    public void three(){
        System.out.println("Inside non static method three");
    }
    
    public void four(){
        System.out.println("Inside instance method four");
    }
    
    public static void main(String[] args) {
        one(); //calling the static method
        Employee.two();
        //three();   -> error - why? 
        //How to create instance
        //syntax
        //ClassName variableName = new ClassName();
        Employee emp = new Employee();  //instance of Employee class 
        emp.three();
        emp.four();
    }
    
}
