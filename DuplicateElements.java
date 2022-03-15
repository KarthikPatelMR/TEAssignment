package com.te.assignments.arrays;

import java.util.Arrays;

public class DuplicateElements {
	public static void main(String[] args) {
		int a[] = {1,1,1,2,2,2,2};
		System.out.println(Arrays.toString(a));
		for (int j = 0; j < a.length; j++) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == a[j] && i != j) {
					count++;
					a[i] = '\n';
				}
			}
			if (a[j] != '\n' && count > 0) {
				System.out.print(a[j] + " "); // 1 3 2 4(1,1,1,2,2,2,2,)
			}
		}
	}
}


//Why all array methods are static
//Why array is fixed in size