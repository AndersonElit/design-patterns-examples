package factory.notificationsystem.factory;

import factory.notificationsystem.Notification;
import factory.notificationsystem.utils.Instances;

@FunctionalInterface
public interface NotificationFactory {
    String type();

    static Notification getNotificationInstance(String type) {
        return Instances.NotificationTypes.getNotificationType(type);
    }

}
