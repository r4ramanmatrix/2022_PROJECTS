package march_april_practice;

public class Singleton_Class7 {

	private static Singleton_Class7 obj1 = null;
	String statement;

	private Singleton_Class7() {
		statement = "this is the string statement";
	}

	public static Singleton_Class7 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class7();
		}
		return obj1;
	}

}
