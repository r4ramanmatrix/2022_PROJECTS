package variables;

public class Local_Variable {

	int x;

	public void print(int z) {
		this.x = z;
		System.out.println(z);
		System.out.println(this.x);
	}

	public static void m1(int x, int y) {
		final int a;
		// System.out.println(x); //compile time error have to initialize the value for
		// local variable
		System.out.println("Variable X");
		x = 100;
		y = 200;
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		Local_Variable obj = new Local_Variable();
		m1(10, 20);
		obj.print(99);

	}

}
