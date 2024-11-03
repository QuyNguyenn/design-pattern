package com.quynn.model.bridge.impl;

import com.quynn.model.bridge.Address;

public class IpAddress implements Address {

    @Override
    public String getAddress() {
        return "192.168.0.1";
    }
}
