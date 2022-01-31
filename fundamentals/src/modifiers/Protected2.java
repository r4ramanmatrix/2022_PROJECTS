package modifiers;

public class Protected2 extends Protected1{
	
	public int m1(int val) {
		super.m1(1001);
		System.out.println("Protected2 class method!! " + val);
		
		return val;
	}
	
	public static void main(String[] args) {
		Protected2 obj=new Protected2();
		
		obj.m1(999);
		
		Protected1 obj1=new Protected1();
		obj1.m1(888);
		
		Protected1 obj2=new Protected2();
		obj2.m1(777);
		
	}

}
