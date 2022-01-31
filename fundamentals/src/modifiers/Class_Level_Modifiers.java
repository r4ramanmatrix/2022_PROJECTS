package modifiers;

public class Class_Level_Modifiers {
	
	void m1() {
		System.out.println("Public class m1 method!!");
	}
/*	
	private class A{
		
		public void m1() {
			System.out.println("Private A class m1 method!!");
		}		
		
	}
	*/
/*	static class B{
		
		public static void m1() {
			
			System.out.println("static B class m1 method!!");
		}
		
		public void m1(String name) {
			System.out.println("The World is Ours!!!" + name);
		}
		
	}*/
	
	class C{
		
		public void m1() {
			System.out.println("default class m1 method");
		}
	}

	
	public static void main(String[] args) {
		/*B.m1();
		Class_Level_Modifiers obj=new Class_Level_Modifiers();
		Class_Level_Modifiers.A obj1=obj.new A();*/
/*		obj1.m1();
		obj.m1();
		B obj2=new B();
		obj2.m1("Love it!!!");
		Class_Level_Modifiers.C obj3=obj.new C(); */
		//obj3.m1();
		
		
	}

}
