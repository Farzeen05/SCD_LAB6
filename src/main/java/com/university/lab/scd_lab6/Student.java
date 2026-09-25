package com.university.lab.scd_lab6;

public class Student {
    // Private fields: internal details hidden from client code
    private int id;
    private String name;
    private double cgpa;

    // Constructor
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter methods to access data safely
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}