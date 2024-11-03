package com.quynn;

import com.quynn.model.StudentV1;
import com.quynn.model.StudentV2;
import com.quynn.model.impl.StudentV1Impl;
import com.quynn.model.impl.StudentV2Adapter;

public class Main {

    public static void main(String[] args) {
        StudentV1 studentV1 = new StudentV1Impl("Nguyen Ngoc Quy");
        StudentV2 studentV2 = new  StudentV2Adapter(studentV1);

        System.out.println(studentV1);
        System.out.println(studentV2);
    }
}
