package classesAndobjects;

public class BasicConst1 {
	
	static int count=0;
	
	{
		count++;
	}
	
	public BasicConst1() {
		this("Aditya");
		System.out.println("This is Parent Class Constructor!!");
		
	}
	
	public BasicConst1(String name) {
		
	}
	
	public BasicConst1(int age) {
		
	}
	
	void BasicConst1() {
		System.out.println("Hallo");
	}
	
	public static void main(String[] args) {
		BasicConst1 obj=new BasicConst1();
		BasicConst1 obj1=new BasicConst1("Raman Kumar");
		BasicConst1 obj3=new BasicConst1(30);
		System.out.println("The number of object created: " + count);
		obj1.BasicConst1();
	}
}
