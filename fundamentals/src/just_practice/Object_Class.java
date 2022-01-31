package just_practice;

public class Object_Class implements Cloneable {

	String name;
	Integer age;
	String s;
	Integer i;
	static int agei = 100;
	int roll_no;

	public Object_Class() {
		roll_no = agei;
		agei++;
	}

	public Object_Class(String n, Integer a) {
		this.name = n;
		this.age = a;
		System.out.println(age.hashCode());
	}

	/*
	 * public String toString() { return "Name is: " + name + " and Age is : " +
	 * age; }
	 */

	public int hashCode() {
		return 10;
	}

	public static void main(String[] args) throws Throwable {

		Object_Class obj = new Object_Class("Raman", 32);
		Object_Class obj1 = new Object_Class("Rama", 0);
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.name.toString());
		System.out.println(obj1.toString());
		System.out.println(obj1.age.toString());
		System.out.println(obj.age.hashCode());
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());

		Integer i = new Integer(99);
		System.out.println(i.hashCode());
		// System.out.println(obj.s.hashCode());
		// System.out.println(obj.i.hashCode());
		Object_Class obj2 = new Object_Class();
		System.out.println(obj2);
		System.out.println("Class object is:: " + obj2.getClass());
		Class c = obj2.getClass();
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.isMemberClass());
		System.out.println(c.getPackage());
		System.out.println(c.getFields());

		String s1 = "Raman";
		s1 = null;
		// obj2.finalize();

		System.gc();
		System.out.println(obj2.hashCode());
		obj2 = null;
		System.gc();

		Object_Class obj3 = (Object_Class) obj.clone();
		
		System.out.println("Using equals:: " + obj3.clone().equals(obj));

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Before destroy");
		System.out.println("Release");
		System.out.println("Closed");
	}

}
