package march_april_practice;

public class CP6 implements Comparable<CP6> {

	String name;
	int age;

	public CP6(String s, int i) {
		name = s;
		age = i;
	}

	public String toString() {
		return "Name is:: " + name + " Age is: " + age;
	}

	public int compareTo(CP6 obj1) {
		return this.name.compareTo(obj1.name);
	}
}
