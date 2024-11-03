package com.quynn.configuration;

import java.util.List;
import java.util.Map;

public interface ApplicationConfiguration {
    Map<String, Object> getProperties();
    Object getProperty(String key);
}
