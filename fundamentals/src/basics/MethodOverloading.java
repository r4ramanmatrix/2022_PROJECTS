package basics;

public class MethodOverloading {

	public void m1(int a, double d) {
		System.out.println("m1(int a, double d)");
	}

	public void m1(double d, int i) {
		System.out.println("m1(double d, int i)");
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		// obj.m1(20, 30);

		obj.m1(30.1, 9);
	}

}
