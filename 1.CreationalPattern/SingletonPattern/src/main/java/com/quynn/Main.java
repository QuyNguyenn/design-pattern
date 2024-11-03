package com.quynn;

import com.quynn.model.LazyInitThreadSafeFlower;
import com.quynn.model.LazyInitThreadSafeOptimizeCar;
import com.quynn.model.SingletonBook;
import com.quynn.model.LazyInitCat;

public class Main {

    public static void main(String[] args) {
        System.out.println(SingletonBook.getInstance());
        System.out.println(LazyInitCat.getInstance());
        System.out.println(LazyInitThreadSafeFlower.getInstance());
        System.out.println(LazyInitThreadSafeOptimizeCar.getInstance());
    }
}
