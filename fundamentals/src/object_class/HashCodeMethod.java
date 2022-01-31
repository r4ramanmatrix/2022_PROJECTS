package object_class;

public class HashCodeMethod {

	int age;

	public HashCodeMethod(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return age + "";
	}

	@Override
	public int hashCode() {
		return age;
	}

	public static void main(String[] args) {
		HashCodeMethod obj = new HashCodeMethod(101);
		HashCodeMethod obj1 = new HashCodeMethod(102);
		HashCodeMethod obj2 = new HashCodeMethod(103);
		int a = obj.hashCode();
		int b = obj.hashCode();
		System.out.println(a + "\n" + b);
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
