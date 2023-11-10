package Strategy;

import Strategy.CookingStrategy;

public class FryingStrategy implements CookingStrategy {
    @Override
    public void cook(String dish) {
        System.out.println("Frying " + dish);
    }
}