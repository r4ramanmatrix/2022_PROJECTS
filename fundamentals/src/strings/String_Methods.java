package strings;

public class String_Methods {
	
	public static void main(String[] args) {
		
		String name="Raman Kumar";
		
		System.out.println(name.charAt(4));
		
		//System.out.println(name.charAt(20)); //java.lang.StringIndexOutOfBoundsException
		
		//name=name+" Sharma";
		
		//name+=" Sharma";
		
		name=name.concat(" Sharma");
		
		System.out.println(name);
		
		//System.out.println(name.equals("RAMAN KUMAR"));
		
		System.out.println(name.equalsIgnoreCase("RAMAN KUMAR"));
		
		String[] asplit=name.split("Kumar");
		
		System.out.println("After spliting : " + asplit[1]);
		
		System.out.println(name.substring(6));
		
		boolean s1=name.contains("Sharma");
		System.out.println(s1);
		
		System.out.println(name.charAt(6));
		
		System.out.println(name.equalsIgnoreCase("Raman"));
		
		System.out.println(name.compareTo("Raman Kumar Sharma"));
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		
	}

}
