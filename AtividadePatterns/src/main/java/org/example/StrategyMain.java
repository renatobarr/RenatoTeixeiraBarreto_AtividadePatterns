package org.example;

import org.example.strategy.Cart;
import org.example.strategy.FixedDiscount;
import org.example.strategy.NoDiscount;
import org.example.strategy.PercentageDiscount;

public class StrategyMain {
    public static void main(String[] args) {
        double subtotal = 200.0;

        // Sem desconto
        Cart cart = new Cart(subtotal, new NoDiscount());
        System.out.println("Total (sem desconto): " + cart.total());

        // Troca para 10%
        cart.setDiscountStrategy(new PercentageDiscount(10));
        System.out.println("Total (10%): " + cart.total());

        // Troca para -20 fixo
        cart.setDiscountStrategy(new FixedDiscount(20));
        System.out.println("Total (-20): " + cart.total());
    }
}
