package com.sunbeam;

import java.util.Arrays;

public class EmployeeSorted {

	public static void selectionSort(Employee[] e) {
		for (int i = 0; i < e.length - 1; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].getSalary() > e[j].getSalary()) {
					Employee eTemp = e[i];
					e[i] = e[j];
					e[j] = eTemp;
				}
			}
		}
	}

	public static void main(String[] args) {

		Employee[] arrEmployee = new Employee[5];

		arrEmployee[0] = new Employee(1001, "Virat", 2000.00);
		arrEmployee[1] = new Employee(1011, "Dhoni", 4000.00);
		arrEmployee[2] = new Employee(1003, "Messi", 3500.00);
		arrEmployee[3] = new Employee(1020, "Ronaldo", 6500.00);
		arrEmployee[4] = new Employee(1009, "Akash", 1000.00);

		selectionSort(arrEmployee);

		System.out.println("SORTED = " + Arrays.toString(arrEmployee));
	}

}