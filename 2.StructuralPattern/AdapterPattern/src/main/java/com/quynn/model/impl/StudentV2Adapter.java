package com.quynn.model.impl;

import com.quynn.model.StudentV1;
import com.quynn.model.StudentV2;

import java.util.Objects;

public class StudentV2Adapter implements StudentV2 {

    private StudentV1 studentV1;

    private String firstName;
    private String lastName;

    public StudentV2Adapter(StudentV1 studentV1) {
        if (Objects.isNull(studentV1))
            throw new IllegalArgumentException("Original object is null");

        this.studentV1 = studentV1;

        int firstNameIndex = this.studentV1.getName().lastIndexOf(" ");
        this.firstName = this.studentV1.getName().substring(firstNameIndex + 1);
        this.lastName = this.studentV1.getName().substring(0, firstNameIndex);
    }

    public StudentV1 getOriginal() {
        return studentV1;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "StudentV2Adapter{" +
                "studentV1=" + studentV1 +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
