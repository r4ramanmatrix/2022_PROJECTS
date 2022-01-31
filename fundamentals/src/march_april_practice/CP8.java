package march_april_practice;

public class CP8 implements Comparable<CP8> {

	String ename;
	int eid;

	public CP8(String s, int i) {
		ename = s;
		eid = i;
	}

	public String toString() {
		return "Employee Name is: " + ename + " Employee Id is:: " + eid;
	}

	public int compareTo(CP8 obj1) {
		return this.eid - obj1.eid;
	}

}
