package march_april_practice;

public class Singleton_Class {

	private final static Singleton_Class scObject = new Singleton_Class();

	String statement;

	private Singleton_Class() {
		statement = "this is the string statement";
	}

	public static Singleton_Class getMethod() {
		return scObject;
	}

}
