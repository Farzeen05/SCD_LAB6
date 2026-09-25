package com.university.lab.scd_lab6;

import java.util.ArrayList;
import java.util.List;

public class StudentCollectionImpl implements StudentCollection {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public boolean removeStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }

    @Override
    public Student findStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    @Override
    public int getSize() {
        return students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }
}