package modifiers;

public class Static_Modifier {
	
	int x=10;
	static int y=20;
	
	
	public void m1() {
	
		/*System.out.println("This is instance variable: "+ x);
		System.out.println("This is statc variable: "+ y);	*/
	}
	
	public static void m1(int num) {
		/*System.out.println(num);
		System.out.println(new Static_Modifier().x);*/
	}
	
	public static void main(String[] args) {
		//System.out.println(y);
		m1(y);
		Static_Modifier obj=new Static_Modifier();
		obj.m1();
		System.out.println(obj.x);
		System.out.println(obj.y);
		Static_Modifier obj1=new Static_Modifier();
		obj.x=900;
		obj.y=1000;
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		y=101;
		System.out.println(obj1.y);
	}

}
