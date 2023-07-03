package FOR_loop;

import java.util.Scanner;

public class FiboSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter days : ");
		System.out.println("enter t1 : ");
		System.out.println("t2 : ");
		System.out.println("t3 : ");
		int n = sc.nextInt();
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		int tn = 0;

		for (int i = 4; i <= n; i++) {
			tn = t3 + t2 + t1;
			t1 = t2;
			t2 = t3;
			t3 = tn;
		}
		System.out.println(tn);
		sc.close();
	}

}
