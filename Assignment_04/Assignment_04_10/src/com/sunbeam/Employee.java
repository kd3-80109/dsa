package com.sunbeam;

import java.util.Scanner;

public class Employee {

	private int empId;
	private String name;
	private double salary;

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void accept(Scanner scanner) {
		System.out.println("Enter emp id:");
		this.empId = scanner.nextInt();
		System.out.println("Enter emp name:");
		scanner.nextLine();
		this.name = scanner.nextLine();
		System.out.println("Enter emp salary:");
		this.salary = scanner.nextDouble();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

}
