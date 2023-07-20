package BankSystemOOPPractice;

// Concrete class representing a savings account
class SavingsAccount extends AbstractBankAccount {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Additional method specific to savings account
    public void applyInterest() {
        balance += balance * interestRate;
    }
}
