package IF_condition;

import java.util.Scanner;

public class student_exam_eligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter no.of classes held: ");
		int CH = sc.nextInt();

		System.out.println("enter no.of classes attended:  ");
		int CA = sc.nextInt();

		double percentage = ((double) CA / CH) * 100;
		System.out.println("attendance percentage is: "+percentage);

		if (percentage >= 75) {
			System.out.println("he/her is eligible for exam");
		} else {
			System.out.println("he/her is not eligible for exam");
		}
		sc.close();
	}

}