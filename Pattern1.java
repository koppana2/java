package Practice;
class Pattern1{
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}for(int k=i;k<=5;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
		
		for(int i=1;i<=4;i++) {
			if(i%2!=0) {
				for(int j=1;j<=i;j++) {
					if(j%2!=0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}else {
				for(int k=1;k<=i;k++) {
					if(k%2!=0) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		for(int m=3;m<=1;m--) {
			if(m%2!=0) {
				for(int j=m;j>=1;j--) {
					if(j%2!=0) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}else {
				for(int k=m;k>=1;k--) {
					if(k%2!=0) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
	
	}