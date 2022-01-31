package basics;

public class ThisInClass {

	int age = 30;

	public ThisInClass m1() {
		// return this;
		return new ThisInClass();
	}

	public static void main(String[] args) {
		ThisInClass obj = new ThisInClass();
		obj.m1();
	}

}
