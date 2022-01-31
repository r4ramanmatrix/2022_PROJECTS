package march_april_practice;

public class Accessing_SingletonClass3 {

	public static void main(String[] args) {
		Singleton_Class3 obj1 = Singleton_Class3.getMethod();
		Singleton_Class3 obj2 = Singleton_Class3.getMethod();
		Singleton_Class3 obj3 = Singleton_Class3.getMethod();
		System.out.println("Hashcode:: " + obj1.hashCode());
		System.out.println("Hashcode:: " + obj2.hashCode());
		System.out.println("Hashcode:: " + obj3.hashCode());
		System.out.println("String statement using obj1:: "+obj1.statement );
		System.out.println("String statement using obj2:: "+obj2.statement );
		System.out.println("String statement using obj3:: "+obj3.statement );
		obj1.statement = (obj1.statement).toUpperCase();
		System.out.println("String statement using obj1:: "+obj1.statement );
		System.out.println("String statement using obj2:: "+obj2.statement );
		System.out.println("String statement using obj3:: "+obj3.statement );

	}

}
