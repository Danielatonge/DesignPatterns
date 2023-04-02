package LAB11.Adapter.start;

public class PayPal {
    public void sendPayment(String paymentInfo) {
        System.out.println("Processing payment with PayPal: " + paymentInfo);
    }

    public void issueRefund(String refundInfo) {
        System.out.println("Processing refund with PayPal: " + refundInfo);
    }

    public boolean verifyPayment(String paymentInfo) {
        System.out.println("Verifying payment with PayPal: " + paymentInfo);
        return true;
    }
}