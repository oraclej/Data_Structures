package edu.iaun.ds.queue;

public class LinkedQueue<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;
    @Override
    public void enqueue(T t) {
        Node<T> newNode = new Node<>(t);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        }else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            throw new QueueException("Queue is empty");
        Node<T> temp = head;
        head = head.getNext();
        size--;
        return temp.getData();
    }

    @Override
    public T peek() {
        if(size == 0)
            throw new QueueException("Queue is empty");
        return head.getData();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
