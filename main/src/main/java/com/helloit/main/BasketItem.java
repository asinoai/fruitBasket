package com.helloit.main;

import java.util.Objects;

/**
 */
public class BasketItem implements Cloneable {
    private final String name;

    public BasketItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public BasketItem clone() throws CloneNotSupportedException {
        return (BasketItem) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketItem that = (BasketItem) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "BasketItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
