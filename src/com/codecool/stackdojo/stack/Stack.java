package com.codecool.stackdojo.stack;

import java.util.Arrays;

public class Stack {

    private int stackSize;

    private int stack[];

    private static int top = -1;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        stack = new int[stackSize];
    }

    public void push (int data) {
        if (isFull())  {
            throw new RuntimeException("Stack Overflow");
        }
        System.out.println("Putting " + data + " into the stack");
        stack[++top] = data;

    }

    public void showAll(){
        for (int item: stack) {
            System.out.println(item);
            
        }
    }

    public int size(){
        int actualSizeOfStack = 0;

        for (int item:stack
             ) {actualSizeOfStack++;

        }
        return actualSizeOfStack;
    }

    public int pop(){
        int data;
        if (isEmpty()){
            throw new RuntimeException("Stack Underflow");
        } else {
        data = stack[top];

        stack[top--] = 0;
        System.out.println("===POPPING:===");
        System.out.println(data);}
        System.out.println("--------------");
        return data;

    }

    public int peek(){
        int data;
        data = stack[top - 1];
        return data;
    }

    public boolean isFull(){
        return  top == stackSize - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
