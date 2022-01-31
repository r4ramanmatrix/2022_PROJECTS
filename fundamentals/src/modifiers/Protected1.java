package modifiers;

public class Protected1 {
	
	protected int age=30;
	protected String name="Raman";
	
	protected int m1(int value) {
		System.out.println("Value is : " + value);
		return value;
	}
	public static void main(String[] args) {
		Protected1 obj=new Protected1();
		System.out.println("Age is : " +obj.age);
		System.out.println("Name is : " +obj.name);
		int x = obj.m1(101);
		System.out.println(x);
	}

}

