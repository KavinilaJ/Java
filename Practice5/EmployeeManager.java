
package Practice5;

public class EmployeeManager {
   public void addEmployee(String name,int id){
       System.out.println("NAME : "+name);
       System.out.println("Id   : "+id);
     } 
    public void addEmployee(String name,int id,double salary){
       System.out.println("NAME : "+name);
       System.out.println("Id   : "+id);
       System.out.println("SALARY : "+salary);
      }
    public static void main(String[] args) {
        EmployeeManager e=new EmployeeManager();
        e.addEmployee("XXX", 333);
        e.addEmployee("YYY", 444,50000);
   }
   
}
