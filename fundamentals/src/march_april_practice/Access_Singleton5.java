package march_april_practice;

public class Access_Singleton5 {

	public static void main(String[] args) {
		Singleton_Class5 obj1 = Singleton_Class5.getMethod();
		Singleton_Class5 obj2 = Singleton_Class5.getMethod();
		Singleton_Class5 obj3 = Singleton_Class5.getMethod();

		System.out.println("HashCode of all objects are:: ");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println("String statement is:: " + obj1.statement);
		System.out.println("String statement is:: " + obj2.statement);
		System.out.println("String statement is:: " + obj3.statement);

		System.out.println("After doing changes in string statement from obj1:: ");
		obj1.statement = (obj1.statement).toUpperCase();
		
		System.out.println("String statement is:: " + obj1.statement);
		System.out.println("String statement is:: " + obj2.statement);
		System.out.println("String statement is:: " + obj3.statement);

	}

}
