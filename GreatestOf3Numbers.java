package Methods_Programs;

import java.util.Scanner;

public class GreatestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println("greatest number is : " + Greater(num1, num2, num3));
		sc.close();
	}

	public static int Greater(int n1, int n2, int n3) {
		int max = n1;
		if (max < n2)
			max = n2;
		if (max < n3)
			max = n3;
		return max;
	}

}
