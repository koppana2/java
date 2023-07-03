package collections;

import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
		Set<Character> s1 = new HashSet<Character>();
		s1.add('z');
		s1.add('j');
		s1.add('s');
		s1.add('k');
		s1.add('a');
		s1.add('s');
		s1.add('f');
		System.out.println("HashSet : " + s1);

		Set<Character> s2 = new TreeSet<Character>();
		s2.addAll(s1);
		System.out.println("TreeSet : " + s2);

		Set<Character> s3 = new LinkedHashSet<Character>();
		s3.add('z');
		s3.add('j');
		s3.add('s');
		s3.add('k');
		s3.add('a');
		s3.add('s');
		System.out.println("LinkedHashSet : " + s3);

		System.out.println("s3 contains k ? :" + s3.contains('k'));
		System.out.println("s3 contains K ? :" + s3.contains('K'));
		System.out.println("s3 contains m ? :" + s3.contains('m'));

		s3.remove('j');
		System.out.println(s3);

		for (Character c : s3) {
			System.out.println(c);
		}

	}
}
