package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");
        System.out.println("Enter 2 to append element at start");
        System.out.println("Enter 1 to add element \nEnter 2 to append element at start \nEnter 3 to insert element in between");
        System.out.println("Enter 4 to delete data of first node");
        switch (sc.nextInt()) {
            case 1:
                Operations.addDataAtStart();
                break;
            case 4:
                Operations.deleteFirstNode();
                break;
        }
    }
}