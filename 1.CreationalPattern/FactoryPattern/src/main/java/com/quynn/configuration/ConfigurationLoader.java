package com.quynn.configuration;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.Map;

public class ConfigurationLoader {

    private static final String PROPERTIES_PATH = "config.yml";

    private ConfigurationLoader() {
    }

    public static ApplicationConfigurationImpl loadConfig() {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(PROPERTIES_PATH);

        Yaml yaml = new Yaml();
        Map<String, Object> data = yaml.load(inputStream);
        return new ApplicationConfigurationImpl(data);
    }
}
