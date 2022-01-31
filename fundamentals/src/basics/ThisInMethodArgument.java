package basics;

public class ThisInMethodArgument {

	public void m1(ThisInMethodArgument obj1) {
		System.out.println("This is m1 method!!");
		System.out.println(obj1.getClass());
	}

	public void m2() {
		m1(this);
	}

	public static void main(String[] args) {
		ThisInMethodArgument obj = new ThisInMethodArgument();
		obj.m2();
	}

}
