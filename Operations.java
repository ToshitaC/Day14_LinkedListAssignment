package com.bridgelabz;

public class Operations {

    public static void addElementAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(56);
        linkedList.insert(70);
        linkedList.insert(30);
        linkedList.print();
    }
}