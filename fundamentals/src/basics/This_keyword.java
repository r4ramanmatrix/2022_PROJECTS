package basics;

public class This_keyword {
	// This keyword can be used to return the current class instance

	int a, b;

	public This_keyword() {
		a = 100;
		b = 200;
	}

	// Method that returns current class instance
	public This_keyword get() {
		System.out.println(a + " " + b);
		return this;
	}

	void display() {
		System.out.println("This is display method");
	}

	public static void main(String[] args) {
		This_keyword obj = new This_keyword();
		obj.get().display();
		new This_keyword().get().display();
	}
}
