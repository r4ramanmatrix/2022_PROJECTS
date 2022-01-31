package interfaces;

public class Implements1and2 implements Interface1.child, Interface2{

		int result;
		
	public void add(int x, int y) {
		result=x+y;
		System.out.println(result);
	}

	
	public void multiply(int x, int y) {
		
		result=x*y;
		System.out.println(result);
	}
	
	public void msg() {
		System.out.println("This child interface of Interface1");
	}
	
	public static void main(String[] args) {
		Implements1and2 obj=new Implements1and2();
		obj.add(a, b);
		obj.multiply(a, b);
		obj.msg();	
		Interface1.child.m1();
		Interface2.m1();		
	}

}
