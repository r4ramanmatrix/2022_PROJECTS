package extendsAbstractClass;

import abstractClassed.Abstract_Class1;

public class AbsExtends extends Abstract_Class1{
	
	public static void main(String[] args) {
		
		AbsExtends obj=new AbsExtends();
		int C=obj.m2();
		System.out.println("Addition is: " + C);
		obj.m1("Java");
		obj.m1(8);
		
	}

	@Override
	public void m1(int number) {
		System.out.println("Version is: " + number);
		
	}

	@Override
	public void m1(String name) {
		System.out.println("This is " + name + " programming!!");
		
	}

	@Override
	public int m2() {
		int a=100;
		int b=500;
		int c=a+b;
		return c;
	}

}
