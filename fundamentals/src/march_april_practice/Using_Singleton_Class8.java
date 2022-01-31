package march_april_practice;

public class Using_Singleton_Class8 {

	public static void main(String[] args) {
		Singleton_Class8 obj1 = Singleton_Class8.getMethod();
		Singleton_Class8 obj2 = Singleton_Class8.getMethod();
		Singleton_Class8 obj3 = Singleton_Class8.getMethod();

		System.out.println("Hashcode of all objects:: ");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println("Statement variable value is:: " + obj1.statement);

		obj1.statement = obj1.statement.toUpperCase();
		
		System.out.println("Statement variable value is:: " + obj1.statement);
		System.out.println("Statement variable value is:: " + obj2.statement);
		System.out.println("Statement variable value is:: " + obj3.statement);
		
	}

}
