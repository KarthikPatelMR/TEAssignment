package com.te.assignments.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_SecondLargest {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 5, 4, 3, 5 };
		Arrays.sort(a);

		int n = 8, largest = a[n - 1];
		int secondLargest = 0;

		for (int i = n - 1; i >= 0; i--) {
			if (a[i] != a[i - 1]) {
				secondLargest = a[i - 1];
				break;
			}
		}
		System.out.println("Largest: " + largest + "\nSecond Largest: " + secondLargest);
	}
}

//Base PU College