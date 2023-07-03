package Strings;

public class stringShotcuts {

	public static void main(String[] args) {
		String s1="Java Programming";
		
		/*
		0123 4  56789 10 11 12 13 14 15
		Java" " Progr a  m  m  i  n  g
		*/

		System.out.println("character at 2index :"+s1.charAt(2));
		System.out.println("character at 4index :"+s1.charAt(4));
		System.out.println("character at 13index :"+s1.charAt(13));
		System.out.println("index of P :"+s1.indexOf('P'));
		System.out.println("index of   :"+s1.indexOf(' '));
		System.out.println("index of a :"+s1.indexOf('a'));//first occurence
		System.out.println("last index of a :"+s1.lastIndexOf('a'));//last occurence
		System.out.println("uppercase :"+s1.toUpperCase());
		System.out.println("lowercasse :"+s1.toLowerCase());
		System.out.println("SubString :"+s1.substring(8,13));//end index+1
		System.out.println("SubString with begin :"+s1.substring(8));
		
		String s2="Welcome to ";
	//	System.out.println(s2.concat(s1));
		
		String s3=s2.concat(s1);
		System.out.println("s3 :"+s3);
		
		String s4="         JAVA   PROGRAMMING    ";
		String s5=s4.trim();
		System.out.println("s4 :"+s4);
		System.out.println("s5 :"+s5);
		
	}

}
