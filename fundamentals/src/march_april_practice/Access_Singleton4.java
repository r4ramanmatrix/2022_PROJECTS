package march_april_practice;

public class Access_Singleton4 {

	public static void main(String[] args) {
		Singleton_Class4 obj1 = Singleton_Class4.getMethod();
		Singleton_Class4 obj2 = Singleton_Class4.getMethod();
		Singleton_Class4 obj3 = Singleton_Class4.getMethod();

		System.out.println("Hashcode of reference variable::");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println(obj1.getClass().getName());

		System.out.println(obj1.statement + " using obj1");
		System.out.println(obj2.statement + " using obj2");
		System.out.println(obj3.statement + " using obj3");

		obj1.statement = (obj1.statement).toUpperCase();
		
		System.out.println(obj1.statement + " using obj1");
		System.out.println(obj2.statement + " using obj2");
		System.out.println(obj3.statement + " using obj3");

	}

}
