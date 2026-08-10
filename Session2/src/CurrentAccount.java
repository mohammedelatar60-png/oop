public class CurrentAccount extends BankAccount2 {

    private static final double OVERDRAFT_LIMIT = 1000.0;

    public CurrentAccount(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (getBalance() - amount >= -OVERDRAFT_LIMIT) {
            setBalance(getBalance() - amount);
            System.out.println("Current withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
            System.out.println("Overdraft limit is " + OVERDRAFT_LIMIT);
        }
    }

    @Override
    public String toString() {
        return "Account Type: Current Account\n" + super.toString();
    }
}