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

        Assert.assertEquals("Cherry name checking", CHERRY_TAG, fruit.getName());
    }

}
