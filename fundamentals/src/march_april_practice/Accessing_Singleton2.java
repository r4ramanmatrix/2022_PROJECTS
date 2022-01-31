package march_april_practice;

public class Accessing_Singleton2 {

	public static void main(String[] args) {
		Singleton_Class2 obj1 = Singleton_Class2.getMethod();
		Singleton_Class2 obj2 = Singleton_Class2.getMethod();
		Singleton_Class2 obj3 = Singleton_Class2.getMethod();

		System.out.println("Is hashcode of all reference variable are same? ");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println("Using obj2 keep string statement in uppercase let see its impact on other objects");
		obj2.statement = (obj2.statement).toUpperCase();
		System.out.println(obj1.statement);
		System.out.println(obj2.statement);
		System.out.println(obj3.statement);
		

	}

}
