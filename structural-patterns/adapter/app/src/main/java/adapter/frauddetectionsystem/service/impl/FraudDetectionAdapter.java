package adapter.frauddetectionsystem.service.impl;

import adapter.frauddetectionsystem.client.FraudDetectorClient;
import adapter.frauddetectionsystem.model.Transaction;
import adapter.frauddetectionsystem.service.FraudDetectionService;

public class FraudDetectionAdapter implements FraudDetectionService {

    private final FraudDetectorClient fraudDetectorClient;

    public FraudDetectionAdapter(FraudDetectorClient fraudDetectorClient) {
        this.fraudDetectorClient = fraudDetectorClient;
    }

    @Override
    public String isFraudulent(Transaction transaction) {
        if (fraudDetectorClient.checkAmount(transaction.getAmount())) {
            return "is fraudulent";
        }
        return "Is not fraudulent";
    }
}
