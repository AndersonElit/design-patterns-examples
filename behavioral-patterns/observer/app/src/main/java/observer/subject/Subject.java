package observer.subject;

import observer.observer.Observer;

public interface Subject {
    void register(Observer observer);
    void remove(Observer observer);
    void notifyObs();
}
