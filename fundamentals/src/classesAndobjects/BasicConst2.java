package classesAndobjects;

public class BasicConst2 {
	
	private BasicConst2() {
		
		System.out.println("This is private modifier type Constructor!!");
	}
	
	BasicConst2(String name){
		this(31);
		System.out.println("Name is: " + name);
	}
	
	protected BasicConst2(int age) { 
		
		System.out.println("Age is: " + age);
		
	}
	
	public BasicConst2(double salary) {
		System.out.println("Salary is: " + salary);
	}
	
	public String m1(String name1) {
		
		System.out.println("My name is " + name1);
		this.m1(266);
		return name1;
	}
	
	public void m1(int eid) {
		
		System.out.println("Employee id is: " + eid);
		
	}
	
	public static void main(String[] args) {
		BasicConst2 obj1=new BasicConst2();
		BasicConst2 obj2=new BasicConst2("Raman Kumar");
		BasicConst2 obj3=new BasicConst2(30);
		BasicConst2 obj4=new BasicConst2(10.70);
		String name2=obj1.m1("Raman Kumar Sharma");
	}

}
