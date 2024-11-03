package com.quynn;

import com.quynn.model.UrlNode;
import com.quynn.model.UrlTree;
import com.quynn.model.impl.UrlNodeImpl;
import com.quynn.model.impl.UrlTreeImpl;

public class Main {

    public static void main(String[] args) {
        UrlTree urlTree = new UrlTreeImpl(new UrlNodeImpl(""));

        urlTree.setData("/api/v1/students", "All student");
        urlTree.setData("/api/v1/classes", "ALl classes");
        urlTree.setData("/api/v1/classes/1/student", "Student of class 1");
        urlTree.setData("/api/v1/classes/2/student", "Student of class 2");

        urlTree.getAllPaths().forEach(System.out::println);

        System.out.println(urlTree.getData("/api/v1/classes/1/student"));
        System.out.println(urlTree.getData("/api/v1/classes/2/student"));
        System.out.println(urlTree.getData("/api/v1/classes"));
        System.out.println(urlTree.getData("/api/v1/students"));

        System.out.println(urlTree.haveData("/api/v1/classes"));
        System.out.println(urlTree.haveData("/api/v1/classes/1"));
    }
}
