package strings;

public class Compare2 {
	
	public static boolean comp(String s1, String s2) {
		if(s1.equalsIgnoreCase(s2)) {
			return true;
		}if(s1.trim().equalsIgnoreCase(s2.trim())) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(comp("Hello  ", " hello     "));
	}

}
