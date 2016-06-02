package com.helloit.main;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 */
public class PriceCalculatorTest {


    @Test
    public void testCalculate() {
        final PriceCalculator calculator = new PriceCalculator();

        final Basket basket = new Basket();
        basket.addFruit(new Fruit("apple", 3.1));
        basket.addFruit(new Fruit("banana", 5.2));

        final double price = calculator.calculatePrice(basket);
        Assert.assertEquals("Calculated price checking!", 8.3, price, .0);

        basket.setFruits(Collections.singletonList(new Fruit("orange", 10)));
        final double newPrice = calculator.calculatePrice(basket);
        Assert.assertEquals("Calculated new price checking!", 10, newPrice, .0);

        basket.removeFruit(0);
        final double newerPrice = calculator.calculatePrice(basket);
        Assert.assertEquals("Calculated new price checking!", .0, newerPrice, .0);


    }

}
