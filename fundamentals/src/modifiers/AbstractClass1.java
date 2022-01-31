package modifiers;

public abstract class AbstractClass1 {
	
	public abstract void m1();
	
	
	
	/*public final abstract void m2();
	
	public native abstract void m3();
	
	public synchronized abstract void m4();
	
	public static abstract void m5();
	
	private abstract void m6();*/
	
	public final void m5() {
		
		System.out.println("This is abstract class final method!!");
	}
	
	public int m1(int a) {
		System.out.println(a);
		return a;
	}
	
	public abstract int m2();
	
	public static void main(String[] args) {
		System.out.println("This is Abstract Class1");
	}

}
