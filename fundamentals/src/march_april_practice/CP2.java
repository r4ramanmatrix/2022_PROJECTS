package march_april_practice;

public class CP2 implements Comparable<CP2> {

	String name;
	int eid;

	public CP2(String n, int i) {
		name = n;
		eid = i;
	}

	public String toString() {
		return "Name is:: " + name + " Eid is:: " + eid;
	}

	public int compareTo(CP2 obj1) {
		return this.name.compareTo(obj1.name);
	}

}
