package edu.iaun.ds.stack;

public class StackArray implements Stack {
    private final int MAX_SIZE = 100;
    private int[] arr = new int[MAX_SIZE];
    private int top = -1;

    public void push(int x)  {
        if(top == MAX_SIZE-1)
            throw new StackException("Stack is full");
        arr[++top] = x;
    }

    public int pop() {
        if(top == -1)
            throw new StackException("Stack is empty");
        return arr[top--];
    }

    public int peek() {
        if(top == -1)
            throw new StackException("Stack is empty");
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
