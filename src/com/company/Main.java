package com.company;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        sList.display();

        sList.deleteStart();
        sList.display();

        sList.deleteEnd();
        sList.display();
    }
}

