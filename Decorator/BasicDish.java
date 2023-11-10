package Decorator;

public class BasicDish implements Dish {
    @Override
    public String getDescription() {
        return "Basic Dish";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
