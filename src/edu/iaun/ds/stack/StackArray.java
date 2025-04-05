package edu.iaun.ds.stack;

public class StackArray<E> implements Stack<E> {
    private final int MAX_SIZE = 100;
    private E[] arr = (E[])new Object[MAX_SIZE];
    private int top = -1;

    public void push(E x)  {
        if(top == MAX_SIZE-1)
            throw new StackException("Stack is full");
        arr[++top] = x;
    }

    public E pop() {
        if(top == -1)
            throw new StackException("Stack is empty");
        return arr[top--];
    }

    public E peek() {
        if(top == -1)
            throw new StackException("Stack is empty");
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
