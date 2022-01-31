package basics;

public class ThisInMethod {

	public void m1() {
		System.out.println("Without argument method!!");
	}

	public void m1(String name) {
		System.out.println("Name is: " + name);
		this.m1();
	}

	public void m1(int age) {
		System.out.println("Age is: " + age);
		this.m1("Raman");
	}

	public static void main(String[] args) {
		ThisInMethod obj = new ThisInMethod();
		obj.m1(30);
	}

}
