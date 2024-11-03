package com.quynn.model.impl;

import com.quynn.model.UrlNode;
import com.quynn.model.UrlTree;

import java.util.List;

public class UrlTreeImpl implements UrlTree {

    private UrlNode urlNode;

    public UrlTreeImpl(UrlNode urlNode) {
        this.urlNode = urlNode;
    }

    @Override
    public UrlNode getUrlNode() {
        return urlNode;
    }

    @Override
    public Object setData(String path, Object data) {
        return urlNode.setData(path, data);
    }

    @Override
    public Object getData(String path) {
        return urlNode.getData(path);
    }

    @Override
    public boolean haveData(String path) {
        return urlNode.haveData(path);
    }

    @Override
    public List<String> getAllPaths() {
        return urlNode.getPaths();
    }
}
