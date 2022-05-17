package basics_package_2022;

public class Comparable_Practice_1 implements Comparable<Comparable_Practice_1> {

	String ename;
	int eid;

	public Comparable_Practice_1(String name, int id) {
		ename = name;
		eid = id;
	}

	public String toString() {
		return "Employee Name:: " + ename + " Employee id:: " + eid;
	}

	public int compareTo(Comparable_Practice_1 obj1) {
		return this.eid - obj1.eid;
	}

}
