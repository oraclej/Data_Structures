package edu.iaun.ds.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new StackArray();
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
