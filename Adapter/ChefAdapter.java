package Adapter;

import Strategy.CookingStrategy;

public class ChefAdapter implements Order {
    private Chef2 chef;
    private String dish;

    public ChefAdapter(Chef2 chef, String dish) {
        this.chef = chef;
        this.dish = dish;
    }

    @Override
    public void placeOrder() {
        chef.cookDish(dish);
    }
}