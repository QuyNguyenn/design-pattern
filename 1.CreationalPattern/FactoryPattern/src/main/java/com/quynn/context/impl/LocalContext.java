package com.quynn.context.impl;

import com.quynn.context.Context;
import com.quynn.context.ContextHolder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalContext implements Context {

    private static final ThreadLocal<Map<Object, Object>> threadLocalContext = ThreadLocal.withInitial(HashMap::new);

    @Override
    public Object getBean(Class<?> type) {
        return threadLocalContext.get().get(type);
    }

    @Override
    public Object getBean(String name) {
        return threadLocalContext.get().get(name);
    }

    @Override
    public void putBean(Class<?> type, Object bean) {
        threadLocalContext.get().put(type, bean);
    }

    @Override
    public void putBean(String name, Object bean) {
        threadLocalContext.get().put(name, bean);
    }

    @Override
    public boolean isBeanExists(Class<?> type) {
        return threadLocalContext.get().containsKey(type);
    }

    @Override
    public boolean isBeanExists(String name) {
        return threadLocalContext.get().containsKey(name);
    }
}
