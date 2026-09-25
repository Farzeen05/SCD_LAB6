package com.university.lab.scd_lab6;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class AbstractionDemo {
    public static void main(String[] args) {
        // 1. Declare list variable depending on the List interface (abstraction)
        List<String> students;

        // 2. Instantiate as ArrayList and add student "Ali"
        students = new ArrayList<>();
        students.add("Ali");
        System.out.println("ArrayList Implementation: " + students.get(0));

        // 3. Reassign the exact same variable as LinkedList and add a student
        students = new LinkedList<>();
        students.add("Ahmad");
        System.out.println("LinkedList Implementation: " + students.get(0));
    }
}