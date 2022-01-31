package march_april_practice;

public class Access_Singleton_Class6 {

	public static void main(String[] args) {
		Singleton_Class6 obj1 = Singleton_Class6.getMethod();
		Singleton_Class6 obj2 = Singleton_Class6.getMethod();
		Singleton_Class6 obj3 = Singleton_Class6.getMethod();
		System.out.println("HahsCode of all object is:: ");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println(obj1.str);
		System.out.println(obj2.str);
		System.out.println(obj3.str);

		obj1.str = (obj1.str).toUpperCase();

		System.out.println(obj1.str);
		System.out.println(obj2.str);
		System.out.println(obj3.str);
	}

}
