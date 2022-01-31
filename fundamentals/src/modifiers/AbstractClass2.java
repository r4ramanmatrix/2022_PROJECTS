package modifiers;

public class AbstractClass2 extends AbstractClass1 {
	
	public void m1() {
		System.out.println("This is Abstract Class1 abstract method!!");
	}
	
	public int m2() {
		int x=999;
		return x;
	}
	
	public static void main(String[] args) {
		AbstractClass2 obj=new AbstractClass2();
		obj.m1();
		int x=obj.m1(100);
		int z=obj.m2();
		System.out.println(z);
		obj.m5();
		
	}

}
