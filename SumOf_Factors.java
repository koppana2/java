package while_loop;

import java.util.Scanner;

public class SumOf_Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int sum = 0, i = 1;

		while (i <= num) {
			if (num % i == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
