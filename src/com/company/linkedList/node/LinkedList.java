package com.company.linkedList.node;

public class LinkedList {
    public static void main(String[] args) {
        Node<Integer> head = null;
        head = addNode(head, 2);
        head = addNode(head, 8);
        head = addNode(head, 5);
        head = addNode(head, 9);

        assertResult(head.value == 2);
        assertResult(head.next.value == 8);
        assertResult(head.next.next.value == 5);
        assertResult(head.next.next.next.value == 9);
    }



    //returns the head of the node
    public static Node<Integer> addNode(Node<Integer> head, int value) {
        Node<Integer> newNode = new Node<Integer>(value);
        if (head == null) {
            return newNode;
        }
        Node<Integer> trav = head;

        while(trav.next != null) {
            trav = trav.next;
        }
        //trav is at the end of the list
        trav.next = newNode;
        return head;
    }

    public static void find(Node<Integer> head, int query) {}

    public static void remove(Node<Integer> head, int query) {}

    public static void assertResult(boolean result) {
        if (result) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }
}
