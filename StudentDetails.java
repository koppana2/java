package constructors;

public class StudentDetails {

	public static void main(String[] args) {
		int[] marks1 = { 85, 89, 95, 96, 74 };
		Student s1 = new Student("NANDU", marks1);
		System.out.println(s1);

		int[] marks2 = { 89, 68, 95, 45, 85 };
		Student s2 = new Student("KRISH", marks2);
		System.out.println(s2);

		/*
		 * s1.setName("INDU"); System.out.println(s1);
		 * 
		 * s1.setId(502);
		 * 
		 * s2.setName("sindhu"); System.out.println(s2);
		 * 
		 * System.out.println(s2.getName()); System.out.println(s1.getId());
		 */

		Student s3 = new Student();
		s3.setId(111);
		int[] marks3 = { 85, 98, 56, 28, 96 };
		s3.setMarks(marks3);
		System.out.println(s3);
	}

}
