package com.quynn.model;

import java.util.List;

public interface UrlTree {
    UrlNode getUrlNode();
    Object setData(String path, Object data);
    Object getData(String path);
    boolean haveData(String path);
    List<String> getAllPaths();
}
