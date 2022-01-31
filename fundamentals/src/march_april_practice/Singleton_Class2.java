package march_april_practice;

public class Singleton_Class2 {

	private static Singleton_Class2 obj1 = null;

	String statement;

	private Singleton_Class2() {
		statement = "this is the string statement";
	}

	public static Singleton_Class2 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class2();
		}
		return obj1;
	}

}
