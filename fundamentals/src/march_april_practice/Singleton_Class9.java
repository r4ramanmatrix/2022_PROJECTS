package march_april_practice;

public class Singleton_Class9 {

	public static Singleton_Class9 obj1 = null;
	String name;

	private Singleton_Class9() {
		name = "Raman Kumar";
	}

	public static Singleton_Class9 getMethod() {
		if (obj1 == null) {
			obj1 = new Singleton_Class9();
		}
		return obj1;
	}

}
