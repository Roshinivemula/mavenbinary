package com.abc;
import java.util.Scanner;

public class BinarySearch {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] array = new int[size];

	        System.out.println("Enter the elements of the array:");

	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = 0; j < size - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap the elements
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	        System.out.print("Sorted array: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	        System.out.print("Enter the element to search: ");
	        int target = scanner.nextInt();
	        int result = BinarySearch.binarySearch(array, target);
	        if (result != -1) {
	            System.out.println("Element found at index " + result);
	        } else {
	            System.out.println("Element not found");
	        }
	        scanner.close();
	    }

	private static int binarySearch(int[] array, int target) {
		// TODO Auto-generated method stub
		return 0;
	}
}