package com.quynn.creator;

import com.quynn.model.Car;
import com.quynn.model.Transportation;

public class CarCreator implements TransportationCreator {
    @Override
    public Transportation createTransportation() {
        return new Car();
    }
}
