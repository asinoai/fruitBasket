package com.helloit.main;

import java.util.Objects;

/**
 */

public class Fruit extends BasketItem  {

    private final double price;

    public Fruit(String name, double price) {
        super(name);
        this.price = price;
    }

    public Fruit(String name) {
        this(name, 3.14);
    }

    @Override
    public String getName() {
        return super.getName() + " fruit";
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Fruit clone() throws CloneNotSupportedException {
        return (Fruit) super.clone();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(price, fruit.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "price=" + price +
                "} " + super.toString();
    }
}
