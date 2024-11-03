package com.quynn.model.bridge.impl;

import com.quynn.model.bridge.ConnectType;

public class Wireless implements ConnectType {

    @Override
    public String getName() {
        return "Wireless";
    }
}
