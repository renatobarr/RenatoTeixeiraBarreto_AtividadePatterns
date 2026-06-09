package org.example.strategy;

public class FixedDiscount implements DiscountStrategy {
    private final double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double subtotal) {
        // Garante que o total não fique negativo
        return Math.max(0, subtotal - amount);
    }
}
