package com.company;

public class Main {
    public static void main(String[] args) {

/*        TheStack theStack = new TheStack(10);

        theStack.push("10");
        theStack.push("15");
        theStack.peek();
        theStack.pop();
        theStack.pushMany("12 13 14 15");
        theStack.displayTheStack();
        theStack.popAll();
        theStack.displayTheStack();*/


        //Testing queue
        TheQueue theQueue = new TheQueue(10);

        theQueue.priorityInsert("10");
        theQueue.priorityInsert("19");
        theQueue.priorityInsert("15");
        theQueue.priorityInsert("11");

        theQueue.displayTheQueue();

        theQueue.remove();
        theQueue.remove();

        theQueue.displayTheQueue();

        theQueue.peek();

    }
}

