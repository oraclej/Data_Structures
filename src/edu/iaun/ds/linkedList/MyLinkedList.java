package edu.iaun.ds.linkedList;

public class MyLinkedList<T> implements LinkedList<T> {
    private Node<T> head;
    private int size = 0;
    @Override
    public void add(T element) {
        Node<T> t = new Node<>(element);
        if(isEmpty())
            head = t;
        else {
            Node<T> current = head;
            while(current.getNext() != null)
                current = current.getNext();
            current.setNext(t);
        }
        size++;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public boolean contains(T element) {
        return false;
    }

    @Override
    public int indexOf(T element) {
        return 0;
    }

    @Override
    public int lastIndexOf(T element) {
        return 0;
    }

    @Override
    public int indexOf(T element, int fromIndex) {
        return 0;
    }

    @Override
    public T[] toArray() {
        return null;
    }
}
