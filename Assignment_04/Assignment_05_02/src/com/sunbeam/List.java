package com.sunbeam;

public class List {

	class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}

	}

	private Node tail;
	public List() {
        this.tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = tail.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }
    
}
