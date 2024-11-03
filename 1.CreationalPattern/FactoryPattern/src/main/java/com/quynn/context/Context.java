package com.quynn.context;

import java.util.List;

public interface Context {
    Object getBean(Class<?> type);
    Object getBean(String name);
    void putBean(Class<?> type, Object bean);
    void putBean(String name, Object bean);
    boolean isBeanExists(Class<?> type);
    boolean isBeanExists(String name);
}
