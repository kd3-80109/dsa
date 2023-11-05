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


	private Node head;
	private Node tail;

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail=newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int value)
	{
		Node newNode=new Node(value);
		if (isEmpty()) {
			head = newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
			System.out.println("List is empty!");
		else
			head=head.next;
	}
	
	public void deleteLast()
	{
		if(isEmpty())
			System.out.println("List is empty!");
		else if(head.next==null)
			head=null;
		else
		{
			Node trav=head;
			while(trav.next.next!=null)
				trav=trav.next;
			trav.next=null;
		}
			
	}
	public void display() {
		if (isEmpty())
			System.out.println("List is empty!");
		Node trav = head;
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}
	
	public void middleElement()
	{
		if(isEmpty())
			System.out.println("List is empty!");
		Node trav=head;
		Node advanceTrav=head;
		while(advanceTrav!=null && advanceTrav.next!=null)
		{
			advanceTrav=advanceTrav.next.next;
			trav=trav.next;
		}
		System.out.println("Middle element is:"+trav.data);
	}
   
}
