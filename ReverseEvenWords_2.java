package Strings;

public class ReverseEvenWords_2 {
	//static int count = 0;

	public static void main(String[] args) {
		String s = "Java Is A High Level Language";
		String[] str = s.split(" ");
		int count=0;
		for (String word : str) {
			count++;
			evenWordRev(word,count);
		}
	}

	public static void evenWordRev(String word,int count) {
		if (count % 2 == 0) {
			StringBuffer sb = new StringBuffer(word);
			System.out.print(sb.reverse() + " ");
		} else {
			System.out.print(word + " ");
		}
	}
}