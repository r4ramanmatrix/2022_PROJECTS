package march_april_practice;

public class Using_Singleton {

	public static void main(String[] args) {
		Singleton_Class obj1 = Singleton_Class.getMethod();
		Singleton_Class obj2 = Singleton_Class.getMethod();
		Singleton_Class obj3 = Singleton_Class.getMethod();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		System.out.println("All objects have same hashCode:: ");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		obj1.statement = (obj1.statement).toUpperCase();
		
		System.out.println("Statement for obj1:: "+obj1.statement);
		System.out.println("Statement for obj2:: "+obj2.statement);
		System.out.println("Statement for obj3:: "+obj3.statement);
	}

}
