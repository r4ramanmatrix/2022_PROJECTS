package lists;

public class Sample1 implements Comparable<Sample1> {

	private String empName;
	private int empId;

	public Sample1(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return empName + " " + empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public int compareTo(Sample1 obj) {
		/*
		 * if (this.empId < obj.empId) return -1; if (this.empId > obj.empId) return 1;
		 * return 0;
		 */

		int compareInt = this.empName.compareTo(obj.empName);
		if (compareInt < 0)
			return -1;
		if (compareInt > 0)
			return 1;
		else
			return 0;
	}

}
