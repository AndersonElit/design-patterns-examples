package example.creditcardsystem.factories.paymentnetwork.factory;

import example.creditcardsystem.factories.paymentnetwork.PaymentNetworkType;
import example.creditcardsystem.utils.InstancesUtil;

@FunctionalInterface
public interface PaymentNetworkTypeFactory {
    String type();
    default PaymentNetworkType getPaymentNetworkType() {
        return InstancesUtil.PaymentNetworkTypes.getPaymentNetworkType(type());
    }
}
