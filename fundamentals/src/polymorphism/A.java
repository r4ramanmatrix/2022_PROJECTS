package polymorphism;

import interfaces.Interface2;

public class A implements Interface2 {

	public void run() {
		System.out.println("Class A run method");
	}

	@Override
	public void add(int x, int y) {
		System.out.println(x + y);

	}

	@Override
	public void multiply(int x, int y) {
		System.out.println(x * y);

	}

	private void m1() {

	}

}
