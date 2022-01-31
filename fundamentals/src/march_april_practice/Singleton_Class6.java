package march_april_practice;

public class Singleton_Class6 {

	public static Singleton_Class6 obj1 = null;

	String str;

	private Singleton_Class6() {
		str = "this is the java language";
	}

	public static Singleton_Class6 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class6();
		}
		return obj1;
	}

}
