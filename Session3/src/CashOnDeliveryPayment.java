import java.time.LocalDate;

public class CashOnDeliveryPayment extends Payment {

    public CashOnDeliveryPayment(
            int paymentId,
            double amount,
            LocalDate paymentDate) {

        super(paymentId, amount, paymentDate);
    }

    @Override
    public void processPayment() {
        setPaymentStatus("Pending");
        System.out.println("Cash on Delivery payment selected.");
        System.out.println("Payment will be completed upon delivery.");
    }
}