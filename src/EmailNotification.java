
public class EmailNotification implements Observer {
    public String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification sent to " + email + ": " + message);
    }
}
