package com.stackqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * here i have created a test class MyStackTest.
 */
public class MyStackTest {
    /**
     * this will check the stack has created or not.
     * this will check the push,printstack methods.
     */
    @Test
    public void given3NumberWhenAddedToStackShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assertions.assertEquals(myThirdNode,peak);
    }
    /**
     * This test case will check peak and pop method.
     */
    @Test
    public void given3NumberInStackWhenDeletedShouldHaveLastAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.pop();
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
        INode peak = myStack.peak();
        Assertions.assertEquals(myFirstNode,peak);
    }
}
