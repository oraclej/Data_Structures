package edu.iaun.ds.queue;

public class SimpleQueue {
    private final int MAX_SIZE = 6;
    private int f = -1;
    private int r = -1;
    private int[] q = new int[MAX_SIZE];

    public void enqueue(int x) {
        if (r < MAX_SIZE - 1)
            q[++r] = x;
        else
            System.out.println("Queue is full");
    }

    public int dequeue() {
        if (f < MAX_SIZE - 1)
            return q[++f];
        System.out.println("Queue is empty");
        return -1;
    }

    public int peek() {
        if (f < MAX_SIZE - 1)
            return q[f+1];
        System.out.println("Queue is empty");
        return -1;
    }
}

