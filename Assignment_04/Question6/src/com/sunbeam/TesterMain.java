package com.sunbeam;

public class TesterMain {

	public static void main(String[] args) {
		
		List list=new List();
		list.addFirst(40);
		list.addFirst(20);
		list.addFirst(4);
		list.addFirst(30);
		list.addFirst(10);
		list.addFirst(8);
		list.addFirst(2);
		list.addFirst(50);
		list.addFirst(6);
		
		
		list.display();
		
		System.out.println();
		list.bubbleSort();
		list.display();
	}

}
