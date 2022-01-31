package march_april_practice;

public class Access_Singleton7 {

	public static void main(String[] args) {
		Singleton_Class7 obj1 = Singleton_Class7.getMethod();
		Singleton_Class7 obj2 = Singleton_Class7.getMethod();
		Singleton_Class7 obj3 = Singleton_Class7.getMethod();

		System.out.println("Hashcode of all Objects::");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println("String statement using obj1:: " + obj1.statement);
		System.out.println("String statement using obj2:: " + obj2.statement);
		System.out.println("String statement using obj3:: " + obj3.statement);

		obj1.statement = (obj1.statement).toUpperCase();
		System.out.println("********** STring statement in upper case using obj1 casting ***********");
		
		System.out.println("String statement using obj1:: " + obj1.statement);
		System.out.println("String statement using obj2:: " + obj2.statement);
		System.out.println("String statement using obj3:: " + obj3.statement);
	}

}
