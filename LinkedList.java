package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;
    Node newNode;

    public void print() {
        tail = newNode;
    }

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }

    public void insertInBetween(Node previousNode, Node newNode) {
        Node tempNode = previousNode.next;
        previousNode.next = newNode;
        newNode.next = tempNode;
    }

    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            this.head = newnode;
        } else if (tail == null) {
            this.tail = newnode;
        } else {
            Node temp = newnode;
            temp.next = this.tail;
            this.head.next = temp;
        }
    }
}