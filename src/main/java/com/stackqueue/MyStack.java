package com.stackqueue;

/**
 * here i have created mystack class.
 * which took an object of myLinkedList class as an constant.
 */
public class MyStack {
    private final MyLinkedList myLinkedList;

    /**
     * In this default constructor it will intiallize the value of myLinkedList.
     */
    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    /**
     * by this push method which will call the add method of the LInkedList and add the node.
     * @param myNode
     */
    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    /**
     * this method will print the nodes by using printNodes method.
     */
    public void printStack() {
        myLinkedList.printMyNodes();
    }

    /**
     * it'll return the head node of the linkedlist.
     * @return
     */
    public INode peak() {
        return myLinkedList.head;
    }
}
