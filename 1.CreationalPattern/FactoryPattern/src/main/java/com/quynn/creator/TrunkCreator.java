package com.quynn.creator;

import com.quynn.model.Transportation;
import com.quynn.model.Trunk;

public class TrunkCreator implements TransportationCreator {
    @Override
    public Transportation createTransportation() {
        return new Trunk();
    }
}
