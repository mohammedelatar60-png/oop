import java.time.LocalDate;

public class CreditCardPayment extends Payment {

    private String cardNumber;

    public CreditCardPayment(
            int paymentId,
            double amount,
            LocalDate paymentDate,
            String cardNumber) {

        super(paymentId, amount, paymentDate);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Validating credit card...");

        if (cardNumber != null && cardNumber.length() >= 16) {
            setPaymentStatus("Completed");
            System.out.println("Credit Card payment processed successfully.");
        } else {
            setPaymentStatus("Failed");
            System.out.println("Invalid credit card.");
        }
    }
}