package basics;

public class Construct {

	private int a;

	public Construct(int a) {
		this.a = a;
		a = 99;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		new Construct(99);

	}

}
