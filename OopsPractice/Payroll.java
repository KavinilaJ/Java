
package OopsPractice;

//Design a system to calculate payroll for employees. Create classes for Employee, 
//HourlyEmployee, and SalariedEmployee. Implement methods for calculating monthly
//pay based on hours worked and salary.
abstract class PayrollCal {
    public int salary=100;
    public abstract void Calculate();
}
class HourlyEmployee extends PayrollCal{
    public int hours;
    public void getHours(int hours){
        this.hours=hours;
    }
   @Override
   public void Calculate(){
       salary=salary*hours;
       System.out.println("Salary:" +salary);
   }
}
class SalariedEmployee extends PayrollCal{
    
   @Override
   public void Calculate(){
       salary=salary *100;
       System.out.println("Salary:" +salary);
   }
}
public class Payroll{
    public static void main(String[] args) {
        HourlyEmployee h=new HourlyEmployee();
        h.getHours(5);
        h.Calculate();
        SalariedEmployee s=new SalariedEmployee();
        s.Calculate();
    }
}
