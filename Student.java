package inheritance;

public class Student {
	private int studentId;
	private String studentName;
	private static int idGenerator = 101;

	public Student() {
		studentId = idGenerator++;
	}

	public Student(String studentName) {
		this();
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}