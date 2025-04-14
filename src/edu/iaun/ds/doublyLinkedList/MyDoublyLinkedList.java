package edu.iaun.ds.doublyLinkedList;

import edu.iaun.ds.linkedList.LinkedListException;

public class MyDoublyLinkedList<T> implements DoublyLinkedList<T> {
    private DNode<T> head;
    private int size = 0;

    public MyDoublyLinkedList(T... elements) {
        head = null;
        if (elements.length > 0) {
            head = new DNode<>(elements[0]);
            size++;
            DNode<T> last = head;
            for (int i = 1; i < elements.length; i++) {
                DNode<T> t = new DNode<>(elements[i]);
                last.setNext(t);
                t.setPrev(last);
                size++;
                last = t;
            }
        }
    }

    @Override
    public void add(T element) {
        DNode<T> p = new DNode<>(element);
        if (isEmpty())
            head = p;
        else {
            DNode<T> t = head;
            while (t.getNext() != null)
                t = t.getNext();
            t.setNext(p);
            p.setPrev(t);
        }
        size++;
    }

    //TODO : change from here
    @Override
    public void add(int index, T element) {
        if (index > size || index < 0)
            throw new LinkedListException("Index out of bounds:" + index);
        DNode<T> p = new DNode<>(element);
        size++;
        DNode<T> t = head;
        for (int i = 0; i < index - 1; i++)
            t = t.getNext();
        p.setNext(t.getNext());
        t.setNext(p);
    }

    @Override
    public void remove(int index) {
        if (index >= size || index < 0)
            throw new LinkedListException("Index out of bounds");
        DNode<T> t = head;
        if (size == 1) {
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
            DNode<T> t = head;
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
        DNode<T> t = head;
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
        DNode<T> t = head;
        for (int i = 0; i < index; i++)
            t = t.getNext();
        return t.getData();
    }

    @Override
    public void set(int index, T element) {
        if (index >= size || index < 0)
            throw new LinkedListException("Index out of bounds");
        DNode<T> t = head;
        for (int i = 0; i < index; i++)
            t = t.getNext();
        t.setData(element);
    }

    @Override
    public boolean contains(T element) {
        if (head == null)
            return false;
        DNode<T> t = head;
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
        DNode<T> t = head;
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
        DNode<T> t = head;
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
        DNode<T> t = head;
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
        DNode<T> t = head;
        for (int i = 0; i < size; i++) {
            arr[i] = t.getData();
            t = t.getNext();
        }
        return arr;
    }

    @Override
    public void print() {
        DNode<T> t = head;
        while (t != null) {
            System.out.print(t.getData() + "\t");
            t = t.getNext();
        }
    }
}
