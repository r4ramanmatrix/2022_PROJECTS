package encapsulation;

public class EmployeeExample {
	
	private int ssn;
	private String empName;
	private int empAge;
	
	
	
	public int getSsn() {
		return ssn;
	}



	public void setSsn(int ssn) {
		System.out.println(ssn);
		this.ssn = ssn;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	public static void main(String[] args) {
		
	}

}
