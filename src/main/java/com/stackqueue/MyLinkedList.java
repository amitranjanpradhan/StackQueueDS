package com.stackqueue;

public class MyLinkedList {
    public INode head;
    public INode tail;

    /**
     * Default constructor assigned both head and tail as null.
     */
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * this method will add nodes.
     * added if condition to check tail or head is null...then it'll check the next.
     * @param newNode
     */
    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    /**
     * added append method to append values in the linked list.
     * @param myNode
     */
    public void append(INode myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    /**
     * here i have added insert method which took two inputs given below.
     * @param myNode
     * @param newNode
     */
    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    /**
     * this pop method will delete the first value of the linkedlist.
     * @return
     */
    public INode pop() {
        INode  tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    /**
     * this method will delete the last element of the linkedList.
     * @return
     */
    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = null;
        return tempNode;
    }

    /**
     * this method will search the given node from the linkedList.
     * @param myNode
     * @return
     */
    public INode search(INode myNode){
        INode tempNode = head;
        while (tempNode.getNext()!=myNode){
            tempNode=tempNode.getNext();
        }
        return tempNode.getNext();
    }

    /**
     * this method will delete the given element.
     * @param removeNode
     */
    public void remove(INode removeNode) {
        INode myTempNode = head;
        while (myTempNode.getNext() != removeNode) {
            myTempNode = myTempNode.getNext();
        }
        INode myTempNode2 = myTempNode;
        myTempNode2 = myTempNode.getNext().getNext();
        myTempNode.setNext(myTempNode2);
    }

    /**
     * this method will count and give the size of the linked list as an output.
     * @param head
     */
    public void getSize(INode head) {
        int nodeCount = 0;
        INode temp = head;
        while (temp != null) {
            nodeCount++;
            temp = temp.getNext();
        }
        System.out.println("Size: " + nodeCount);
    }
    /**
     * this will print the node.
     */
    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
