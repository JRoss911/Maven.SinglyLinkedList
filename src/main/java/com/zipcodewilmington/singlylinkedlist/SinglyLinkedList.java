package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    private Node head; //Head is first node in linked list
    private int size; //Size changes as elements/data is added and removed

    public boolean isEmpty() {
        SinglyLinkedList list = new SinglyLinkedList();
        if (list.length() == 0 )
            return true;
        return false;
    }
//https://javarevisited.blogspot.com

// Node is nested class because it only exists along with linked list
// Node is private because it's implementation detail

    public void append(String data) {
        if(head == null){
            head = new Node(data);
            return;
        }
        tail().next = new Node(data);
    }
    private Node tail () {
        Node tail = head;

        //Find last element of linked list known as tail
        while(tail.next != null) {
            tail = tail.next;
        }
        return tail;

    }
    public int length() {
        int length = 0; Node current = head;
        // Starts counting from head - first node
        while(current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void addFirst(String data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            head.next = null;
        }
        node.next = head;
        head = node;
    }

    public void addLast(String data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;

    }

    public String addElement(String elementToAdd) {
        SinglyLinkedList list = new SinglyLinkedList();
        Node newNode = new Node(elementToAdd);
        newNode.setNext(head);
        head = newNode;
        size++;
        return list.addElement(elementToAdd);
    }

    public String remove(String elementToRemove) {
        SinglyLinkedList list = new SinglyLinkedList();
        Node newNode = new Node(elementToRemove);
        newNode.setNext(head);
        head = newNode;
        size--;
        return list.remove(elementToRemove);
    }

    public int getSize() {
        return size;
    }

    private static class Node {
        private Node next;
        private String data;

        public Node (String data){
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}
