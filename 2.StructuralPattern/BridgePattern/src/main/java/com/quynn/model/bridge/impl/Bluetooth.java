package com.quynn.model.bridge.impl;

import com.quynn.model.bridge.ConnectType;

public class Bluetooth implements ConnectType {

    @Override
    public String getName() {
        return "Bluetooth";
    }
}
