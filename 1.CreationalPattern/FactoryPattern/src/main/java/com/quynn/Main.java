package com.quynn;

import com.quynn.configuration.ApplicationConfiguration;
import com.quynn.configuration.ConfigurationLoader;
import com.quynn.context.impl.ApplicationContextHolder;
import com.quynn.creator.CarCreator;
import com.quynn.creator.TransportationCreator;

import java.util.Objects;

public class Main {

    static {
        ApplicationContextHolder.getGlobalContext()
                .putBean(ApplicationConfiguration.class, ConfigurationLoader.loadConfig());
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ApplicationConfiguration applicationConfiguration = (ApplicationConfiguration) ApplicationContextHolder
                .getGlobalContext()
                .getBean(ApplicationConfiguration.class);

        String transportationType = (String) applicationConfiguration
                .getProperty("com.quynn.config.transportation.creator");

        TransportationCreator creator;

        if (Objects.isNull(transportationType)) {
            creator = new CarCreator();
        }
        else {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            Class creatorType = classLoader.loadClass(transportationType);
            creator = (TransportationCreator) creatorType.newInstance();
        }

        creator.createTransportation().run();
    }
}
