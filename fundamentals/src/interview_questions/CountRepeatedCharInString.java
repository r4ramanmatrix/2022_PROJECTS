package interview_questions;

public class CountRepeatedCharInString {
	
	static String s1="aaaabbbccdd";
	
	public final void m1() {
		
	}
	
	public final void m1(int a) {
		
	}
	
	public static void main(String[] args) {
		
		int count=0;
		char temp=s1.charAt(0);
		for(int i=0;i<=s1.length()-1;i++) {
		if(s1.charAt(i)==temp) {
			count++;
		}else {
			System.out.print(temp+ "" + count);
			count=1;
			temp=s1.charAt(i);
		}
	}		
}

}
