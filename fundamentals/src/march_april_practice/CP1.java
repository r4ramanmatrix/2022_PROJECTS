package march_april_practice;

public class CP1 implements Comparable<CP1> {

	String ename;
	int eid;

	public CP1(String n, int i) {
		ename = n;
		eid = i;
	}

	public String toString() {
		return "Employee Name is:: " + ename + " Employee Id is:: " + eid;
	}

	public int compareTo(CP1 obj) {
		return this.eid - obj.eid;
	}

}
