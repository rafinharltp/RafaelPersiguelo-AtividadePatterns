package factory_method;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
