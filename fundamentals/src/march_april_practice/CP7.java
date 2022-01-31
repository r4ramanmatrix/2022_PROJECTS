package march_april_practice;

public class CP7 implements Comparable<CP7> {

	String name;
	int age;

	public CP7(String s, int a) {
		name = s;
		age = a;
	}

	public String toString() {
		return "Name is:: " + name + " Age is:: " + age;
	}

	public int compareTo(CP7 obj1) {
		return this.age - obj1.age;

	}

}
