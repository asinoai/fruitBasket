package com.helloit.main;

/**
 */

public class PriceCalculator {

    public double calculatePrice(final Basket basket) {

        double result = .0;

        for(final Fruit fruit: basket.getFruits()) {
            result += fruit.getPrice();
        }

        return result;
    }

}
