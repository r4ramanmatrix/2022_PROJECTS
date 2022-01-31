package march_april_practice;

public class Singleton_Class4 {

	public static Singleton_Class4 obj1 = null;
	String statement;

	private Singleton_Class4() {
		statement = "this is the string statement";
	}

	public static Singleton_Class4 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class4();
		}
		return obj1;
	}

}
