package basics;

public class Singleton_Class {

	private static Singleton_Class sc = new Singleton_Class();

	private Singleton_Class() {

	}

	public static Singleton_Class getSingle() {
		return sc;
	}

}
