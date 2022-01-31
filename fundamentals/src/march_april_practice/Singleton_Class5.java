package march_april_practice;

public class Singleton_Class5 {

	private static Singleton_Class5 obj1 = null;
	String statement;

	private Singleton_Class5() {
		statement = "This is String statement in java";
	}

	public static Singleton_Class5 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class5();
		}
		return obj1;
	}

}
