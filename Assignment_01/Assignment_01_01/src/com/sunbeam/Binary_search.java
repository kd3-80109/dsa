package com.sunbeam;
import  java.util.Scanner;

public class Binary_search {
	public static int binary_Search(int arr[],int size,int key) {
		int left = 0,right = size - 1,mid;
		while(left <= right ) {
			mid = (left+right)/2;
			if (key == arr[mid])
				return mid;
			else if (key<arr[mid])
				right = mid -1;
			else
				left = mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77,88 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();
		int index = binary_Search(arr,arr.length,key);
		if (index !=-1)
			System.out.println("key is found at index : " + index);
		else {
			System.out.println("key is not found");
		}
		System.out.println("no. of comparision : "+(index !=-1 ? index+1:arr.length));

		sc.close();

	}

}
