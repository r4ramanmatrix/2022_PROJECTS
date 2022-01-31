package march_april;

public class CL1 implements Comparable<CL1> {

	String name;
	int age;

	public CL1(String n, int a) {
		name = n;
		age = a;
	}

	public String toString() {
		return "Name is:: " + name + " Age is:: " + age;
	}

	public int compareTo(CL1 obj) {
		return this.age - obj.age;
	}

}
