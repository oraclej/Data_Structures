package edu.iaun.ds.simple;

public class DStack {
    private Node top = null;

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {
        if(top != null) {
            int value = top.getData();
            top = top.getNext();
            return value;
        }
        System.err.println("Stack is empty");
        return -1;
    }

    public int peek() {
        if(top != null)
            return top.getData();
        System.err.println("Stack is empty");
        return -1;
    }
}
