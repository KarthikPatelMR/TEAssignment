package com.te.assignments.comparator;

public class StudentDetails {
	int student_id;
	String student_name;
	int student_age;
	int student_marks;
	public StudentDetails(int student_id, String student_name, int student_age, int student_marks) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_marks = student_marks;
	}
	@Override
	public String toString() {
		return "Id: "+student_id + " Name: " + student_name + " Age: "
				+ student_age + " Marks: " + student_marks;
	}
	
}
