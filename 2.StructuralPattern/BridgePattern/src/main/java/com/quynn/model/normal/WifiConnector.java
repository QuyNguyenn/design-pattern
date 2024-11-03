package com.quynn.model.normal;

import com.quynn.model.Connector;

public class WifiConnector implements Connector {

    @Override
    public boolean connect() {
        System.out.println("Wifi is connected");
        return true;
    }

    @Override
    public void disconnect() {
        System.out.println("Wifi is disconnected");
    }
}
