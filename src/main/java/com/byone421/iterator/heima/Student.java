package com.byone421.iterator.heima;

/**
 * @version v1.0
 * @ClassName: Student
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class Student {
    private String name;
    private String number;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Student() {
    }
}
