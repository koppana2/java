package Methods_Programs;

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println(sumoffactors(num));
		sc.close();
	}

	public static int sumoffactors(int num) {
		int i = 1, sum = 0;
		while (i <= num) {
			if (num % i == 0) {
				sum += i;
			}
			i++;
		}
		return sum;

	}

}
