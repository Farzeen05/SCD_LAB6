package com.university.lab.scd_lab6;

public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();

        // Lab Task 1: push(10), push(20), push(30)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Verify that pop() returns 30
        int poppedValue = stack.pop();
        System.out.println("Popped Element: " + poppedValue);

        if (poppedValue == 30) {
            System.out.println("SUCCESS: Stack correctly returned 30 (LIFO)!");
        } else {
            System.out.println("FAILED: Expected 30 but got " + poppedValue);
        }
    }
}