package adapter.frauddetectionsystem.service;

import adapter.frauddetectionsystem.model.Transaction;

public interface FraudDetectionService {
    String isFraudulent(Transaction transaction);
}
