package march_april_practice;

public class CP10 implements Comparable<CP10> {

	String name;
	int eid;

	public CP10(String s, int i) {
		name = s;
		eid = i;
	}

	public String toString() {
		return "Name is: " + name + " Employee id is: " + eid;
	}

	public int compareTo(CP10 obj) {
		return this.eid - obj.eid;
	}

}
