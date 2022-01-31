package strings;

public class ExtractNaming {
	
	static String name ="1235^&%$ Ram&*an Kumar";
	
	public static void main(String[] args) {
		System.out.println(name.replaceAll("[^a-zA-Z]", ""));  // ---- To view only letter from a-zA-Z
		
		System.out.println(name.replaceAll("[\\w]", "")); 		//---- To view only special characters
		
		System.out.println(name.replaceAll("[^0-9]", ""));		//----- To view only integer values
		
		System.out.println(name.replaceAll("[^a-zA-Z0-9]", "")); 	//-----replace all the characters except alphanumeric
		
		String num="+919650975504";
		
		//System.out.println(num.replaceAll("[^0-9]", ""));
		String anum=num.replaceAll("[\\+]", "");
		System.out.println(anum);
		
		
		
	}

}
