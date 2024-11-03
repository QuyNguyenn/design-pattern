package com.quynn.model.impl;

import com.quynn.model.StudentV1;

public class StudentV1Impl implements StudentV1 {

    private String name;

    public StudentV1Impl() {
    }

    public StudentV1Impl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentV1{" +
                "name='" + name + '\'' +
                '}';
    }
}
