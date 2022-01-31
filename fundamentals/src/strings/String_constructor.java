package strings;

public class String_constructor {
	
	
	public static void main(String[] args) {
		
	   byte[] b= {112,100,105,106};
		
		String s=new String(b);
		
		System.out.println("String Constructor of Byte Array: " + s);
		
		char[] ch= {'a','b','x','y','z'};
		
		String s1=new String(ch);
		
		System.out.println("String Constructor of Char Array: "+s1);
		
		String s2=new String();
		
		s2="Raman";
		
		System.out.println("Empty String constructor: " + s2);
		
		String s3=new String("RAMAN");
		
		System.out.println("String Constructor of String literal: " +s3);
		
		StringBuffer sb=new StringBuffer("Raman Kumar");
		
		String s4=new String(sb);
		
		System.out.println("String Constructor of StringBuffer: " +s4);
		
		
	}

}
