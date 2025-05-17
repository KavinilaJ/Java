
package Inheritance;

 class BankCal {
    int loanAmount;
    public void calculateInterest(){
        System.out.println("Calculating interst");
    }
}
class SavingsAccount extends BankCal{
    SavingsAccount(int loanAmount){
        this.loanAmount=loanAmount;
    }
    @Override
    public void calculateInterest(){
        System.out.println("Interest amount is " +loanAmount*0.5);
    
}
}
class FixedDeposit extends BankCal{
    FixedDeposit(int loanAmount){
        this.loanAmount=loanAmount;
    }
    @Override
    public void calculateInterest(){
        System.out.println("Interest amount is " +loanAmount*0.6);
    
}
}

public class Bank{
     public static void main(String[] args){
         SavingsAccount s=new SavingsAccount(500);
         s.calculateInterest();
         FixedDeposit f=new FixedDeposit(500);
         f.calculateInterest();
              
      }
} 