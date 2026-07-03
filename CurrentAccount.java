public class CurrentAccount extends Account {
    private double overdraft;

    public CurrentAccount(String accountNo, double opening, double overdraft) {
        super(accountNo, opening);
        this.overdraft = overdraft;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && balance - amount >= -overdraft) {
            balance -= amount;
            return true;
        }
        return false;
    }
}