package march_april_practice;

public class CP12 implements Comparable<CP12> {

	String fName;
	String lName;
	int eAge;
	double eSalary;

	public CP12(String f, String l, int i, double d) {
		fName = f;
		lName = l;
		eAge = i;
		eSalary = d;
	}

	public String toString() {
		return "First Name:: " + fName + " Last Name:: " + lName + " Age is:: " + eAge + " Salary is:: " + eSalary;
	}

	public int compareTo(CP12 obj) {
		return this.eAge - obj.eAge;
	}

}
