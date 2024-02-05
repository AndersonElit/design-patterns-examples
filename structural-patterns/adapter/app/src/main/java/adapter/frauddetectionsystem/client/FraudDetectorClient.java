package adapter.frauddetectionsystem.client;

public class FraudDetectorClient {
    public Boolean checkAmount(Double amount) {
        if (amount >= 1000.0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
