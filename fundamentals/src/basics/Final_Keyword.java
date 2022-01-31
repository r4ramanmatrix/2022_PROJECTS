package basics;

public class Final_Keyword {
	
	final double a=99.50;
	final int[] number= {11,22,33,44,55}; 
	final int x=9;
	static final int y=99;
	int c;
	final int d;
	static final int f;
	
	/*public Final_Keyword() {
		d=100;
	}*/
	static{
		f=101;
		System.out.println("final static global variable " + f);
	}
	
	{
		d=999;
		System.out.println("final global variables don’t get default value: " +d);
	}
	
	public final void m1() {
		
		double b=a;
		
		
		System.out.println(++b);
		number[2]=99;
		
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
	}
	
	public void m1(String name) {
		
		System.out.println("This is overloded method " + name);
	}
	
	public void m1(final int i) {
		System.out.println("final local variable : " + i);
	}
	
	public static void main(String[] args) {
		
		Final_Keyword obj=new Final_Keyword();
		obj.m1();
		obj.m1("m1");
		/*obj.x=99;
		obj.y=99;*/
		obj.m1(1000);
		
	}

}
