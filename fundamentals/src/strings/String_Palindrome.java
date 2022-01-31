package strings;

public class String_Palindrome {
	
	//Check whether a String is a Palindrome
	
	static String pali2="";
	
	public static void m1(String pali) {
		
		
		for(int i=pali.length()-1;i>=0;i--) {
			pali2=pali2+pali.charAt(i);
		}
		if(pali.equalsIgnoreCase(pali2)) {
			System.out.println("String is palindrome");
		}else
			System.out.println("String is not a palindrome");
	}
	
	public static void main(String[] args) {
		m1("Malayalam");
	}

}
