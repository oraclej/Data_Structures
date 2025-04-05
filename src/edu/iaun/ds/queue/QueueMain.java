package edu.iaun.ds.queue;

public class QueueMain {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.enqueue(100);
        System.out.println(queue.dequeue());
        queue.enqueue(110);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
