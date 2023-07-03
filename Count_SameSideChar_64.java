package Strings;

public class Count_SameSideChar_64 {

	public static void main(String[] args) {
		String s="Ramaa";
		for(int i=0;i<s.length()-1;i++) {
			int count=1;
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
				System.out.print(count+""+s.charAt(i));
				continue;
			}
			System.out.print(s.charAt(i));
		}

	}

}
