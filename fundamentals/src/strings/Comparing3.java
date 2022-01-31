package strings;

public class Comparing3 {
	
	public static boolean comp(String str1, String str2) {
		
		if(str1.substring(1, 4).equalsIgnoreCase(str2.substring(1, 4))) {
			return true;
		}
		return false;
		
	}
	
	public static boolean comp2(String str1, String str2) {
		if(str1.substring(0, 2).equals(str2.substring(0, 2))) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(comp("RAMAN", "Raman"));
		System.out.println(comp2("Hello", "helmno"));
	}

}
