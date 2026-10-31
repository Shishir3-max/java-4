package bd.edu.diu;

public class AccountTransfer {

    private String accountNumber;
    private double balance;

    // Default Constructor
    public AccountTransfer() {
    }

    // Parameterized Constructor
    public AccountTransfer(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter Methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setter Methods
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Main Method
    public static void main(String[] args) {

        AccountTransfer account =
                new AccountTransfer("123456", 5000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        System.out.println("\n--- Deposit ---");
        account.deposit(2000);
        System.out.println("Current Balance: " + account.getBalance());

        System.out.println("\n--- Withdrawal ---");
        account.withdraw(3000);
        System.out.println("Current Balance: " + account.getBalance());
    }
}
