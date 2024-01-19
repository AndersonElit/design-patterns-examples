package factory.notificationsystem.impls;

import factory.notificationsystem.Notification;

public class SMS implements Notification {
    @Override
    public void send() {
        System.out.println("sending text message.");
    }
}
