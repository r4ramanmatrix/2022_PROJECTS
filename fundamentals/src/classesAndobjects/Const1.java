package classesAndobjects;

public class Const1 {
	
	String name;
	int eid;
	int x=999;
	
	public Const1(String ename, int eid) {
		
		name=ename;
		this.eid=eid;
	}
	
	public static void m1() {
		System.out.println("This is parent class static method!!");
	}
	
	public void Display() {
		System.out.println("Employee name is: " + name);
		System.out.println("Employee id is: " + eid);
	}
		

}
