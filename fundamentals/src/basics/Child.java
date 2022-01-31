package basics;

public class Child extends Parent {

	String name;
	int age;

	public Child() {
		name = "Raman";
		roll = 27;
	}

	public void m1() {
		System.out.println(super.name);
		System.out.println(super.roll);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
	}

}
