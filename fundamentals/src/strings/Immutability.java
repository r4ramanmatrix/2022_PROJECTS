package strings;

public class Immutability {
	
	static String s="Raman";
	
	
	public static void main(String[] args) {
		String r=s;
		String a=s;
		String m=s;
		String a1=s;
		String n=s;
		s=s+"Kumar";
		
		
		
		System.out.println(s);
		System.out.println(a);
	}

}

