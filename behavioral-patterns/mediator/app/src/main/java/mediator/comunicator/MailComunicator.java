package mediator.comunicator;

import mediator.mediator.MailMediator;

public abstract class MailComunicator {
    protected MailMediator mediator;

    public MailComunicator(MailMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receiveMessage(String message);
    public abstract void sendMessage(String message);

}
