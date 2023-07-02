package com.ex;
public class Spynumber {
	public static void main(String[] args) {
		//the sum of given number is equals to product of given number is known as spy number
		int n=1124,temp=n;
		int sum=0;
		int product=1;
		while(n!=0) {
			int r=n%10;
			sum=sum+r;
			product=product*r;
			n=n/10;
			
		}
	
		if (sum==product) {
			System.out.println(temp + " is a spy number");
			
		} else {
			System.out.println(temp +" is not a spy number");

		}
		
	}

	}
