package edu.iaun.ds.stack;

public class StackArray<E> implements Stack<E> {
    private E[] arr;
    private int top = -1;

    public StackArray(int size) {
        arr = (E[])new Object[size];
    }

    public void push(E x)  {
        if(top == arr.length - 1)
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

    @Override
    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

}
