package com.quynn;

import com.quynn.model.Connector;
import com.quynn.model.bridge.impl.*;

public class Main {

    public static void main(String[] args) {
        Connector connector = ConnectorImpl.Builder()
                .connectType(new Wireless())
                .driver(new QualcommDriver())
                .protocol(new HttpProtocol())
                .address(new IpAddress())
                .build();

        connector.connect();
        connector.disconnect();
    }
}
