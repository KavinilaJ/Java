 

package Abstract;

// Define an abstract class Bank with abstract methods
public abstract class Bank {
    public abstract void getInterestRate();
    public abstract void displayInfo();
}

class SavingsAccount extends Bank {
    int loan;
    double interest, intAmount;

    public SavingsAccount(int loan) {
        this.loan = loan;
    }

    @Override
    public void getInterestRate() {
        interest = 0.5;
        System.out.println("Interest rate = " + interest);
    }

    @Override
    public void displayInfo() {
        intAmount = loan * interest;
        System.out.println("Loan amount = " + loan);
        System.out.println("Interest rate = " + interest);
        System.out.println("Interest amount = " + intAmount);
    }
}

class CurrentAccount extends Bank {
    int loan;
    double interest, intAmount;

    public CurrentAccount(int loan) {
        this.loan = loan;
    }

    @Override
    public void getInterestRate() {
        interest = 0.3;
        System.out.println("Interest rate = " + interest);
    }

    @Override
    public void displayInfo() {
        intAmount = loan * interest;
        System.out.println("Loan amount = " + loan);
        System.out.println("Interest rate = " + interest);
        System.out.println("Interest amount = " + intAmount);
    }
}
