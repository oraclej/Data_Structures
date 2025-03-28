package edu.iaun.ds.stack;

import edu.iaun.ds.linkedList.Node;

public class StackLinkedList implements Stack {
    private Node top = null;

    @Override
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    @Override
    public int pop() {
        if(!isEmpty()) {
            int value = top.getData();
            top = top.getNext();
            return value;
        }
        throw new StackException("Stack is empty");
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int peek() {
        if(!isEmpty())
            return top.getData();
        throw new StackException("Stack is empty");
    }
}
