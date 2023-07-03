package inheritance;

public class DEPT_ECE extends Student {
	private int VLSI, MPMC, EDC, TM, CO;

	public DEPT_ECE() {
	}

	public DEPT_ECE(String studentName, int VLSI, int MPMC, int EDC, int TM, int CO) {
	    super.setStudentName(studentName);
		this.VLSI = VLSI;
		this.MPMC = MPMC;
		this.EDC = EDC;
		this.TM = TM;
		this.CO = CO;
	}

	public int getVLSI() {
		return VLSI;
	}

	public void setVLSI(int vLSI) {
		VLSI = vLSI;
	}

	public int getMPMC() {
		return MPMC;
	}

	public void setMPMC(int mPMC) {
		MPMC = mPMC;
	}

	public int getEDC() {
		return EDC;
	}

	public void setEDC(int eDC) {
		EDC = eDC;
	}

	public int getTM() {
		return TM;
	}

	public void setTM(int tM) {
		TM = tM;
	}

	public int getCO() {
		return CO;
	}

	public void setCO(int cO) {
		CO = cO;
	}

	public float getPercentage() {
		return (VLSI + MPMC + EDC + TM + CO) / 5.0f;
	}

	public String toString() {
		return "DEPT_ECE [StudentId=" + getStudentId() + ", StudentName=" + getStudentName() + ", VLSI=" + VLSI
				+ ", MPMC=" + MPMC + ", EDC=" + EDC + ", TM=" + TM + ", CO=" + CO + ", Percentage=" + getPercentage()
				+ "]";
	}

}
