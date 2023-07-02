package com.ex;

public class XylemorPhyolem {
	public static void main(String[] args) {
		//xylem number means....The sum of its extreme (first and last) digits is equals to the sum of mean(except first and last)digits
		//pholem number means.....Otherwise its a pholem number
		int n=2343;
		int temp=n;
		int eD=0,mD=0;
		while(n>0) {
             if (n==temp||n<10) {
				eD=eD+(n%10);
			} else {
				mD=mD+(n%10);
			}
			n=n/10;
		}
		if (eD==mD) {
			System.out.println(temp+ " is a xylem number");
		} else {
			System.out.println(temp+ " is a pholem number");
		}
	}
}
