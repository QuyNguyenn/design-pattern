package com.quynn.context.impl;

import com.quynn.context.Context;

public class ApplicationContextHolder {

    private static Context globalContext;
    private static Context localContext;

    static {
        initialize();
    }

    private ApplicationContextHolder() {
    }

    private static void initialize() {
        globalContext = new GlobalContext();
        localContext = new LocalContext();
    }

    public static Context getGlobalContext() {
        return globalContext;
    }

    public static Context getLocalContext() {
        return localContext;
    }
}
