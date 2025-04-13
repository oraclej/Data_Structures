package edu.iaun.ds.linkedList;

public interface LinkedList<T> {
    void add(T element);
    void add(int index, T element);
    void remove(int index);
    void clear();
    void removeFirst();
    void removeLast();
    T getFirst();
    T getLast();
    boolean isEmpty();
    int size();
    T get(int index);
    void set(int index, T element);
    boolean contains(T element);
    int indexOf(T element);
    int lastIndexOf(T element);
    int indexOf(T element, int fromIndex);
    T[] toArray();
    void print();
}
