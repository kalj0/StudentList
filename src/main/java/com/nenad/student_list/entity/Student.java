package com.nenad.student_list.entity;


public class Student {
	
	private String name;
	private int indexNumber;
	private double averageGrade;
	
	public Student(String name, int indexNumber, double averageGrade) {
		this.name = name;
		this.indexNumber = indexNumber;
		this.averageGrade = averageGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(int indexNumber) {
		this.indexNumber = indexNumber;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}

}
