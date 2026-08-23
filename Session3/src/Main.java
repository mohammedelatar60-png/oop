import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Payment creditCardPayment = new CreditCardPayment(
                1001,
                1500.00,
                LocalDate.now(),
                "1234567890123456"
        );

        Payment paypalPayment = new PayPalPayment(
                1002,
                750.50,
                LocalDate.now(),
                "customer@gmail.com"
        );

        Payment bankTransferPayment = new BankTransferPayment(
                1003,
                2500.00,
                LocalDate.now(),
                "BANK123456"
        );

        Payment cashPayment = new CashOnDeliveryPayment(
                1004,
                900.00,
                LocalDate.now()
        );

        PaymentProcessor processor = new PaymentProcessor();

        processor.process(creditCardPayment);
        processor.process(paypalPayment);
        processor.process(bankTransferPayment);
        processor.process(cashPayment);
    }
}