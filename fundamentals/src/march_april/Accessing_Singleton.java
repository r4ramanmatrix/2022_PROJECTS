package march_april;

public class Accessing_Singleton {

	public static void main(String[] args) {
		Singleton_Class_1 obj1 = Singleton_Class_1.getMethod();
		Singleton_Class_1 obj2 = Singleton_Class_1.getMethod();
		Singleton_Class_1 obj3 = Singleton_Class_1.getMethod();
		System.out.println("Object location or name or address :: ");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		System.out.println("Hashcode of all objects:: ");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println("are all objects are equal??");
		if (obj1 == obj2 && obj1 == obj3 && obj2 == obj3 && obj1.equals(obj2) && obj1.equals(obj3)
				&& obj2.equals(obj3)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}

		obj1.name = (obj1.name).toUpperCase();
		System.out.println("Applying toUpperCase() only on obj1 and let see the result for other objects:: ");
		System.out.println("For obj1: " + obj1.name);
		System.out.println("For obj2: " + obj2.name);
		System.out.println("For obj3: " + obj3.name);

	}

}
