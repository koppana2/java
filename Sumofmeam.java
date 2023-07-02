package com.ex;

public class Sumofmeam {
public static void main(String[] args) {
		
		//eD .....extreme digit
		//mD .....mean digit
		int n=2434;
		int temp=n;
		int eD=0;
		int mD=0;
		while(n>0) {
			if (n==temp||n<10) {
				
				eD=eD+(n%10);
			} else {
				mD=mD+(n%10);

			}
			n=n/10;
			
		}
		System.out.println(eD);
		System.out.println(mD);
	}

}
