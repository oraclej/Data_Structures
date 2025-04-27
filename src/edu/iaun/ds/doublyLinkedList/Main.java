package edu.iaun.ds.doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new MyDoublyLinkedList<>(10, 20, 30, 40, 50, 60, 70, 80, 90);
        list.removeFirst();
        list.removeLast();
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.add(100);
        list.add(0, 5);
        list.print();
        list.printInReverse();
    }
}
