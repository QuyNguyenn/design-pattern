package com.quynn.model;

import java.util.Objects;

public class LazyInitThreadSafeFlower {

    private static LazyInitThreadSafeFlower instance;

    private String name = "Rose";

    private LazyInitThreadSafeFlower() {
    }

    public synchronized static LazyInitThreadSafeFlower getInstance() {
        if (Objects.isNull(instance))
            instance = new LazyInitThreadSafeFlower();

        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LazyInitThreadSafeFlower{" +
                "name='" + name + '\'' +
                '}';
    }
}
