package com.te.pattern;

public class Alphabetic {

	public static void main(String[] args) {
		int i, j, n = 4;
		for (i = 0; i < n; i++) {
			for (j = i; j >= 0; j--) {
				System.out.print((char) (j + 65));
			}
			System.out.println();
		}
	}
}
