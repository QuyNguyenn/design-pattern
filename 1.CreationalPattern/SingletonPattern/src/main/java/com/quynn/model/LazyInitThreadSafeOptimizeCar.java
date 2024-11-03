package com.quynn.model;

import java.util.Objects;

public class LazyInitThreadSafeOptimizeCar {

    private static transient LazyInitThreadSafeOptimizeCar instance;

    private String name = "Bumblebee";

    private LazyInitThreadSafeOptimizeCar() {
    }

    public static LazyInitThreadSafeOptimizeCar getInstance() {
        if (Objects.isNull(instance))
            synchronized (LazyInitThreadSafeOptimizeCar.class) {
                if (Objects.isNull(instance))
                    instance = new LazyInitThreadSafeOptimizeCar();
            }

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
        return "LazyInitThreadSafeOptimizeCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
