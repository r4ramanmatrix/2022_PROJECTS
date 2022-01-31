package march_april_practice;

public class Singleton_Class12 {

	String statement;

	public static Singleton_Class12 obj = null;

	private Singleton_Class12() {
		statement = "this is a String statement";
	}

	public static Singleton_Class12 getMethod() {
		if (obj == null) {
			obj = new Singleton_Class12();
		}
		return obj;
	}

}
