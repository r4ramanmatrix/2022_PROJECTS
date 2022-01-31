package march_april_practice;

public class CP11 implements Comparable<CP11> {

	String fName;
	String lName;
	String emailId;
	double salary;

	public CP11(String f, String l, String e, double d) {
		fName = f;
		lName = l;
		emailId = e;
		salary = d;
	}

	public String toString() {
		return "FirstName is: " + fName + " LastName is: " + lName + " Email id: " + emailId + " Salary is:: " + salary;
	}

	public int compareTo(CP11 obj) {
		return (int) (this.salary - obj.salary);
	}
}
