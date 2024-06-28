public class Main {
    private static int generateID = 0;

    public static void main(String[] args) {
        Bank bank = new Bank();

        generateCustomer(10, bank);
        bank.allCustomers();

        bank.addTransaction("ID-8", -300.00);
        bank.addTransaction("ID-8", 300.00);

        bank.searchCustomer("ID-9");
        bank.searchCustomer("ID-8");
    }


    public static void generateCustomer(int quantityCustomer, Bank bank) {
        for (int i = 0; i < quantityCustomer; i++) {
            bank.addCustomer("ID-" + generateID++, "Customer " + i);
        }
    }
}