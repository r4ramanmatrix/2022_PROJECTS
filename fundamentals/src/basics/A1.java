package basics;

public class A1 {

	public A1() {
		this(30);
		System.out.println("This is the non-parameterized constructor");
	}

	public A1(int age) {
		this("Raman");
		System.out.println("My age is: " + age);
	}

	public A1(String names) {
		System.out.println("My name is: " + names);
	}

	public static void main(String[] args) {
		A1 a = new A1();
	}

}
