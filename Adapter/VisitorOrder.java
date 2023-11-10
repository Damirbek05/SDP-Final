package Adapter;

import Adapter.Order;

public class VisitorOrder implements Order {
    private String dish;

    public VisitorOrder(String dish) {
        this.dish = dish;
    }

    @Override
    public void placeOrder() {
        System.out.println("Placing order for " + dish);
    }
}