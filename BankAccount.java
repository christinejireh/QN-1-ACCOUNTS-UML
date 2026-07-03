public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available: " + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}