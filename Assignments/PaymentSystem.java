// Interface 1: Payment Contract
interface Payable {
    void processPayment(double amount);
    String getPaymentStatus();
    void refundPayment(double amount);
}

// Interface 2: Tax Contract
interface Taxable {
    double calculateTax();
    void generateTaxInvoice();
}

// Interface 3: Logging Contract
interface Loggable {
    void logActivity(String action);
}

//--------------------------------------------------
// Credit Card Payment
//--------------------------------------------------
class CreditCardPayment implements Payable, Taxable, Loggable {

    private String cardNumber;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        status = "SUCCESS";
        System.out.println("\nCredit Card Payment of ₹" + amount + " processed.");
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        status = "REFUNDED";
        System.out.println("Refunded ₹" + amount + " to Credit Card.");
    }

    @Override
    public double calculateTax() {
        tax = amount * 0.18;
        return tax;
    }

    @Override
    public void generateTaxInvoice() {
        System.out.println("Credit Card Tax Invoice");
        System.out.println("Amount : ₹" + amount);
        System.out.println("GST(18%): ₹" + tax);
    }

    @Override
    public void logActivity(String action) {
        System.out.println("LOG : " + action);
    }
}

//--------------------------------------------------
// PayPal Payment
//--------------------------------------------------
class PayPalPayment implements Payable, Taxable, Loggable {

    private String email;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        status = "SUCCESS";
        System.out.println("\nPayPal Payment of ₹" + amount + " processed.");
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        status = "REFUNDED";
        System.out.println("Refunded ₹" + amount + " to PayPal Account.");
    }

    @Override
    public double calculateTax() {
        tax = amount * 0.10;
        return tax;
    }

    @Override
    public void generateTaxInvoice() {
        System.out.println("PayPal Tax Invoice");
        System.out.println("Amount : ₹" + amount);
        System.out.println("Tax(10%): ₹" + tax);
    }

    @Override
    public void logActivity(String action) {
        System.out.println("LOG : " + action);
    }
}

//--------------------------------------------------
// UPI Payment
//--------------------------------------------------
class UPIPayment implements Payable, Taxable, Loggable {

    private String upiId;
    private String status = "PENDING";
    private double amount;
    private double tax;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        this.amount = amount;
        status = "SUCCESS";
        System.out.println("\nUPI Payment of ₹" + amount + " processed.");
    }

    @Override
    public String getPaymentStatus() {
        return status;
    }

    @Override
    public void refundPayment(double amount) {
        status = "REFUNDED";
        System.out.println("Refunded ₹" + amount + " to UPI.");
    }

    @Override
    public double calculateTax() {
        tax = amount * 0.05;
        return tax;
    }

    @Override
    public void generateTaxInvoice() {
        System.out.println("UPI Tax Invoice");
        System.out.println("Amount : ₹" + amount);
        System.out.println("Tax(5%): ₹" + tax);
    }

    @Override
    public void logActivity(String action) {
        System.out.println("LOG : " + action);
    }
}

//--------------------------------------------------
// Main Class
//--------------------------------------------------
public class PaymentSystem {

    public static void main(String[] args) {

        CreditCardPayment card = new CreditCardPayment("1234-5678-9876");
        card.processPayment(5000);
        System.out.println("Status : " + card.getPaymentStatus());
        System.out.println("Tax : ₹" + card.calculateTax());
        card.generateTaxInvoice();
        card.logActivity("Credit Card Payment Completed");
        card.refundPayment(1000);

        System.out.println("--------------------------------");

        PayPalPayment paypal = new PayPalPayment("user@gmail.com");
        paypal.processPayment(3000);
        System.out.println("Status : " + paypal.getPaymentStatus());
        System.out.println("Tax : ₹" + paypal.calculateTax());
        paypal.generateTaxInvoice();
        paypal.logActivity("PayPal Payment Completed");
        paypal.refundPayment(500);

        System.out.println("--------------------------------");

        UPIPayment upi = new UPIPayment("spandana@oksbi");
        upi.processPayment(2000);
        System.out.println("Status : " + upi.getPaymentStatus());
        System.out.println("Tax : ₹" + upi.calculateTax());
        upi.generateTaxInvoice();
        upi.logActivity("UPI Payment Completed");
        upi.refundPayment(300);
    }
}