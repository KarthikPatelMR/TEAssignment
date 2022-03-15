package com.te.assignments.arrays;

import java.util.Arrays;

public class Smallest_SecondSmallest {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 5, 4, 3, 5 };
		Arrays.sort(a);

		int n = 8, smallest = a[0];
		int secondSmallest = 0;

		for (int i = 0; i < n; i++) {
			if (a[i] != a[i + 1]) {
				secondSmallest = a[i + 1];
				break;
			}
		}
		System.out.println("Smallest: " + smallest + "\nSecond Smallest: " + secondSmallest);
	}

}
