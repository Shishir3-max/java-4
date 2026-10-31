

package bd.edu.diu;

public class FixedDeposit {

    private int accountNo;
    private String title;
    private double balance;
   public FixedDeposit() {
        this.accountNo = 0;
        this.title = "Unknown";
        this.balance = 0.0;
    }

    public FixedDeposit(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
        this.balance = 0.0;
    }

    public FixedDeposit(int accountNo, double balance, String title) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.title = title;
    }

   
    public int getAccountNo() {
        return accountNo;
    }

    public String getTitle() {
        return title;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("----- Account Information -----");
        System.out.println("Account No   : " + accountNo);
        System.out.println("Account Title: " + title);
        System.out.println("Balance      : " + balance);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        FixedDeposit account1 = new FixedDeposit();

        System.out.println("First Account:");
        account1.showBalance();


        FixedDeposit account2 =
                new FixedDeposit(1001, "Fixed Deposit Account");

        System.out.println("\nSecond Account:");
        account2.showBalance();

        FixedDeposit account3 =
                new FixedDeposit(1002, 50000.0, "My FD Account");

        System.out.println("\nThird Account:");
        account3.showBalance();

        account3.setAccountNo(1003);
        account3.setTitle("Updated FD Account");
        account3.setBalance(75000.0);

        System.out.println("\nAfter Updating Third Account:");
        account3.showBalance();

        System.out.println("\nUsing Getter Methods:");
        System.out.println("Account No: " + account3.getAccountNo());
        System.out.println("Title: " + account3.getTitle());
        System.out.println("Balance: " + account3.getBalance());
    }
}
