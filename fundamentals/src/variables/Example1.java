package variables;

public class Example1 {

	int i = 99;
	int j;
	static int a = 100;
	static int b;

	public static void m1() {
		System.out.println("Non static variable in static method:  " + new Example1().i);
	}

	public static void main(String[] args) {
		Example1 obj = new Example1();
		new Example1().j = 100;
		obj.j = 101;
		System.out.println(obj.j);
		System.out.println(obj.i);
		System.out.println(a);
		System.out.println(b = 200);
		m1();
	}
}
