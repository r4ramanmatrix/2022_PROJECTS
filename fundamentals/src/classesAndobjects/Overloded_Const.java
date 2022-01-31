package classesAndobjects;

public class Overloded_Const {
	
	public Overloded_Const() {
		this(10);
		System.out.println("This is no argument constructor");
	}
	
	public Overloded_Const(int age) {
		this(99.9);
		System.out.println("int arg");
	}
	
	public Overloded_Const(double price) {
		
		System.out.println("double arg");
	}
	
	public static void m1() {
		m2();
	}
	public static void m2() {
		m1();
	}
	public static void main(String[] args) {
		Overloded_Const obj=new Overloded_Const();
		
		System.out.println("*************");
		Overloded_Const obj1=new Overloded_Const(30);
		
		System.out.println("*************");
		Overloded_Const obj2=new Overloded_Const(99.9);
		
		System.out.println("*************");
		Overloded_Const obj3=new Overloded_Const(10l);
		//m1();
	}

}
