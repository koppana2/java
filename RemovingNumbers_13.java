package Strings;

public class RemovingNumbers_13 {

	public static void main(String[] args) {
		String s="Hemanth1234";
		/*StringBuffer s1=new StringBuffer(s);
		for(int i=0;i<s1.length();i++) {
			char d=s1.charAt(i);
			if(Character.isAlphabetic(d)!=true) {
				s1.deleteCharAt(i);
				i--;
			}
		}
	
		System.out.println(s1);*/
		String s1 = s.replaceAll("[0-9]", "");
		System.out.println(s1);

	}

}
