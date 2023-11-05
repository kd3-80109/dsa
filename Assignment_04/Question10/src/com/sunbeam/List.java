package com.sunbeam;

public class List {

	public class Node {
		private Employee emp;
		private Node next;

		public Node(Employee emp) {
			this.emp = emp;
			this.next = null;
		}
	}

	private Node head;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(Employee emp) {
		Node nn = new Node(emp);
		if (isEmpty()) {
			head = nn;
		} else {
			nn.next = head;
			head = nn;
		}
	}

	public Employee searchEmployee(String name) {
		Node trav = head;
		if (isEmpty())
			System.out.println("List is empty");
		else {
			while (trav != null) {
				if (trav.emp.getName().equals(name)) {
					return trav.emp;
				}
				trav = trav.next;
			}
		}
		return null;
	}

	public void deleteEmployee(int empId)
	{
		boolean flag=false;
		Node trav=head;
		if(isEmpty())
			System.out.println("List is empty!");
		else if(head.emp.getEmpId()==empId)
		{
			if(head.next==null)
				head=null;
			else {
				head=head.next;
			}
		}
		else
		{
			while(trav.next!=null)
			{
				if(trav.next.emp.getEmpId()==empId)
					break;
				trav=trav.next;
			}
			if(trav.next!=null)
			{
				trav.next=trav.next.next;
				flag=true;
			}
			if(flag)
				System.out.println("Employee deleted successfully");
			else
				System.out.println("No deletion done");
		}
	}
	
	
	public void updateEmployee(String name,double salary) {
		Node trav = head;
		if (isEmpty())
			System.out.println("List is empty");
		else {
			while (trav != null) {
				if (trav.emp.getName().equals(name)) {
					trav.emp.setSalary(salary);
					System.out.println(trav.emp.toString());
					break;
				}
				trav = trav.next;
			}
		}
	}

	public void display() {
		Node trav = head;
		if (isEmpty())
			System.out.println("List is empty");
		else {
			while (trav != null) {
				System.out.println(trav.emp.toString());
				trav = trav.next;
			}
		}
	}
}
