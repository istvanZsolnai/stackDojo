package com.codecool.stackdojo;

import java.util.Arrays;

public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push (int data){

        stack[top] = data;
        top++;

    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
