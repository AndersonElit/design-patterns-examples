package prototype.transactionproccess;

public interface Transaction {
    public Transaction clone();
    public void process(String state);
}
