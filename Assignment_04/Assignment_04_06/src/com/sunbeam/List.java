package com.sunbeam;

public class List {

	public class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node head;
	private int count;

	public List() {
		count = 0;
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node nn = new Node(data);
		if (isEmpty()) {
			head = nn;
		} else {
			nn.next = head;
			head = nn;
		}
		count++;
	}

	public void bubbleSort() {
		int cnt=0,pass=0;
		if (head == null || head.next == null) {
			return; // No need to sort if the list is empty or has only one element
		}

		boolean swapped;
		//Using for loop
		for (Node i = head; i.next != null; i = i.next) {
			swapped=false;
			for (Node j = head; j.next != null; j = j.next) {
				if (j.data > j.next.data) {
					int temp = j.data;
					j.data = j.next.data;
					j.next.data = temp;
					swapped=true;
				}	
			}
			if(swapped==false)
				break;
		}
		System.out.println("comparison"+cnt);
		System.out.println("Passes"+pass);
		//Using do while lopp
		/*
		 * do { swapped = false; trav = head;
		 * 
		 * while (trav.next != lptr) { if (trav.data > trav.next.data) { int temp =
		 * trav.data; trav.data = trav.next.data; trav.next.data = temp; swapped = true;
		 * } trav = trav.next; } lptr = trav; } while (swapped);
		 */
	}

	public void display() {
		if (isEmpty())
			System.out.println("List is empty");
		else {
			Node trav = head;
			while (trav != null) {
				System.out.print("->" + trav.data);
				trav = trav.next;
			}
		}
	}
}
