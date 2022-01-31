package march_april_practice;

public class Singleton_Class8 {

	public static Singleton_Class8 obj1 = null;

	String statement;

	private Singleton_Class8() {
		statement = "Fail fast fail safe";
	}

	public static Singleton_Class8 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class8();
		}
		return obj1;
	}

}
