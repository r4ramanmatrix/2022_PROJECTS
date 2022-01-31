package march_april;

public class Singleton_Class {

	private static Singleton_Class sc = new Singleton_Class();

	String name;

	private Singleton_Class() {
		name = "my name is java";
	}

	public static Singleton_Class getInstance() {
		return sc;
	}
}
