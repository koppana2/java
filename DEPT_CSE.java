package inheritance;

public class DEPT_CSE extends Student {
	private int unix, data_structures, java, computerOrganization;

	public DEPT_CSE() {
	}

	public DEPT_CSE(String studentName, int unix, int data_structures, int java, int computerOrganization) {
		super.setStudentName(studentName);
		this.unix = unix;
		this.data_structures = data_structures;
		this.java = java;
		this.computerOrganization = computerOrganization;
	}

	public int getUnix() {
		return unix;
	}

	public void setUnix(int unix) {
		this.unix = unix;
	}

	public int getData_structures() {
		return data_structures;
	}

	public void setData_structures(int data_structures) {
		this.data_structures = data_structures;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getComputerOrganization() {
		return computerOrganization;
	}

	public void setComputerOrganization(int computerOrganization) {
		this.computerOrganization = computerOrganization;
	}

	public float getPercentage() {
		return (unix + data_structures + java + computerOrganization) / 4.0f;
	}

	@Override
	public String toString() {
		return "DEPT_CSE [StudentId=" + getStudentId() + ", StudentName=" + getStudentName() +", unix=" + unix + ", data_structures=" + data_structures + ", java=" + java
				+ ", computerOrganization=" + computerOrganization + ", Percentage=" + getPercentage() + "]";
	}

}
