package com.quynn;

import com.quynn.constant.Gender;
import com.quynn.model.Student;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student = Student.Builder()
                .name("Nguyen Ngoc Quy")
                .gender(Gender.MALE)
                .age((short) 25)
                .address("HCM")
                .dob(LocalDate.of(1997, 6, 22))
                .build();

        System.out.println(student);
    }
}
