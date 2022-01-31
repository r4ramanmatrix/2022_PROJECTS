package just_practice;

public class Classes_Static {
	
	static long l=99999;
	
	static {
		System.out.println("This is first static block!!!");
		int i=(int)l;
		System.out.println(i);
	}
	
	static {
		System.out.println("This is second static block!!!");
	}
	
	public static void main(String[] args) {
		
		Another another=new Another();
	}
	

}

class Another{
	
	static {
		System.out.println("Another class first static block!!");
	}
	
	static {
		System.out.println("Another class second static block!!");
	}
	
	public static void main(String[] args) {
		
		Classes_Static c=new Classes_Static();
	}
	

}
