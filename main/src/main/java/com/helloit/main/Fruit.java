package com.helloit.main;

/**
 */

public class Fruit {

    private final String name;
    private final double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
