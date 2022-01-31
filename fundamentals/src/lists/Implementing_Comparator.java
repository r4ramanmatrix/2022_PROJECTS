package lists;

public class Implementing_Comparator {

	private String empName;
	private int empId;

	public Implementing_Comparator(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
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
	public String toString() {
		return empName + " " + empId;
	}

}