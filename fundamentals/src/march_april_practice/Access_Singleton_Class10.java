package march_april_practice;

public class Access_Singleton_Class10 {

	public static void main(String[] args) {
		Singleton_Class10 obj1 = Singleton_Class10.getMethod();
		Singleton_Class10 obj2 = Singleton_Class10.getMethod();
		Singleton_Class10 obj3 = Singleton_Class10.getMethod();

		// Can't create object in this class as we declare our class as private
		// Singleton_Class10 obj4 = new Singleton_Class10();

		System.out.println("Hashcode of all objects:: ");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println("String statement: " + obj1.statement);
		obj1.statement = (obj1.statement).toLowerCase();
		System.out.println("String statement: " + obj2.statement);
	}

}
