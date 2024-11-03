package com.quynn.context.impl;

import com.quynn.context.Context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlobalContext implements Context {
    private final Map<Object, Object> context = new HashMap<>();

    @Override
    public Object getBean(Class<?> type) {
        return context.get(type);
    }

    @Override
    public Object getBean(String name) {
        return context.get(name);
    }

    @Override
    public void putBean(Class<?> type, Object bean) {
        context.put(type, bean);
    }

    @Override
    public void putBean(String name, Object bean) {
        context.put(name, bean);
    }

    @Override
    public boolean isBeanExists(Class<?> type) {
        return context.containsKey(type);
    }

    @Override
    public boolean isBeanExists(String name) {
        return context.containsKey(name);
    }
}
