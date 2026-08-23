import java.time.LocalDate;

public class PayPalPayment extends Payment {

    private String email;

    public PayPalPayment(
            int paymentId,
            double amount,
            LocalDate paymentDate,
            String email) {

        super(paymentId, amount, paymentDate);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Connecting to PayPal...");

        if (email != null && email.contains("@")) {
            setPaymentStatus("Completed");
            System.out.println("PayPal payment processed successfully.");
        } else {
            setPaymentStatus("Failed");
            System.out.println("Invalid PayPal account.");
        }
    }
}