package com.example.Student_Management_System;

public class Student {
    private int rollNum;
    private String name;
    private String mobileNum;
    private int age;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int rollNum, String name, String mobileNum, int age) {
        this.rollNum = rollNum;
        this.name = name;
        this.mobileNum = mobileNum;
        this.age = age;
    }
}
