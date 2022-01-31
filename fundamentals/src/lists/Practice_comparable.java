package lists;

public class Practice_comparable implements Comparable<Practice_comparable> {

	private String empName;
	private int empId;

	public Practice_comparable(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return this.empName + " " + this.empId;
	}

	@Override
	public int compareTo(Practice_comparable intObj) {
		if (this.empId < intObj.empId)
			return -1;

		if (this.empId > intObj.empId)
			return 1;
		return 0;
	}

	/*
	 * @Override public int compareTo(Practice_comparable obj) { int comparableInt =
	 * this.empName.compareTo(obj.empName); if (comparableInt < 0) return -1; if
	 * (comparableInt > 0) return 1; return 0; }
	 */

}
