package march_april;

public class Singleton_Class_1 {

	private final static Singleton_Class_1 obj1 = new Singleton_Class_1();
	String name;

	private Singleton_Class_1() {
		name = "raman kumar";
	}

	public static Singleton_Class_1 getMethod() {
		return obj1;
	}

}
