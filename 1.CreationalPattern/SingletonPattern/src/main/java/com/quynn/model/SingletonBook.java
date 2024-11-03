package com.quynn.model;

public class SingletonBook {

    private static final SingletonBook INSTANCE;

    private String name = "Into The Wild";

    static {
        INSTANCE = new SingletonBook();
    }

    private SingletonBook() {
    }

    public static SingletonBook getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SingletonBook{" +
                "name='" + name + '\'' +
                '}';
    }
}
