package be.ac.umons;

import java.util.ArrayList;
import java.util.List;

public class lowStockChannel implements Subject {

    private List<Observer> observers;
    private String notification;


    public lowStockChannel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) {
            throw new NullPointerException("The observer passed is null");
        }
        if (!observers.contains(obj))
            observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        if (obj == null) {
            throw new NullPointerException("The observer passed is null");
        }
        if (observers.contains(obj))
            observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.notification;
    }

    public void lowStockAlert(String ingredient) {
        System.out.println("\nLe stock de : " + ingredient + " est tombé à zéro\n");
        this.notification = ingredient;
        notifyObservers();
    }
}
