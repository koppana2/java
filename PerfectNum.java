package Methods_Programs;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println(IsPerfectNum(num));
		sc.close();
	}

	public static int IsPerfectNum(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum += i;
		}
		return sum;
}
}
