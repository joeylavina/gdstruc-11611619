package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 25;
        numbers[1] = 36;
        numbers[2] = 60;
        numbers[3] = 290;
        numbers[4] = -9;
        numbers[5] = 89;
        numbers[6] = 67;
        numbers[7] = 50;
        numbers[8] = 99;
        numbers[9] = 23;

        System.out.println("Before sorting:");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\n\nAfter sorting:");
        printArrayElements(numbers);
    }

    private static void bubbleSort(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            for (int i = 0; i < lastSortedIndex; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void printArrayElements(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


    private static void selectionSort(int[] arr) {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++) {
                if (arr[i] < arr[smallestIndex]) {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }


    }
}