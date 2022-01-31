package lists;

public class Organization implements Comparable<Organization> {

	private String employeeName;
	private int empId;

	public Organization(String employeeName, int empId) {
		this.employeeName = employeeName;
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return empId;
	}

	public void setEmployeeId(int empId) {
		this.empId = empId;
	}

	@Override
	public int compareTo(Organization org) {
		int compareId = org.getEmployeeId();
		return this.empId = compareId;
	}

	@Override
	public String toString() {
		return employeeName + " " + empId;
	}

}
