package iterator_student;

public class Student {

	private int Id;
	String StudentName;
	String Location;
	int[] Marks;

	public Student() {
	}

	public Student(int Id, String StudentName, String Location, int[] Marks) {
		this();
		this.Id = Id;
		this.StudentName = StudentName;
		this.Location = Location;
		this.Marks = Marks;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int[] getMarks() {
		return Marks;
	}

	public void setMarks(int[] marks) {
		Marks = marks;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public float Percentage(int[] Marks) {
		int sum = 0;
		for (int i = 0; i < Marks.length; i++) {
			sum += Marks[i];
		}
		float percentage = (float) sum / Marks.length;
		return percentage;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", StudentName=" + StudentName + ", Location=" + Location + ",percentage="
				+ Percentage(Marks) + "]";
	}

}
