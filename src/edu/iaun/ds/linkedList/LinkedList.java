package edu.iaun.ds.linkedList;

public class LinkedList {
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node p = head;
        while(p.getNext() != null)
            p = p.getNext();
        p.setNext(newNode);
    }

    public Node getHead() {
        return head;
    }
}
