package Observer;

import java.util.ArrayList;
import java.util.List;

public class Chef implements Observable {
    private List<Observer> observers;
    private String dish;

    public Chef() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void setDish(String dish) {
        this.dish = dish;
        notifyObservers();
    }

    public String getDish() {
        return dish;
    }
}