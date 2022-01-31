package variables;

public class SuperClass extends ThisClass {

	int a = 101;

	@Override
	public void m1() {
		super.m1();
		System.out.println(this.a);

	}

	public static void main(String[] args) {
		ThisClass obj = new SuperClass();

		obj.m1();
	}

}
