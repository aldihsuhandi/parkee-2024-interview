package datastructure;

import datastructure.model.Node;

public class CustomList {
    private Node head;

    public CustomList() {
        this.head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        if (currentNode == null) {
            head = newNode;
            return;
        }

        while(currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);

        head = newNode;
    }

    public void deleteByValue(int data) {
        Node prevNode = null, currentNode = head;
        while(currentNode != null) {
            if (currentNode.getData() == data) {
                if(prevNode == null) {
                    head = head.getNext();
                } else {
                    prevNode.setNext(currentNode.getNext());
                }
                return;
            }

            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    public void display() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.printf("%d ", currentNode.getData());
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
