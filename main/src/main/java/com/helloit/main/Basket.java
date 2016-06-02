package com.helloit.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 */
public class Basket {

    private final List<Fruit> fruits;

    public Basket() {
        fruits = new ArrayList<Fruit>();
    }

    public void addFruit(final Fruit fruit) {
        fruits.add(fruit);
    }

    public void removeFruit(final int index) {
        fruits.remove(index);
    }

    public List<Fruit> getFruits() {
        return Collections.unmodifiableList(fruits);
    }

    public void setFruits(final List<Fruit> fruitsToAdd) {
        fruits.clear();
        fruits.addAll(fruitsToAdd);
    }
}
