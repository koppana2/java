package Array;

public class RemoveDuplicate_17 {

	public static void main(String[] args) {
		int arr[]= {10,20,20,30,30,40,50,50};
		int temp[]=new int[arr.length];
		
		int j=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		} 
		temp[j++]=arr[arr.length-1];
		for(int s=0;s<j;s++) {
			arr[s]=temp[s];
			System.out.print(arr[s]+" ");
		}
			
	}

}
