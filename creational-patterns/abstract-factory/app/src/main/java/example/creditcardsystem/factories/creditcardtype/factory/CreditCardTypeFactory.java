package example.creditcardsystem.factories.creditcardtype.factory;

import example.creditcardsystem.factories.creditcardtype.CreditCardType;
import example.creditcardsystem.utils.InstancesUtil;

@FunctionalInterface
public interface CreditCardTypeFactory {
    String type();
    default CreditCardType getCreditCardType() {
        return InstancesUtil.CreditCardTypes.getCreditCardType(type());
    }
}
