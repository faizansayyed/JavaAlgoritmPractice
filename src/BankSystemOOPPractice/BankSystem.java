package BankSystemOOPPractice;

// Main class demonstrating the usage of bank accounts
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(500, 200);

        savingsAccount.deposit(200);
        checkingAccount.deposit(200);
        checkingAccount.withdraw(300);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }
}
