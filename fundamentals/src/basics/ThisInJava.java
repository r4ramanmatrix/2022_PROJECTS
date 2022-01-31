package basics;

public class ThisInJava {

	int a;
	int b;
	int x;

	public ThisInJava(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public ThisInJava(int a) {
		x = a;
	}

	public static void main(String[] args) {
		ThisInJava obj = new ThisInJava(5, 6);
		System.out.println(obj.a);
		System.out.println(obj.b);
		ThisInJava obj1 = new ThisInJava(10);
		System.out.println(obj1.x);

	}

}
