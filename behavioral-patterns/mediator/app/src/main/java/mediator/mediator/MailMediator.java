package mediator.mediator;

import mediator.comunicator.MailComunicator;

public interface MailMediator {
    void sendMessage(String message, MailComunicator comunicator);
}
