package IF_condition;

import java.util.Scanner;

public class fivedigit_check {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit");
		
		int a=sc.nextInt();
		
		if(a>=10000 && a<=99999) {
			System.out.println("it is a five digit");
			}
		else
		{
			System.out.println("it is not a five digit");
		}
		sc.close();
	}
}
