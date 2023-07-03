package IF_condition;

import java.util.Scanner;

public class grade_calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 subjects marks ");

		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();

		double percentage =((sub1 + sub2 + sub3) / 300.0)* 100;
		char grade;
	
		if (percentage >= 90) {
			grade = 'A';
		} else if (percentage >= 70) {
			grade = 'B';
		} else if (percentage >= 50) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println("grade of the student is " + grade);
		sc.close();
	}
}
