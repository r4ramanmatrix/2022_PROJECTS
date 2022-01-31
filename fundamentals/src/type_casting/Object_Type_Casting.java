package type_casting;

public class Object_Type_Casting {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Number n = (Number) i;
		Object o = (Object) n;

		System.out.println("are the i & n are have the same object: " + (i == n));
		System.out.println("are the o & n are have the same object: " + (n == o));
	}

}
