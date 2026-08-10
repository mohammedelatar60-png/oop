public class SavingsAccount extends BankAccount2 {

    private static final double MINIMUM_BALANCE = 100.0;

    public SavingsAccount(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (getBalance() - amount >= MINIMUM_BALANCE) {
            setBalance(getBalance() - amount);
            System.out.println("Savings withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
            System.out.println("Minimum balance is " + MINIMUM_BALANCE);
        }
    }

    @Override
    public String toString() {
        return "Account Type: Savings Account\n" + super.toString();
    }
}