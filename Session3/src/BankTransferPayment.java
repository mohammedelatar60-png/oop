import java.time.LocalDate;

public class BankTransferPayment extends Payment {

    private String accountNumber;

    public BankTransferPayment(
            int paymentId,
            double amount,
            LocalDate paymentDate,
            String accountNumber) {

        super(paymentId, amount, paymentDate);
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Verifying bank account...");

        if (accountNumber != null && !accountNumber.isEmpty()) {
            setPaymentStatus("Completed");
            System.out.println("Bank transfer processed successfully.");
        } else {
            setPaymentStatus("Failed");
            System.out.println("Invalid bank account.");
        }
    }
}