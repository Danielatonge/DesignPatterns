package LAB11.Adapter.start;

import java.util.HashMap;

public class PaymentGateWay {
    private HashMap<String, PaymentProvider> paymentProviders;

    public PaymentGateWay() {
        paymentProviders = new HashMap<String, PaymentProvider>();
    }

    public void addPaymentProvider(String providerName, PaymentProvider paymentProvider) {
        paymentProviders.put(providerName, paymentProvider);
    }

    public void processPayment(String providerName, String paymentInfo) {

    }

    public void refundPayment(String providerName, String refundInfo) {

    }

    public void verifyPayment(String providerName, String paymentInfo) {

    }
}
