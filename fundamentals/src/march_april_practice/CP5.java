package march_april_practice;

public class CP5 implements Comparable<CP5> {

	String name;
	int eid;

	public CP5(String s, int e) {
		name = s;
		eid = e;
	}

	public String toString() {
		return "Name is:: " + name + " Employee Id is:: " + eid;
	}

	public int compareTo(CP5 obj1) {
		return this.name.compareTo(obj1.name);
	}
}
