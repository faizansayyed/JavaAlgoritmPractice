package BankSystemOOPPractice;

// Concrete class representing a checking account
class CheckingAccount extends AbstractBankAccount {
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}