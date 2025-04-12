package edu.iaun.ds.stack.simpleStack;

import edu.iaun.ds.linkedList.simple.Node;

public class DStack {
    private Node top = null;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {
        if(!isEmpty()) {
            int value = top.getData();
            top = top.getNext();
            return value;
        }
        System.err.println("Stack is empty");
        return -1;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        if(!isEmpty())
            return top.getData();
        System.err.println("Stack is empty");
        return -1;
    }
}
