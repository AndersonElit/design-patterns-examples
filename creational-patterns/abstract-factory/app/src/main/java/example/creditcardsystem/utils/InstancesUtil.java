package example.creditcardsystem.utils;

import example.creditcardsystem.factories.creditcardtype.CreditCardType;
import example.creditcardsystem.factories.creditcardtype.impl.Gold;
import example.creditcardsystem.factories.creditcardtype.impl.Platinum;
import example.creditcardsystem.factories.creditcardtype.impl.Standard;
import example.creditcardsystem.factories.paymentnetwork.PaymentNetworkType;
import example.creditcardsystem.factories.paymentnetwork.impl.Mastercard;
import example.creditcardsystem.factories.paymentnetwork.impl.Visa;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InstancesUtil {
    private InstancesUtil() {
    }

    public static final class CreditCardTypes {

        private static final Map<String, CreditCardType> types = new HashMap<>();

        static {
            types.put("Standard", new Standard());
            types.put("Platinum", new Platinum());
            types.put("Gold", new Gold());
        }

        public static CreditCardType getCreditCardType(String type) {
            return Optional.ofNullable(types.get(type))
                    .orElseThrow(() -> new RuntimeException("Type " + type + " not supported."));
        }

    }

    public static final class PaymentNetworkTypes {

        private static final Map<String, PaymentNetworkType> types = new HashMap<>();

        static {
            types.put("Visa", new Visa());
            types.put("Mastercard", new Mastercard());
        }

        public static PaymentNetworkType getPaymentNetworkType(String type) {
            return Optional.ofNullable(types.get(type))
                    .orElseThrow(() -> new RuntimeException("Type " + type + " not supported."));
        }

    }

}
