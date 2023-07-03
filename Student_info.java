package iterator_student;

import java.util.*;

public class Student_info {

	public static void main(String[] args) {
		int[] marks1 = { 68, 52, 87, 79, 91 };
		Student s1 = new Student(101, "Dinesh", "Delhi", marks1);

		int[] marks2 = { 86, 59, 87, 89, 81 };
		Student s2 = new Student(105, "David", "Mumbai", marks2);

		int[] marks3 = { 86, 58, 82, 79, 71 };
		Student s3 = new Student(103, "Ram", "Kolkata", marks3);

		IdSort i = new IdSort();
		Set<Student> stdSet = new TreeSet<Student>(i);
		stdSet.add(s1);
		stdSet.add(s2);
		stdSet.add(s3);

		/*for (Student s : stdSet) {
			System.out.println(s);
		}*/
		Iterator<Student> it = stdSet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}