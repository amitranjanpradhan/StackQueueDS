package com.stackqueue;

/**
 * created a class MyQueue.
 * which took an object of MyLinkedList.
 */
public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    /**
     * this enqueue method will call the append method of linkedlist.
     * Append the values.
     * @param myNode
     */
    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    /**
     * this method will print the nodes.
     */
    public void printQueue() {
        myLinkedList.printMyNodes();
    }

    /**
     * this method will return the 1st element of the queue.
     * @return
     */
    public INode peak() {
        return myLinkedList.head;
    }
}
