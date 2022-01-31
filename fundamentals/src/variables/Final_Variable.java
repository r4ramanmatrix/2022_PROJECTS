package variables;

public class Final_Variable {
	
	final int x;
	
	
	{
		//x=10; 
	}
	
	public Final_Variable() {
		x=99;
	}
	
	public void m1() {
		
		System.out.println("Final instance variable value: " + x);
	}
	
	public static void main(String[] args) {
		 Final_Variable obj=new Final_Variable();
		 obj.m1();
	}

}
