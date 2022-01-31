package strings;

public class StringConstructors {
	
	String s1=new String();
	
	StringBuffer sb1=new StringBuffer();
	
	String s2=new String(sb1);
	
	static char[] ch1= {'R','a','m','a','n'};
	
	String s3=new String(ch1);
	
	public static void main(String[] args) {
		
		StringConstructors obj=new StringConstructors();
		
		for(int i=0;i<=ch1.length-1;i++) {
			System.out.println(ch1[i]);
		}
		
		System.out.println(obj.s3);
		
		for(int i=obj.s3.length()-1;i>=0;i--) {
			obj.s2=obj.s2+obj.s3.charAt(i);
		}
		System.out.println(obj.s2);
	}

}
