package mediator.customer;

import mediator.comunicator.MailComunicator;
import mediator.mediator.MailMediator;

public class Customer extends MailComunicator {

    public Customer(MailMediator mediator) {
        super(mediator);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }
}
