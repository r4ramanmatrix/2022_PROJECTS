package basics;

class StaticComponents{
	static int svariable;
	
	static {
		System.out.println("Static component");
		svariable=99;
	}
	
	static void staticMethod() {
		System.out.println("This is static method");
		System.out.println(svariable);
	}
}

public class AllAboutStatic {
	
	static {
		System.out.println("AllAboutStatic class Static initialization block!!");
	}
	
	public static void main(String[] args) {
		StaticComponents.svariable=100; 
		StaticComponents.staticMethod();
	}

}
