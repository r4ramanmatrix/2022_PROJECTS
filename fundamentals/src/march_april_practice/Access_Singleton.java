package march_april_practice;

public class Access_Singleton {

	public static void main(String[] args) {
		Singleton_Class12 obj1 = Singleton_Class12.getMethod();
		Singleton_Class12 obj2 = Singleton_Class12.getMethod();
		Singleton_Class12 obj3 = Singleton_Class12.getMethod();

		System.out.println("HashCode of Objects:: ");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		obj1.statement = obj1.statement.toUpperCase();
		
		System.out.println(obj1.statement);
		System.out.println(obj2.statement);
		System.out.println(obj3.statement);

	}

}
