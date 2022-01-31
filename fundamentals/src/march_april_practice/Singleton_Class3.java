package march_april_practice;

public class Singleton_Class3 {

	public static Singleton_Class3 obj1 = null;
	String statement;

	private Singleton_Class3() {
		statement = "this is the string";
	}

	public static Singleton_Class3 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class3();
		}
		return obj1;
	}

}
