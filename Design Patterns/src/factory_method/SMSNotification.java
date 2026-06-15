package factory_method;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMSFactory enviando: \"" + message + "\"");
    }
}
