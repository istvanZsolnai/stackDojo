package com.codecool.stackdojo;

import java.util.Arrays;

public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push (int data){

        stack[top] = data;
        top++;

    }
    
    public void showAll(){
        for (int item: stack) {
            System.out.println(item);
            
        }
    }

    public int pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
        System.out.println("===POPPING:===");
        System.out.println(data);
        return data;

    }

    public int peek(){
        int data;
        data = stack[top - 1];
        return data;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
