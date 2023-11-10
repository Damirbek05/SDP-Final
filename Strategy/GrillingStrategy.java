package Strategy;

import Strategy.CookingStrategy;

public class GrillingStrategy implements CookingStrategy {
    @Override
    public void cook(String dish) {
        System.out.println("Grilling " + dish);
    }
}