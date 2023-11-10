package Decorator;

public abstract class DishDecorator implements Dish {
    protected Dish decoratedDish;

    public DishDecorator(Dish decoratedDish) {
        this.decoratedDish = decoratedDish;
    }

    @Override
    public String getDescription() {
        return decoratedDish.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedDish.getCost();
    }
}