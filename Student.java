package constructors;

import java.util.Arrays;

public class Student {
	private int id;
	private String name;
	private int[] marks;
	private static int idGenerator = 101;

	public Student() {
		id = idGenerator++;
	}

	public Student(String n, int[] m) {
		this();
		name = n;
		marks = m;
	}

	protected void setId(int i) {
		id = i;
	}

	protected void setName(String n) {
		name = n;
	}

	protected void setMarks(int[] m) {
		marks = m;
	}

	protected int getId() {
		return id;
	}

	protected String getName() {
		return name;
	}

	protected int[] getMarks() {
		return marks;
	}

	public float getPercentage() {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		float percentage = (float) sum / marks.length;
		return percentage;
	}

	public String toString() {
		return "ID :" + id + ", Name : " + name + ", Marks : " + Arrays.toString(marks) + ", Percentage : "
				+ getPercentage();

	}
}