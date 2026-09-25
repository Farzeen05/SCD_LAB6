package com.university.lab.scd_lab6;

public interface StudentCollection {
    void addStudent(Student student);
    boolean removeStudent(int id);
    Student findStudent(int id);
    int getSize();
    boolean isEmpty();
}