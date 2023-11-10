package Decorator;

public class ExtraCheeseDecorator extends DishDecorator {
    public ExtraCheeseDecorator(Dish decoratedDish) {
        super(decoratedDish);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
