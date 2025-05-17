
package Encapsulation;
//Design a BankAccount class with private attributes for account number, balance, and account holder name. 
//Provide encapsulation and a private static variable to track the total number of accounts created.
//Implement methods to withdraw and deposit money.

public class BankAccount {
    private  int balance;
    private int accountNo;
    private String name;
    public BankAccount(int accountNo){
        this.accountNo=accountNo;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public void deposit(int deposit){
        System.out.println("Deposited amount" +deposit);
        balance=balance+deposit;
        System.out.println("Balance amount after deposit"+balance);
    }
     public void withdraw(int withdraw){
        System.out.println("Withdraw amount" +withdraw);
        balance=balance-withdraw;
        System.out.println("Balance amount after withdraw"+balance);
    }
     public void getbalance(){
         System.out.println("Balance amount"+balance);
     }
     public static void main(String[] args) {
        BankAccount b=new BankAccount(527812);
        b.setBalance(1000);
        b.deposit(500);
        b.withdraw(600);
        b.getbalance();
    }
        
}

