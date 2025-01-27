public abstract class Notification {
    public abstract void send(String message);
}

class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}

class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }
}

public class Problem7 {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        email.send("Hello via Email!");
        sms.send("Hello via SMS!");
    }
}