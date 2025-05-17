
package Practice5;


public class GrossSalary {
   
       double gross,basic=10000;
       double pf,da,hra;
       static int allowance;
       static char grade='A';
       
       public void Calculation(){
          pf = 0.11*basic;
          hra = 0.2*basic;
          da = 0.5 *basic;
          gross=(basic+hra+da)-pf;
          System.out.println("Gross salary is" +gross);
           
       }
       public static void Allowance(){
           if(grade=='A'){
               allowance=1000;
               System.out.println("Allowance money is" +allowance);
               
           }
       } 
       public static void main(String[] args){
           GrossSalary g=new GrossSalary();
           g.Calculation();
           Allowance();       
       }
       
       
       
   
}
