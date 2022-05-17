package basics_package_2022;

public class Access_Singleton_Practice_1 {

	public static void main(String[] args) {
		Singleton_Practice_1 obj1 = Singleton_Practice_1.getMethod();
		Singleton_Practice_1 obj2 = Singleton_Practice_1.getMethod();
		Singleton_Practice_1 obj3 = Singleton_Practice_1.getMethod();

		System.out.println("HashCode of all objects:: \n" + obj1 + "\n" + obj2 + "\n" + obj3);

		obj1.statement = (obj1.statement).toUpperCase();

		System.out.println("Statement for all objects will be:: ");
		System.out.println(obj1.statement);
		System.out.println(obj2.statement);
		System.out.println(obj3.statement);

	}

}
