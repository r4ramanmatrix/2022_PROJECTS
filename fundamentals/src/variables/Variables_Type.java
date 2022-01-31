package variables;

public class Variables_Type {
	
	int a=99;
	final char c='R';
	static short s=9;
	
	public void m1() {
		int x=99;
		char c='p';
		System.out.println("Inside method: " +c);
	}
	
	public void m1(long l1) {
		System.out.println(l1);
		a=100;
		System.out.println("inside method: " +a);
	}
	public static void main(String[] args) {
		Variables_Type obj=new Variables_Type();
		System.out.println(s);
		obj.m1();
		obj.m1(66l);
		System.out.println(obj.a);
		System.out.println(obj.c);
		System.out.println(s=10);
		System.out.println(s);
	}

}
