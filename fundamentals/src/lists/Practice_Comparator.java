package lists;

public class Practice_Comparator {

	private String empName;
	private int empId;
	private int empSalary;

	public Practice_Comparator(String empName, int empId, int empSalary) {
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}

	public String getEmpNamae() {
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

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return this.empName + " " + this.empId + " " + this.empSalary;
	}

}
