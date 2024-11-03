package com.quynn.model;

public class Trunk implements Transportation {
    @Override
    public void run() {
        System.out.printf("Trunk is running...");
    }
}
