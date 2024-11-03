package com.quynn.model;

import java.util.List;

public interface UrlNode {
    Object getData(String path);
    Object setData(String path, Object data);
    Object setNodeData(Object data);
    boolean haveData(String path);
    Object getNodeData();
    String getNodePath();
    List<String> getPaths();
}
