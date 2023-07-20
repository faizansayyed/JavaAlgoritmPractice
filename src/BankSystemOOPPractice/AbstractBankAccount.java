package BankSystemOOPPractice;

// Abstract class providing common functionality for different types of bank accounts
abstract class AbstractBankAccount implements BankAccount {
    protected double balance;

    public AbstractBankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // Common method implementation for all bank accounts
    public void deposit(double amount) {
        balance += amount;
    }
}