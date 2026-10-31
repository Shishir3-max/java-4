

package bd.edu.diu;

public class Current {

    private int accountNo;
    private String title;

    public Current() {
        this.accountNo = 0;
        this.title = "Unknown";
    }

    public Current(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
    }


    public int getAccountNo() {
        return accountNo;
    }

    public String getTitle() {
        return title;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void showBalance() {
        System.out.println("----------------------------------");
        System.out.println(" Account No  : " + accountNo);
        System.out.println(" Account Title: " + title);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {


        Current account1 = new Current();

        System.out.println("First Account:");
        account1.showBalance();

        account1.setAccountNo(1001);
        account1.setTitle("My First Account");

        System.out.println("\nUpdated First Account:");
        account1.showBalance();

     =
        Current account2 = new Current(1002, "Savings Account");

        System.out.println("\nSecond Account:");
        account2.showBalance();
=
        System.out.println("\nUsing Getter Methods:");
        System.out.println("Account Number: " + account2.getAccountNo());
        System.out.println("Account Title: " + account2.getTitle());
    }
}

