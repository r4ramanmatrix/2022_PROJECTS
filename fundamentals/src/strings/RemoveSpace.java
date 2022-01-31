package strings;

public class RemoveSpace {
	
	public static void m1(String s1) {
		System.out.println(s1.replaceAll(" ", ""));
	}
	
	public static void main(String[] args) {
		m1(" R             a m              a n  ");
	}

}
