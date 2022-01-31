package interview_basic;

public class Greater {
	
	public static void main(String[] args) {
		
		int a=9999;
		int b=999999;
		int c=999;
		
		if(a>b & a>c) {
			System.out.println("A is greater!!");
		}else if(b>a & b>c) {
			System.out.println("B is greater!!");
		}else {
			System.out.println("C is greater!!");
		}
	}

}
