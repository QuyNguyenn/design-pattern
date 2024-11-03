package com.quynn.model.bridge.impl;

import com.quynn.model.bridge.Protocol;

public class HttpProtocol implements Protocol {

    @Override
    public String getName() {
        return "Http";
    }
}
