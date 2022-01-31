package interfaceimplementedclass;

import interfaces.Webs;

public class InterfaceImplementedClass implements Webs {
	
	public static void main(String[] args) {
		InterfaceImplementedClass obj=new InterfaceImplementedClass();
		obj.number();
		System.out.println(obj.number());
		Webs.m1();
	}

	@Override
	public int number() {
		System.out.println("This is Webs interface method");
		Webs.m1();
		return 10;
		
	}

}
