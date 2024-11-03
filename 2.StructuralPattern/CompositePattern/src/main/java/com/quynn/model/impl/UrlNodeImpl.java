package com.quynn.model.impl;

import com.quynn.model.UrlNode;

import java.util.*;

public class UrlNodeImpl implements UrlNode {

    private static final String SEPARATE = "/";

    private String nodePath;
    private Object data;
    private Map<String, UrlNode> nodeMap = new HashMap<>();

    public UrlNodeImpl(String nodePath) {
        this.nodePath = nodePath;
    }

    public UrlNodeImpl(String nodePath, Object data, Map<String, UrlNode> nodeMap) {
        this.nodePath = nodePath;
        this.data = data;
        this.nodeMap = nodeMap;
    }

    @Override
    public Object getData(String path) {
        String first = getFirstPathParam(path);
        String remain = path.replaceFirst(first + SEPARATE, "");
        if (first.equals(nodePath)) {
            if (remain.equals("") || remain.equals(first)) {
                return data;
            }
            else {
                String nextNodePath = getFirstPathParam(remain);
                UrlNode urlNode = nodeMap.get(nextNodePath);
                return urlNode == null ? null : urlNode.getData(remain);
            }
        }
        return null;
    }

    @Override
    public Object setData(String path, Object data) {
        String first = getFirstPathParam(path);
        String remain = path.replaceFirst(first + SEPARATE, "");
        if (first.equals(nodePath)) {
            if (remain.equals("") || remain.equals(first)) {
                return this.data = data;
            }
            else {
                String nextNodePath = getFirstPathParam(remain);
                UrlNode urlNode;
                if (!nodeMap.containsKey(nextNodePath)) {
                    urlNode = new UrlNodeImpl(nextNodePath);
                    nodeMap.put(nextNodePath, urlNode);
                }
                else {
                    urlNode = nodeMap.get(nextNodePath);
                }
                return urlNode.setData(remain, data);
            }
        }
        return null;
    }

    @Override
    public Object setNodeData(Object data) {
        return this.data = data;
    }

    @Override
    public boolean haveData(String path) {
        String first = getFirstPathParam(path);
        String remain = path.replaceFirst(first + SEPARATE, "");
        if (first.equals(nodePath)) {
            if (remain.equals("") || remain.equals(first)) {
                return data != null;
            }
            else {
                String nextNodePath = getFirstPathParam(remain);
                UrlNode urlNode = nodeMap.get(nextNodePath);
                return urlNode != null && urlNode.haveData(remain);
            }
        }
        return false;
    }

    @Override
    public Object getNodeData() {
        return data;
    }

    @Override
    public String getNodePath() {
        return nodePath;
    }

    @Override
    public List<String> getPaths() {
        List<String> paths = new ArrayList<>();
        for (Map.Entry<String, UrlNode> entry : nodeMap.entrySet()) {
            for (String path : entry.getValue().getPaths()) {
                paths.add(String.format("%s%s%s", nodePath, SEPARATE, path));
            }
        }

        if (paths.isEmpty()) {
            paths.add(nodePath);
        }

        return paths;
    }

    private String getFirstPathParam(String path) {
        return Objects.requireNonNull(path).split("/")[0];
    }
}
