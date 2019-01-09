package com.kmr.logicalpro;

public class SelectionSorting {
    static void selectSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }

            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        int array[] = { 20, 34, 19, 14, 72, 68, 45, 54 };
        System.out.println("Before Selection Sort");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        selectSort(array);
        System.out.println("After Selection Sort");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
