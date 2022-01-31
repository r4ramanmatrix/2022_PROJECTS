package other_mixPractice;

public class HashCode_Equals {

	static Integer i1 = new Integer(201);
	Integer i2 = new Integer(201);
	Integer i3 = 301;

	public static void main(String[] args) {
		HashCode_Equals obj1 = new HashCode_Equals();
		HashCode_Equals obj2 = new HashCode_Equals();
		HashCode_Equals obj3 = new HashCode_Equals();
		HashCode_Equals obj4=obj1;

		System.out.println(obj1.i1.equals(obj1.i2));
		System.out.println("HashCode checking:: "+obj1.i1.hashCode() + "   " + obj1.i3.hashCode());
		System.out.println(obj1.i1.equals(obj1.i3));
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}

}
