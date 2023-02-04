package com.example;

import java.util.ArrayList;

public class Students {
    private ArrayList<Student> aStudents = new ArrayList<Student>();

    public void addStudent(Student student) {
        aStudents.add(student);
    }

    public String seeStudents() {
        return aStudents.toString();
    }
}
