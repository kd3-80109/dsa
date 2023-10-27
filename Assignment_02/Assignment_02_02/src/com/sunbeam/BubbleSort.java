package com.sunbeam;
import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[], int N) {
        int comparisons = 0;
        for (int i = 1; i < N ; i++) {
            for (int j = 0; j < N -i ; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Number of comparisons: " + comparisons);
    }

    public static void main(String[] args) {
        int arr[] = { 33,22,66,55,44,11};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        bubbleSort(arr, arr.length);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}

