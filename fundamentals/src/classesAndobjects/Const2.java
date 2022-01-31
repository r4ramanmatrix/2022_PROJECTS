package classesAndobjects;

public class Const2 extends Const1{
	
	int x=99;
	

	public Const2(String ename, int eid) {
		super(ename, eid);
		this.eid=727;
		System.out.println("x : " + super.x);
		
	}
	
	public static void m1() {
		
		System.out.println("This is child class static method.");
	}

	public static void main(String[] args) {
		Const2 obj=new Const2("Raman Kumar", 30);
		obj.Display();
		m1();
		System.out.println("********************");
		Const1 obj1=new Const1("Sharma", 31);
		obj1.Display();
		obj1.m1();
		System.out.println("********************");
		Const1 obj2=new Const2("Raman Sharma", 266);
		obj2.Display();
		
	}

}
