package com.example;

public class Main {
    public static void main(String[] args){
        Students aStudents = new Students();
        Student student1 = new Student("Alberto", "Ayza", 36592920, 1);
        Student student2 = new Student("Sofia", "Larras", 31482472, 2);
        Student student3 = new Student("Pepe", "Castor", 34728472, 3);

        aStudents.addStudent(student1);
        aStudents.addStudent(student2);
        aStudents.addStudent(student3);

        String strStudents = aStudents.seeStudents();
        System.out.println(strStudents);
    }
}
