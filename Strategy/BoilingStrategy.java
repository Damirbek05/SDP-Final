package Strategy;

public class BoilingStrategy implements CookingStrategy {
    @Override
    public void cook(String dish) {
        System.out.println("Boiling " + dish);
    }
}