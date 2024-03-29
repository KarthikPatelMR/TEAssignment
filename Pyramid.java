package com.te.pattern;

public class Pyramid {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j = n - i; j > 1; j--) {
				// printing spaces
				System.out.print(" ");
			}

			// inner loop to handle number of columns
			// values changing according to outer loop
			for (int j = 0; j <= i; j++) {
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();
		}
	}

}
