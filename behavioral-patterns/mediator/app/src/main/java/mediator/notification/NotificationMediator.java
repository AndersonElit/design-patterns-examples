package mediator.notification;

import mediator.comunicator.MailComunicator;
import mediator.mediator.MailMediator;

import java.util.ArrayList;
import java.util.List;

public class NotificationMediator implements MailMediator {

    private final List<MailComunicator> comunicators;

    public NotificationMediator() {
        this.comunicators = new ArrayList<>();
    }

    public void addComunicator(MailComunicator comunicator) {
        comunicators.add(comunicator);
    }

    @Override
    public void sendMessage(String message, MailComunicator comunicator) {
        for (MailComunicator com : comunicators) {
            if (com != comunicator) {
                com.receiveMessage(message);
            }
        }
    }
}
