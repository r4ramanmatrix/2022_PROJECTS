package march_april_practice;

public class CP4 implements Comparable<CP4> {

	String name;
	int age;

	public CP4(String s, int i) {
		name = s;
		age = i;
	}

	public String toString() {
		return "Name is:: " + name + " Age is:: " + age;
	}

	public int compareTo(CP4 obj1) {
		return this.name.compareTo(obj1.name);
	}

}
