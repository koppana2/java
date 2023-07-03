package IF_condition;

import java.util.Scanner;

public class greatest_3digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 digits ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int max = num1;
		
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println("the greatest of the 3 is : " + max);

		sc.close();
	}

}
