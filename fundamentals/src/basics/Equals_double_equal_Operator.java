package basics;

public class Equals_double_equal_Operator {

	String str;

	public Equals_double_equal_Operator(String str) {
		this.str = str;
	}

	static String str1 = "Java";
	static String str2 = "Java";

	static Integer i = 99;
	static Integer i1 = 99;

	public static void main(String[] args) {
		Equals_double_equal_Operator obj1 = new Equals_double_equal_Operator("OBJ");
		Equals_double_equal_Operator obj2 = new Equals_double_equal_Operator("OBJ");

		System.out.println("Is double equal operator refer the same object: " + (obj1 == obj2));
		System.out.println("Object are equal?: " + obj1.equals(obj2));

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(i == i1);
		System.out.println(i.equals(i1));

		int a = 100;
		int b = 200;

		System.out.println(a == b);
		// System.out.println(a.equals(b));

		char[] ch = new char[2];
		int[] arr = new int[2];

		System.out.println("char and int primitive are equal? " + ch.equals(arr));

		ch[0] = 10;
		ch[1] = 20;

		arr[0] = 10;
		arr[1] = 20;

		System.out.println(ch[1] == arr[1]);
		String name = "A";
		Character c = 'A';
		System.out.println(name.equals(c));

	}

}
