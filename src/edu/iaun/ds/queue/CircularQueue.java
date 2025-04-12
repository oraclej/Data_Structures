package edu.iaun.ds.queue;

public class CircularQueue<T> implements Queue <T>{
    private T[] queue;
    private int front;
    private int rear;
    private int size;
    private final int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = (T[])new Object[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(T item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println("Enqueued " + item);
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            throw new QueueException("Queue is empty.");
        }

        T item = queue[front];
        if (front != rear) {
            front = (front + 1) % capacity;
        }
        size--;
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No element to peek.");
            throw new QueueException("Queue is empty.");
        }
        return queue[front];
    }
}

