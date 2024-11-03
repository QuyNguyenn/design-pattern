package com.quynn.configuration;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;

public class ApplicationConfigurationImpl implements ApplicationConfiguration {

    private Map<String, Object> properties = new HashMap<>();

    public ApplicationConfigurationImpl() {
    }

    public ApplicationConfigurationImpl(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    @Override
    public Object getProperty(String key) {
        String[] k = key.split("\\.");
        Object value = properties;

        for (int i = 0; i < k.length; i++) {
            value = ((Map) value).get(k[i]);
            if (value == null) {
                return null;
            }
        }

        return value;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ApplicationConfiguration{" +
                "properties=" + properties +
                '}';
    }
}
