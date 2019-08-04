package datastructures;

import java.util.*;

class Student implements Comparable<Student> {
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

	public int compareTo(Student st) {
		int nameDiff;
		if (this.cgpa == st.cgpa) {
			nameDiff = this.fname.compareTo(st.fname);
			if (nameDiff == 0)
				return this.id - st.id;
			else
				return nameDiff;
		}
		else if ((st.cgpa - this.cgpa) > 0) {
			return 1;
		}
		else {
			return -1;
		}

	}
}

public class StudentSort {
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
		Collections.sort(studentList);
		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
		in.close();
	}
}
