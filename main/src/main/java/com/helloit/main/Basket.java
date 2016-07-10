package com.helloit.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 */
public class Basket implements Cloneable {

    private final List<Fruit> fruits;

    public Basket() {
        this.fruits = new ArrayList<Fruit>();
    }

    public Basket(final Basket basket) {
        this.fruits = new ArrayList<Fruit>(basket.fruits);
    }

    @Override
    public Basket clone() throws CloneNotSupportedException {
        return (Basket)super.clone();
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
