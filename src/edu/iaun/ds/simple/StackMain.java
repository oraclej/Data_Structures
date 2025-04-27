package edu.iaun.ds.simple;

import edu.iaun.ds.stack.StackException;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }catch (StackException e) {
            System.err.println(e.getMessage());
        }
    }
}
