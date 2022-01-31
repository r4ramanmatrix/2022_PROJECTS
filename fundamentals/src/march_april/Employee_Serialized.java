package march_april;

import java.io.Serializable;

public class Employee_Serialized implements Serializable{

	String empName;
	int empId;

	public Employee_Serialized(String s, int i) {
		empName = s;
		empId = i;
	}

	public String toString() {
		return "Name is: " + empName + " Employee id is:: " + empId;
	}

}
