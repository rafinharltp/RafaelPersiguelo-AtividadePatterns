package factory_method;

public class Main {
    public static void main(String[] args) {
        String message = "Bem-vindo ao sistema!";

        NotificationService emailService = new NotificationService(new EmailNotificationFactory());
        emailService.notify(message);

        NotificationService smsService = new NotificationService(new SMSNotificationFactory());
        smsService.notify(message);

        NotificationService pushService = new NotificationService(new PushNotificationFactory());
        pushService.notify(message);
    }
}