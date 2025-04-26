package edu.iaun.ds.simple;


public class Stack {
    private int[] arr;
    private int top = -1;

    public Stack(int size) {
        arr = new int[size];
    }

    public void push(int x)  {
        if(top == arr.length - 1)
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
