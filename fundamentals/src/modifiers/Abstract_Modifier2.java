package modifiers;

public class Abstract_Modifier2 extends Abstract_Modifier {
	
	public void m1(int a,int b) {
		a+=b;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Abstract_Modifier obj=new Abstract_Modifier2();
		obj.m1(99, 1);
		
	}
	
	public int m2(int x) {
		System.out.println(x);
		return 99;
		
	}

}
