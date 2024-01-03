public class Main {
    public static void main(String[] args) {
        FashionWorldWebsite fashionWorld = new FashionWorldWebsite();

        String lizzaEmail = "lizza0469@gmail.com";
        Observer lizza = new EmailNotification(lizzaEmail);
        fashionWorld.registerObserver(lizza);

        fashionWorld.setRedDressAvailability(true);
    }
}