package com.quynn.model;

public class Car implements Transportation {
    @Override
    public void run() {
        System.out.println("Car is running...");
    }
}
