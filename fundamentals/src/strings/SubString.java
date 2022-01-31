package strings;


public class SubString {
	
	String s1="Raman";
	String s2="Raman";
	String rev="";
	char[] ch= {'a','b','c','d'};
	
	public static void main(String[] args) {
		
		SubString obj=new SubString();
		
		String name=String.valueOf(obj.ch);
		
		System.out.println(name);
		
		String name2=Character.toString(obj.ch[2]);
		
		System.out.println(name2);
		
		String s3=new String(obj.ch);
		
		System.out.println(s3);
		
		System.out.println(s3.indexOf("d"));
		
		System.out.println(s3.endsWith("d"));
		
		System.out.println(s3.substring(2));
		
		System.out.println(s3.toCharArray());
		
		System.out.println(s3.charAt(1));
	}
	
}
