package strings;

public class Comparing2 {
	
	public static boolean comparing(String a, String b) {
	    if (a.length() > 4) {
	        a = a.substring(a.length() - 4);
	        if (b.length() > 4) {
	            b = b.substring(b.length() - 4);
	        }
	    }
	    return a.equals(b);
	}
	
	public static void main(String[] args) {
		System.out.println(comparing("aTest1", "bTest1"));
	}

}
