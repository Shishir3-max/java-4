
package bd.edu.diu;

public class Customer {

    private int id;
    private String name;
    private String cell;
    private String phone;

    public Customer() {
    }

    public Customer(int id, String name, String cell, String phone) {
        this.id = id;
        this.name = name;
        this.cell = cell;
        this.phone = phone;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCell() {
        return cell;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void displayCustomer() {
        System.out.println("--------------------------------");
        System.out.println("Customer Information");
        System.out.println("--------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Cell: " + cell);
        System.out.println("Phone: " + phone);
        System.out.println("--------------------------------");
    }


    public static void main(String[] args) {

        Customer c1 = new Customer(
                101,
                "Rahim",
                "01700000000",
                "02-9876543"
        );

        c1.displayCustomer();

        Customer c2 = new Customer();

        c2.setId(102);
        c2.setName("Karim");
        c2.setCell("01800000000");
        c2.setPhone("02-1234567");

        System.out.println("\nSecond Customer:");
        c2.displayCustomer();

        System.out.println("\nUsing Getter Methods:");
        System.out.println("Customer ID: " + c1.getId());
        System.out.println("Customer Name: " + c1.getName());
        System.out.println("Customer Cell: " + c1.getCell());
        System.out.println("Customer Phone: " + c1.getPhone());
    }
}
