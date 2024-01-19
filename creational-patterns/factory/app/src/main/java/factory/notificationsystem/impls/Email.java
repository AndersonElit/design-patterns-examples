package factory.notificationsystem.impls;

import factory.notificationsystem.Notification;

public class Email implements Notification {
    @Override
    public void send() {
        System.out.println("Sending email.");
    }
}
