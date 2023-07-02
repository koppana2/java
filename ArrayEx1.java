package com.ex;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70};
		int delete=40;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==delete)
			{
				for(int j=i+1;j<a.length-1;j++)
				{
					a[i]=a[j];
				}
				break;
			}
		
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
