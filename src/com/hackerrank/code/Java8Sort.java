package com.hackerrank.code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
}

public class Java8Sort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		List<Student> sortedStudentList = studentList
				.stream()
				.sorted(Comparator.comparing(Student::getCgpa)
						.thenComparing(Student::getFname)
						.thenComparing(Student::getId).reversed())
				.collect(Collectors.toList());
		sortedStudentList.forEach(s -> System.out.println(s.getFname()));

		in.close();
	}
}
