package method_type;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String name="Raman";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
