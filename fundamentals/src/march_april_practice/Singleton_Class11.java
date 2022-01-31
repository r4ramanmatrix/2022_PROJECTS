package march_april_practice;

public class Singleton_Class11 {

	String statement;

	public static Singleton_Class11 obj1 = null;

	private Singleton_Class11() {
		statement = "this is a statement";
	}

	public static Singleton_Class11 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class11();
		}
		return obj1;
	}

}
