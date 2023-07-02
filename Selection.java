package com.ex;

public class Selection {
public static void main(String[] args) {
		
		String  a[] = { " siva ","sankar"," vara"," prasad"};
		String temp=" " ;
		int min;
	for ( int i=0;i<a.length;i++ )
	{
		min=i;
		for(int j=0;j<a.length-1;j++)
		{
			if(a[i].compareTo(a[min])>0)
			{
				min=j;
			}
		}
				temp =a[i];
				a[i]= a[min];
				a[min]= temp;
			}
	for (int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+" ");
			}
		}

	}


