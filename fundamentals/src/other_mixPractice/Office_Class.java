package other_mixPractice;

public class Office_Class {

	int employee_id;
	String employee_name;

	public Office_Class(int employee_id, String employee_name) {
		this.employee_id = employee_id;
		this.employee_name = employee_name;
	}

	public String toString() {
		return "Employee Id:: " + employee_id + " Employee Name:: " + employee_name;
	}

}
