package LAB11.Adapter.start;

public class Stripe {
    public void chargePayment(String paymentInfo) {
        System.out.println("Processing payment with Stripe: " + paymentInfo);
    }

    public void refundPayment(String refundInfo) {
        System.out.println("Processing refund with Stripe: " + refundInfo);
    }

    public boolean verifyCharge(String paymentInfo) {
        System.out.println("Verifying payment with Stripe: " + paymentInfo);
        return true;
    }
}
