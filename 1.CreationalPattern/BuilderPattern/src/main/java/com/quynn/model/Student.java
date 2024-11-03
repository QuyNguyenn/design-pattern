package com.quynn.model;

import com.quynn.constant.Gender;

import java.time.LocalDate;

public class Student {

    private String name;
    private Gender gender;
    private short age;
    private String address;
    private LocalDate dob;

    public Student(String name, Gender gender, short age, String address, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public static Builder Builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private Gender gender;
        private short age;
        private String address;
        private LocalDate dob;

        public Student build() {
            return new Student(name, gender, age, address, dob);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(short age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder dob(LocalDate dob) {
            this.dob = dob;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                '}';
    }
}
