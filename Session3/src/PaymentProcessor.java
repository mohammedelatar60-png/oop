public class PaymentProcessor {

    public void process(Payment payment) {
        System.out.println("\n----------------------------");
        payment.processPayment();
        payment.displayPaymentInfo();
        System.out.println("----------------------------");
    }
}