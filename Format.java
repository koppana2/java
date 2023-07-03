package HackerRank;

import java.util.Scanner;

public class Format {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("++++++++++++++++++++++++++++++");
		for (int j = 0; j < 3; j++) {
			String str = sc.next();
			int i = sc.nextInt();
			String formatted = String.format("%-15s%03d", str, i);
			System.out.println(formatted);
		}
		sc.close();
	}
}