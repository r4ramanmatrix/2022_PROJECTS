package march_april_practice;

public class CP3 implements Comparable<CP3> {

	String name;
	int age;

	public CP3(String s, int i) {
		name = s;
		age = i;
	}

	public String toString() {
		return "Name is:: " + name + " Age is:: " + age;
	}

	public int compareTo(CP3 obj) {
		return this.name.compareTo(obj.name);
	}

}
