package com.quynn.model.bridge.impl;

import com.quynn.model.Connector;
import com.quynn.model.bridge.Address;
import com.quynn.model.bridge.ConnectType;
import com.quynn.model.bridge.Driver;
import com.quynn.model.bridge.Protocol;

public class ConnectorImpl implements Connector {

    private ConnectType connectType;
    private Driver driver;
    private Protocol protocol;
    private Address address;

    public ConnectorImpl(ConnectType connectType, Driver driver, Protocol protocol, Address address) {
        this.connectType = connectType;
        this.driver = driver;
        this.protocol = protocol;
        this.address = address;
    }

    @Override
    public boolean connect() {
        System.out.println("Connected with:\n" +
                "connectType: " + connectType.getName() + "\n" +
                "driver: " + driver.getName() + "\n" +
                "protocol: " + protocol.getName() + "\n" +
                "address: " + address.getAddress() + "\n");
        return true;
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected with:\n" +
                "connectType: " + connectType.getName() + "\n" +
                "driver: " + driver.getName() + "\n" +
                "protocol: " + protocol.getName() + "\n" +
                "address: " + address.getAddress() + "\n");
    }

    public static Builder Builder() {
        return new Builder();
    }

    public static class Builder {
        private ConnectType connectType;
        private Driver driver;
        private Protocol protocol;
        private Address address;

        public Builder connectType(ConnectType connectType) {
            this.connectType = connectType;
            return this;

        }

        public Builder driver(Driver driver) {
            this.driver = driver;
            return this;

        }

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            return this;

        }

        public Builder address(Address address) {
            this.address = address;
            return this;

        }

        public Connector build() {
            return new ConnectorImpl(connectType, driver, protocol, address);
        }
    }
}
