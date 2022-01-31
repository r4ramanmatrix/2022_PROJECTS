package other_mixPractice;

public class C2 implements Comparable<C2> {

	String ename;
	int eid;

	public C2(String name, int id) {
		ename = name;
		eid = id;
	}

	public String toString() {
		return "Name of employee:: " + ename + " employee id:: " + eid;
	}

	public int compareTo(C2 obj) {
		return this.eid - obj.eid;
	}

}
