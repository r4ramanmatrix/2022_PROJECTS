package variables;

public class Static_Variable {
	
	int x;
	
	static int a;
	
	static final int y;
	
	static {
		y=909;
		int s=109;
		System.out.println(s);
	}
	
	public void m2() {
		
		final int d=8888;
		System.out.println(d);

	}
	
	public static void m1() {
		final int z=909;
		System.out.println(z);
		
	}
	
	public static void main(String[] args) {
		Static_Variable obj=new Static_Variable();
		System.out.println(obj.x);
		System.out.println(a);
		m1();
		obj.m2();
		
		
		
	}

}
