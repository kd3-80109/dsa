package com.sunbeam;

import java.util.Scanner;

public class TesterMain {

	public static int menu(Scanner scanner) {
		int choice;
		System.out.println("--------------");
		System.out.println("0.EXIT");
		System.out.println("i. Add employee (Perfrom any add operation)");
		System.out.println("ii. Display all employees");
		System.out.println("iii. Search employee by name");
		System.out.println("iv. Delete employee by empid");
		System.out.println("v. Update salary of employee");
		choice = scanner.nextInt();
		System.out.println("--------------");
		return choice;
	}

	public static void main(String[] args) {

		List list = new List();
		Employee emp;
		int choice;
		Scanner scanner = new Scanner(System.in);
		while ((choice = menu(scanner)) != 0) {
			switch (choice) {
			case 1:
				emp=new Employee();
				emp.accept(scanner);
				list.addFirst(emp);
				break;
			case 2:
				list.display();
				break;
			case 3:
			{
				System.out.println("Enter name:");
				scanner.nextLine();
				String name=scanner.nextLine();
				emp=list.searchEmployee(name);
				if(emp==null)
					System.out.println("Employee not found");
				else
					System.out.println(emp.toString());
			}
				break;
			case 4:
			{
				System.out.println("Enter employee id:");
				int id=scanner.nextInt();
				list.deleteEmployee(id);
			}
				break;
			case 5:
			{
				System.out.println("Enter name:");
				String name=scanner.nextLine();
				System.out.println("Enter salary to update");
				double salary=scanner.nextDouble();
				list.updateEmployee(name, salary);
			}
				break;

			default:
				break;
			}
		}
		System.out.println("Thank you!!");
		scanner.close();
	}

}
