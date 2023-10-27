package com.sunbeam;

import java.util.Scanner;

public class Linear_search {
	public static int linear_search(int arr[], int size, int key) {
		int comparision = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 55, 44, 77, 45 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = linear_search(arr, arr.length, key);
		if (index != -1)
			System.out.println("key is found at index : " + index);
		else {
			System.out.println("key is not found");
		}
		System.out.println("no. of comparision : "+(index !=-1 ? index+1:arr.length));
		sc.close();
	}

}
