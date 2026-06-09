package org.example.strategy;

public class Cart {
    private final double subtotal;
    private DiscountStrategy strategy;

    public Cart(double subtotal, DiscountStrategy strategy) {
        this.subtotal = subtotal;
        this.strategy = strategy;
    }

    public void setDiscountStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double total() {
        return strategy.apply(subtotal);
    }
}
