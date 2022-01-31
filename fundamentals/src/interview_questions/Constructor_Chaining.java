package interview_questions;

public class Constructor_Chaining {

	public Constructor_Chaining() {
		this(1000);
		System.out.println("This is default constructor");
	}

	public Constructor_Chaining(int age) {
		this("Rama");
		System.out.println("Age is:: " + age);
	}

	public Constructor_Chaining(String name) {
		System.out.println("Name is:: " + name);
	}

	public static void main(String[] args) {
		Constructor_Chaining obj1=new Constructor_Chaining();
	}

}
