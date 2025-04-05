package edu.iaun.ds.stack.simpleStack;


public class Stack {
    private final int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE];
    private int top = -1;

    public void push(int x)  {
        if(top == MAX_SIZE-1)
            System.err.println("Stack is full");
        else
            arr[++top] = x;
    }

    public int pop() {
        if(top == -1) {
            System.err.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if(top == -1) {
            System.err.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
