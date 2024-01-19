package factory.notificationsystem.utils;

import factory.notificationsystem.Notification;
import factory.notificationsystem.impls.Email;
import factory.notificationsystem.impls.SMS;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Instances {

    public static class NotificationTypes {

        private static final Map<String, Notification> notifications = new HashMap<>();

        static {
            notifications.put("email", new Email());
            notifications.put("sms", new SMS());
        }

        public static Notification getNotificationType(String type) {
            return Optional.ofNullable(notifications.get(type))
                    .orElseThrow(() -> new RuntimeException("Notification type " + type + " is not supported."));
        }

    }

}
