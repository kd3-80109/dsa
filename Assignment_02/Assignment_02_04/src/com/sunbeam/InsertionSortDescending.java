package com.sunbeam;

import java.util.Arrays;

public class InsertionSortDescending {

    public static void insertionSortDescending(int arr[], int N) {
        int comparisons = 0;
        for (int i = 1; i < N; i++) {
            int key = arr[i];
            int j = i - 1;
            // comparisons++; // You can remove this line if you don't want to count comparisons.
            while (j >= 0 && arr[j] < key) { // Change the comparison to sort in descending order
                arr[j + 1] = arr[j];
                j--;
                comparisons++;
            }
            arr[j + 1] = key;
        }
        System.out.println("Number of comparisons: " + comparisons);
    }

    public static void main(String[] args) {
        int arr[] = {55, 44, 22, 66, 11, 33};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        insertionSortDescending(arr, arr.length);
        System.out.println("After sorting in descending order: " + Arrays.toString(arr));
    }
}




