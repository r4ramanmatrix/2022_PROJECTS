package polymorphism;

public class B extends A {

	@Override
	public void run() {
		System.out.println("Class B method run");
	}

	public int m1() {
		int a;
		return a = 99;
	}

	public static void main(String[] args) {
		A a = new A();
		a.add(50, 40);
		a.multiply(100, 5);
		a.run();

		B b = new B();
		b.add(50, 60);
		b.multiply(100, 6);
		b.run();

		A a1 = new B();
		a1.run();
		b.m1();

	}

}
