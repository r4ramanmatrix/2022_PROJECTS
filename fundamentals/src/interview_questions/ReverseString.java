package interview_questions;

public class ReverseString {
	
	static String name="Raman Kumar";
	
	public static void main(String[] args) {
		
		
		int lengths=name.length();
		
		String reverseName="";
		
		for(int i=lengths-1;i>=0;i--) {
			System.out.println(name.charAt(i));
			//reverseName=reverseName+name.charAt(i);
		}
		System.out.println(reverseName);
		
		StringBuffer sb=new StringBuffer(name);
		
		System.out.println(sb.reverse());
	}

}
