import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customerList = null;

    public Bank() {
        this.customerList = new ArrayList<>();
    }


    public void allCustomers() {
        for (Customer c : customerList) {
            printCustomer(c);
        }
    }

    public void addCustomer(String id, String name) {
        Customer c = getCustomer(id);
        if (c != null) {
            System.out.println("Customer is existed !");
            return;
        }

        customerList.add(new Customer(id, name));
        System.out.println("Add Customer is successfully !");
    }

    public Customer getCustomer(String id) {
        for (Customer c : customerList)
            if (c.id().equalsIgnoreCase(id)) return c;

        System.out.println("Customer not found !");
        return null;
    }

    public void addTransaction(String id, double deposit) {
        Customer c = getCustomer(id);
        if (c == null) return;

        c.transactions().add(deposit);
        printCustomer(c);
    }

    public void printCustomer(Customer c) {
        System.out.println(c);
        System.out.println("Transactions:");
        c.transactions().forEach(item -> {
            System.out.printf("\n$%10.2f%10s", item, item < 0 ? "(Debit)" : "(Credit)");
        });
    }

    public void searchCustomer(String id) {
        Customer c = getCustomer(id);
        if (c == null) return;

        printCustomer(c);
    }


}
