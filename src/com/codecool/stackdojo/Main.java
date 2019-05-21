package com.codecool.stackdojo;

public class Main {
    public static void main(String[] args) {

        Stack intStack = new Stack();
        intStack.push(2);
        intStack.push(3);
        intStack.push(35);
        intStack.push(32);
        intStack.push(5);

        System.out.println(intStack);

        intStack.pop();
        intStack.pop();
        intStack.pop();
        System.out.println(intStack);
        System.out.println(intStack.peek());
        System.out.println(intStack.peek());

        intStack.showAll();

    }
}
