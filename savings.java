d.edu.diu;

public class Savings {

    private int accountNo;
    private String title;
    private double balance;
    private double interestRate;
    private double minimumBalance;

    public Savings(int accountNo, String title,
                   double interestRate, double minimumBalance) {
        this.accountNo = accountNo;
        this.title = title;
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal denied: Minimum balance requirement not met.");
        }
    }

    public void showBalance() {
        System.out.println("Account No  : " + accountNo);
        System.out.println("Title       : " + title);
        System.out.println("Balance     : " + balance);
        System.out.println("Interest %  : " + interestRate);
        System.out.println("Min Balance : " + minimumBalance);
    }

    public static void main(String[] args) {

        System.out.println("--- DIU Savings Account System ---");

        Savings acc1 = new Savings(2001, "Anik Rahman", 5.5, 500.0);

        acc1.deposit(5000.0);
        acc1.withdraw(2000.0);
        acc1.withdraw(2700.0);

        System.out.println("----------------------------------");
        acc1.showBalance();
    }
}
