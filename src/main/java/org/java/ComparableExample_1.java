package org.java;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample_1 {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(22,"manasa"));
        studentList.add(new Student(24,"ram"));
        studentList.add(new Student(21,"vams"));
        Collections.sort(studentList);
        System.out.println(studentList);
    }
}

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Student that) {
        return this.age> that.age?1:-1;
    }
}
