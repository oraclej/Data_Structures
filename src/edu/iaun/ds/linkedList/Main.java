package edu.iaun.ds.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new MyLinkedList<>(10, 20, 30);
        list.add(40);
        list.add(2, 25);
        list.removeFirst();
        list.removeLast();
        list.print();
    }
}
