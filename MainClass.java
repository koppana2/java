package inheritance;

public class MainClass {

	public static void main(String[] args) {
		DEPT_ECE ece1 = new DEPT_ECE("arjun", 75, 78, 74, 85, 82);
		DEPT_CSE cse1 = new DEPT_CSE("aravind", 75, 78, 74, 85);
		System.out.println(ece1);
		DEPT_ECE ece2 = new DEPT_ECE("arun", 75, 78, 74, 85, 82);
		System.out.println(ece2);

		ece1.setStudentId(501);
		System.out.println(ece1);


		System.out.println(cse1);

	}

}
