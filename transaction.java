
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        System.out.println("--- DIU Transaction Management System ---");


        Accounts account1 = new Accounts(1001, "Anik Rahman");

        Transaction t1 = new Transaction();

        t1.setSerial(1);

        System.out.println("\n--- Deposit Transaction ---");

        t1.deposit(account1, 10000.0);
        t1.show();

        t1.setSerial(2);

        System.out.println("\n--- Withdrawal Transaction ---");

        t1.withdrawn(account1, 3000.0);
        t1.show();

        System.out.println("\n--- Final Account Balance ---");

        account1.showBalance();
    }
}

class Accounts {

    private int accountNo;
    private String title;
    private double balance;

    public Accounts(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
        this.balance = 0.0;
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

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }

    public void withdrawn(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void showBalance() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Title: " + title);
        System.out.println("Balance: " + balance);
    }
}

class Transaction {

    private int serial;
    private Date date = new Date();
    private String type;
    private double amount;
    private String description;
    private Accounts accounts;

    public Transaction() {
    }

    public int getSerial() {
        return serial;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public void deposit(Accounts accounts, double amount) {

        if (accounts != null && amount > 0) {

            setAccounts(accounts);
            setAmount(amount);
            setType("Deposit");
            setDescription("Money Deposited");
            setDate(new Date());

            accounts.deposit(amount);

        } else {
            System.out.println("Invalid Deposit!");
        }
    }
    public void withdrawn(Accounts accounts, double amount) {

        if (accounts != null && amount > 0
                && accounts.getBalance() >= amount) {

            setAccounts(accounts);
            setAmount(amount);
            setType("Withdrawn");
            setDescription("Money Withdrawn");
            setDate(new Date());

            accounts.withdrawn(amount);

        } else {
            System.out.println("Invalid Withdrawal!");
        }
    }

    public void show() {

        System.out.println("----- Transaction Details -----");
        System.out.println("Serial      : " + serial);
        System.out.println("Date        : " + date);
        System.out.println("Type        : " + type);
        System.out.println("Amount      : " + amount);
        System.out.println("Description : " + description);

        if (accounts != null) {
            System.out.println("Account No  : "
                    + accounts.getAccountNo());
        }

        System.out.println("----------------------------------");
    }
}
