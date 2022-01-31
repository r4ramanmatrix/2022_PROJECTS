package basics;

public class ThisInconst {

	public ThisInconst() {
		System.out.println("Default constructor");
	}

	public ThisInconst(int age) {
		this();
		System.out.println("Age is: " + age);
	}

	ThisInconst(String name, int age) {
		this(age);
		System.out.println("Name is : " + name + " and Age is : " + age);
	}

	public static void main(String[] args) {
		ThisInconst obj = new ThisInconst("Raman", 30);
	}

}
