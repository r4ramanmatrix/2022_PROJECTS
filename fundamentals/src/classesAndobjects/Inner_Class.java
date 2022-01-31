package classesAndobjects;

public class Inner_Class {  //Outer class
	
	class A{		//Inner class
		public void m1() {
			System.out.println("This is inner class non static method!!");
		}
	}
	
	static class B{
		
		public static void m1() {
			System.out.println("This is inner class static method!!");
		}
	}
	
	public static void main(String[] args) {
		B.m1();
		Inner_Class obj=new Inner_Class();
		
		
	}

}
