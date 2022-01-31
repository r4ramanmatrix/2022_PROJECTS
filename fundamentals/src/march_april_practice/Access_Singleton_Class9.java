package march_april_practice;

public class Access_Singleton_Class9 {

	public static void main(String[] args) {
		Singleton_Class9 obj1 = Singleton_Class9.getMethod();
		Singleton_Class9 obj2 = Singleton_Class9.getMethod();
		Singleton_Class9 obj3 = Singleton_Class9.getMethod();

		System.out.println("Hashcode of all objects are: ");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println("CHange from one object reflect in all");
		obj1.name = (obj1.name).toUpperCase();
		System.out.println(obj1.name);
		System.out.println(obj2.name);
		System.out.println(obj3.name);
		
	}

}
