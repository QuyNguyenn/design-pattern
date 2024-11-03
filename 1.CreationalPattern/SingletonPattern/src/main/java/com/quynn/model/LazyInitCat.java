package com.quynn.model;

import java.util.Objects;

public class LazyInitCat {

    private static LazyInitCat instance;

    private String name = "Tom";

    private LazyInitCat() {
    }

    public static LazyInitCat getInstance() {
        if (Objects.isNull(instance))
            instance = new LazyInitCat();

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
        return "LazyInitCat{" +
                "name='" + name + '\'' +
                '}';
    }
}
