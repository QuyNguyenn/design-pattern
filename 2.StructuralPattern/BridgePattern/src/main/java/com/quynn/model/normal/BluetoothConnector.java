package com.quynn.model.normal;

import com.quynn.model.Connector;

public class BluetoothConnector implements Connector {

    @Override
    public boolean connect() {
        System.out.println("Bluetooth is connected");
        return true;
    }

    @Override
    public void disconnect() {
        System.out.println("Bluetooth is disconnected");
    }
}
