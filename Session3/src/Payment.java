import java.time.LocalDate;

public abstract class Payment {

    private int paymentId;
    private double amount;
    private LocalDate paymentDate;
    private String paymentStatus;

    public Payment(int paymentId, double amount, LocalDate paymentDate) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentStatus = "Pending";
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    protected void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public abstract void processPayment();

    public void displayPaymentInfo() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Payment Status: " + paymentStatus);
    }
}