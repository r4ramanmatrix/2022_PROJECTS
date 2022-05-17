package basics_package_2022;

public class Singleton_Practice_1 {

	String statement;
	public static Singleton_Practice_1 obj = null;

	private Singleton_Practice_1() {
		statement = "this is the string statement";
	}

	public static Singleton_Practice_1 getMethod() {
		if (obj == null) {
			obj = new Singleton_Practice_1();
		}
		return obj;
	}

}
