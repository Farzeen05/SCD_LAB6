package com.university.lab.scd_lab6;

public class ArrayStack {
    private int[] data;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayStack() {
        data = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(int element) {
        if (top == data.length - 1) {
            throw new StackOverflowError("Stack is full");
        }
        data[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}