package IF_condition;

import java.util.Scanner;

public class schoolGrading {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();
		char grade;

		if (marks > 80) {
			grade = 'A';
		} else if (marks >= 60) {
			grade = 'B';
		} else if (marks >= 50) {
			grade = 'C';
		} else if (marks >= 45) {
			grade = 'D';
		} else if (marks >= 25) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		System.out.println("subject grade is : " + grade);
		sc.close();
	}
}
