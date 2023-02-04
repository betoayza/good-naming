package com.example;

public class Student {
    private String name;
    private String lastName;
    private int dni;
    private int code;

    public Student(String name, String lastName, int dni, int code){
        this.name=name;
        this.lastName=lastName;
        this.dni=dni;
        this.code=code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "STUDENT DATA:\n" +
                "Name: '" + name + '\n' +
                "Lastname: '" + lastName + '\n' +
                "Dni: " + dni + "\n" +
                "Code: " + code + "\n";
    }
}
