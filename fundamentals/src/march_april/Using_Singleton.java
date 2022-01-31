package march_april;

public class Using_Singleton {

	public static void main(String[] args) {

		Singleton_Class obj1 = Singleton_Class.getInstance();
		Singleton_Class obj2 = Singleton_Class.getInstance();
		Singleton_Class obj3 = Singleton_Class.getInstance();
		System.out.println("Before implementing logic:: " + obj1.name);
		System.out.println("Before implementing logic:: " + obj2.name);
		System.out.println("Before implementing logic:: " + obj3.name);

		System.out.println("After implementing logic to only obj1:: ");

		obj1.name = (obj1.name).toUpperCase();
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		System.out.println(obj3.name);

		System.out.println("Implementing logic to only obj3:: ");
		obj3.name = (obj3.name).toLowerCase();
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		System.out.println(obj3.name);
	}

}
