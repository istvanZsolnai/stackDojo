package com.codecool.stackdojo;

import com.codecool.stackdojo.stack.Stack;

public class Main {
    public static void main(String[] args) {


        Stack intStack = new Stack(5);
        intStack.push(2);
        intStack.push(3);
        intStack.push(35);
        intStack.push(32);
        intStack.push(5);
        //
        intStack.size();
        intStack.showAll();
        intStack.pop();
        intStack.pop();
        intStack.pop();
        intStack.pop();
        intStack.showAll();

    }
}
