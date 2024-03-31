package state.state;

public interface State {
    void deposit(double amount);
    void withdraw(double amount);
    void inactive();
}
