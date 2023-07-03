package while_loop;

import java.util.Scanner;

public class SumOfCubes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int i = 1, sum = 0;

		while (i <= num) {
			sum += (i * i * i);
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
