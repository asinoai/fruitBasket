package com.helloit.main;

import org.junit.Test;

/**
 */
public class BasketTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        final Basket basket = new Basket();
        basket.addFruit(new Fruit("apple", 3.1));
        basket.addFruit(new Fruit("banana", 5.2));

        final Basket cloned = new Basket(basket);

        cloned.addFruit(new Fruit("pear", 2.1));
    }

}
