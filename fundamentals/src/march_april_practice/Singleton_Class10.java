package march_april_practice;

public class Singleton_Class10 {

	public static Singleton_Class10 obj1 = null;

	String statement;

	private Singleton_Class10() {
		statement = "THIS IS JAVA";
	}

	public static Singleton_Class10 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class10();
		}
		return obj1;
	}
}
