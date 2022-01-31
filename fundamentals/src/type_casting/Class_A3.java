package type_casting;

public class Class_A3 extends Class_A2 {

	public void m1() {
		System.out.println("This is m1 method of class A3");
	}

	public static void main(String[] args) {
		Class_A3 a3=new Class_A3();
		a3.m1();
		Class_A2 a2=new Class_A3();
		a2.m1();
		Class_A a=new Class_A3();
		a.m1();
		
	}

}
