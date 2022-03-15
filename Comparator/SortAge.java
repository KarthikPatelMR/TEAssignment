package com.te.assignments.comparator;

import java.util.Comparator;

public class SortAge implements Comparator<StudentDetails>{

	@Override
	public int compare(StudentDetails o1, StudentDetails o2) {
		return o1.student_age-o2.student_age;
	}
}