package com.helloit.main;


import org.junit.Assert;
import org.junit.Test;

/**
 */
public class FruitTest {

    public static final String CHERRY_TAG = "cherry";

    @Test
    public void simpleTest() {
        Fruit fruit = new Fruit("cherry", 6.5);

        Fruit anotherFruit = new Fruit("cherry", 6.5);

        boolean equals = fruit.equals(anotherFruit);

        Assert.assertEquals("Cherry name checking", CHERRY_TAG, fruit.getName());
    }


    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Fruit fruit = new Fruit("cherry");

        final String name = "Object = " + fruit;

        Fruit cloned = fruit.clone();
    }
}
