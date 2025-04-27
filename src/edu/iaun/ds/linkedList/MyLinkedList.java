package edu.iaun.ds.linkedList;

import edu.iaun.ds.Node;

public class MyLinkedList<T> implements LinkedList<T> {
    private Node<T> head;
    private int size = 0;

    public MyLinkedList(T... elements) {
        head = null;
        if (elements.length > 0) {
            head = new Node<>(elements[0]);
            size++;
            Node<T> last = head;
            for (int i = 1; i < elements.length; i++) {
                Node<T> t = new Node<>(elements[i]);
                last.setNext(t);
                size++;
                last = t;
            }
        }
    }

    @Override
    public void add(T element) {
        Node<T> p = new Node<>(element);
        if (isEmpty())
            head = p;
        else {
            Node<T> t = head;
            while (t.getNext() != null)
                t = t.getNext();
            t.setNext(p);
        }
        size++;
    }

    @Override
    public void add(int index, T element) {
        if (index > size || index < 0)
            throw new LinkedListException("Index out of bounds:" + index);
        Node<T> p = new Node<>(element);
        size++;
        if (size == 0)
            head = p;
        else {
            Node<T> t = head;
            for (int i = 0; i < index - 1; i++)
                t = t.getNext();
            p.setNext(t.getNext());
            t.setNext(p);
        }
    }

    @Override
    public void remove(int index) {
        if (index >= size || index < 0)
            throw new LinkedListException("Index out of bounds");
        Node<T> t = head;
        if(size == 1) {
            head = null;
            size = 0;
        }
        for (int i = 0; i < index - 1; i++)
            t = t.getNext();
        t.setNext(t.getNext().getNext());
        size--;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public void removeFirst() {
        if (head == null)
            throw new LinkedListException("List is empty");
        head = head.getNext();
        size--;
    }

    @Override
    public void removeLast() {
        if (head == null)
            throw new LinkedListException("List is empty");
        if (size == 1) {
            head = null;
            size--;
        } else {
            Node<T> t = head;
            while (t.getNext().getNext() != null)
                t = t.getNext();
            t.setNext(null);
            size--;
        }
    }

    @Override
    public T getFirst() {
        if (head == null)
            throw new LinkedListException("List is empty");
        return head.getData();
    }

    @Override
    public T getLast() {
        Node<T> t = head;
        while (t.getNext() != null)
            t = t.getNext();
        return t.getData();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0)
            throw new LinkedListException("Index out of bounds");
        Node<T> t = head;
        for (int i = 0; i < index; i++)
            t = t.getNext();
        return t.getData();
    }

    @Override
    public void set(int index, T element) {
        if (index >= size || index < 0)
            throw new LinkedListException("Index out of bounds");
        Node<T> t = head;
        for (int i = 0; i < index; i++)
            t = t.getNext();
        t.setData(element);
    }

    @Override
    public boolean contains(T element) {
        if (head == null)
            return false;
        Node<T> t = head;
        while (t.getNext() != null) {
            if (t.getData().equals(element))
                return true;
            t = t.getNext();
        }
        return false;
    }

    @Override
    public int indexOf(T element) {
        if (head == null)
            return -1;
        Node<T> t = head;
        for (int i = 0; i < size; i++) {
            if (t.getData().equals(element))
                return i;
            t = t.getNext();
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T element) {
        if (head == null)
            return -1;
        Node<T> t = head;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (t.getData().equals(element))
                index = i;
            t = t.getNext();
        }
        return index;
    }

    @Override
    public int indexOf(T element, int fromIndex) {
        if (head == null)
            return -1;
        if (fromIndex >= size)
            return -1;
        if (fromIndex < 0)
            return indexOf(element);
        Node<T> t = head;
        int i = 0;
        for (; i < fromIndex; i++)
            t = t.getNext();

        for (; i < size; i++) {
            if (t.getData().equals(element))
                return i;
            t = t.getNext();
        }
        return -1;
    }

    @Override
    public T[] toArray() {
        if (head == null)
            return null;
        T[] arr = (T[]) new Object[size];
        Node<T> t = head;
        for (int i = 0; i < size; i++) {
            arr[i] = t.getData();
            t = t.getNext();
        }
        return arr;
    }

    @Override
    public void print() {
        Node<T> t = head;
        while (t != null) {
            System.out.print(t.getData() + "\t");
            t = t.getNext();
        }
        System.out.println();
    }

    @Override
    public void printInReverse() {
        printInReverse(head);
        System.out.println();
    }

    private void printInReverse(Node<T> t) {
        while (t != null) {
            t = t.getNext();
            printInReverse(t);
            System.out.print(t.getData() + "\t");
        }
    }
}
