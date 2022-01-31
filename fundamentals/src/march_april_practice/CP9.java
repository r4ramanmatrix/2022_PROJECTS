package march_april_practice;

public class CP9 implements Comparable<CP9> {

	String name;
	int age;

	public CP9(String s, int i) {
		name = s;
		age = i;

	}

	public String toString() {
		return "Name is:: " + name + " Age is:: " + age;
	}

	public int compareTo(CP9 obj) {
		return this.name.compareTo(obj.name);
	}

}
