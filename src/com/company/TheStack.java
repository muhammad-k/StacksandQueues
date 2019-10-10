package com.company;

import java.util.Arrays;

public class TheStack {

    private String[] stackArray;
    private int stackSize;

    //-1 represents stack is empty
    private int topOfStack = -1;

    TheStack(int size){
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    public void push(String input){
        if((topOfStack + 1) < stackSize){
            topOfStack++;
            stackArray[topOfStack] = input;
        }
        else
            System.out.println("Sorry but the stack is full!");

        displayTheStack();

        System.out.println("PUSH " + input + " Was added onto the stack");
    }

    //Pass in a string of values separated by a space
    public void pushMany(String multipleValues){
        String[] tempString = multipleValues.split(" ");

        for(int i = 0; i < tempString.length; i++)
            push(tempString[i]);

    }

    public String pop() {
        if (topOfStack >= 0) {
            displayTheStack();

            System.out.println("POP " + stackArray[topOfStack] + " Was removed from the stack");

            stackArray[topOfStack] = "-1";

            return stackArray[topOfStack--];
        }
        else {
            displayTheStack();

            System.out.println("Sorry but the stack is empty");

            return "-1";
        }
    }

    public void popAll(){
        for(int i = topOfStack; i >= 0; i--){
            pop();
        }
    }

    public String peek(){
            displayTheStack();

            System.out.println("Peek " + stackArray[topOfStack] + " is at the top of the stack");

            return stackArray[topOfStack];
        }

    public void displayTheStack(){

        for(int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for(int n = 0; n < stackSize; n++){
            System.out.format("| %2s "+ " ", n);
        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for(int n = 0; n < stackSize; n++){

            if(stackArray[n].equals("-1"))
                System.out.print("|     ");
            else
                System.out.print(String.format("| %2s "+ " ", stackArray[n]));

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();
    }




}
