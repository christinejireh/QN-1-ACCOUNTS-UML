public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");

        SavingsAccount savings = new SavingsAccount("SAV001", 500000.0, 12.5);
        CurrentAccount current = new CurrentAccount("CUR001", 200000.0, 50000.0);

        customer.addAccount(savings);
        customer.addAccount(current);

        savings.deposit(100000.0);
        current.withdraw(220000.0);   // Uses overdraft

        System.out.println(savings.generateStatement());
        System.out.println(current.generateStatement());
        System.out.println("Total Worth: UGX " + customer.totalWorth());
    }
}