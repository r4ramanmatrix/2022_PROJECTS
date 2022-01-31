package method_type;

import modifiers.Protected1;

public class Protected4 extends Protected3 {
	
	public static void main(String[] args) {
		
		Protected1 obj=new Protected1();
		//obj.m1();
		
		Protected3 obj1=new Protected3();
		//obj1.m1();
		
		Protected4 obj2=new Protected4();
		obj2.m1(100);
		
		Protected1 obj3=new Protected4();
		//obj3.m1();
		
		Protected3 obj4=new Protected4();
		//obj4.m1();
		
		
		
	}

}
