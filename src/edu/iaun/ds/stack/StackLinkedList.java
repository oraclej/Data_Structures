package edu.iaun.ds.stack;

public class StackLinkedList<E> implements Stack<E> {
    private Node<E> top = null;
    private int size = 0;

    public void push(E value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public E pop() {
        if(!isEmpty()) {
            E value = top.getData();
            top = top.getNext();
            size--;
            return value;
        }
        throw new StackException("Stack is empty");
    }

    public boolean isEmpty() {
        return top == null;
    }

    public E peek() {
        if(!isEmpty())
            return top.getData();
        throw new StackException("Stack is empty");
    }

    @Override
    public int size() {
        return size;
    }
}
