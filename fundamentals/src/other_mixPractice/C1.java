package other_mixPractice;

public class C1 implements Comparable<C1> {

	String name;
	int age;

	public C1(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public String toString() {
		return "Name is:: " + name + " Age is:: " + age;
	}

	public int compareTo(C1 obj) {
		return this.age - obj.age;
	}

}
