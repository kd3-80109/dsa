package com.sunbeam;

public class TeseterMain {

	public static void main(String[] args) {

		List list=new List();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addFirst(50);

		list.display();
		System.out.println();
		list.addLast(60);
		list.addLast(70);
		list.addLast(80);
		list.display();
		System.out.println();
		list.deleteFirst();
		list.display();
		System.out.println();
		list.deleteLast();
		list.display();
	}

}
