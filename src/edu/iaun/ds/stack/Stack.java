package edu.iaun.ds.stack;

public interface Stack<E> {
    void push(E value);
    E pop();
    boolean isEmpty();
    E peek();
}
