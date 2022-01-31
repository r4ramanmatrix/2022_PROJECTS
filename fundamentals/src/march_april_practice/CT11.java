package march_april_practice;

public class CT11 {

	String fName;
	String lName;
	String emailId;
	double salary;

	public CT11(String f, String l, String e, double d) {
		fName = f;
		lName = l;
		emailId = e;
		salary = d;
	}

	public String toString() {
		return "FirstName is: " + fName + " LastName is: " + lName + " Email id: " + emailId + " Salary is:: " + salary;
	}

}
