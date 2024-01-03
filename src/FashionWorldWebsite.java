import java.util.ArrayList;
import java.util.List;

public class FashionWorldWebsite implements Subject {
    public final List<Observer> observers = new ArrayList<>();
    private boolean redDressInStock = false;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        if (redDressInStock) {
            for (Observer observer : observers) {
                observer.update("The Red Dress is in stock. You can order it now.");
            }
        }
    }

    public void setRedDressAvailability(boolean available) {
        this.redDressInStock = available;
        if (redDressInStock) {
            notifyObservers();
        }
    }
}
