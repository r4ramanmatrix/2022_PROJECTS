package basics;

public class CheckPalindrome {
	
	public static void main(String[] args) {
		String pVar="Anna";
		
		String rev="";
		
		for(int i=pVar.length()-1;i>=0;i--) {
			rev=rev+pVar.charAt(i);
		}
		
		System.out.println(rev);
		
		if(rev.equalsIgnoreCase(pVar)) {
			System.out.println("Entered value is palindrome");
		}else {
			System.out.println("Entered value is not palindrome");
		}
	}

}
