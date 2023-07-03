package Methods_Programs;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int num = sc.nextInt();
		System.out.println(GradeResult(num));
		sc.close();
	}

	public static char GradeResult(int marks) {
		char grade;
		if (marks >= 80) {
			grade = 'A';
		} else if (marks < 80 && marks >= 60) {
			grade = 'B';
		} else if (marks < 60 && marks >= 50) {
			grade = 'C';
		} else if (marks < 50 && marks >= 45) {
			grade = 'D';
		} else if (marks < 45 && marks >= 25) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		/*
		 * else if(marks>=60) { grade='B'; } else if(marks>=50) { grade='C'; } else
		 * if(marks>=45) { grade='D'; } else if(marks>=25) { grade='E'; } else {
		 * grade='F'; }
		 */
		return grade;
	}

}
