package interview_questions;

public class ReversingNumber {
	
	static int num=987654321;
	
	public void m1() {
		
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println(rev);
	
	}
	
	public void m2() {
		
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}
	
	public static void main(String[] args) {
		
		ReversingNumber obj=new ReversingNumber();
		//obj.m1();
		obj.m2();
		
	}
	
	
	
	

}
