package Array;

import java.util.Scanner;

public class SumOf2DElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int [][]arr=new int[size][size];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		getSum(arr);
		sc.close();
	}
	public static void getSum(int[][] a) {
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a.length;j++) {
				sum+=a[i][j];
			}
			for(int k=0;k<a.length;k++) {
				System.out.print(a[i][k]+" ");
				System.out.print(sum);
				System.out.println();
			}
		}
	}

}
