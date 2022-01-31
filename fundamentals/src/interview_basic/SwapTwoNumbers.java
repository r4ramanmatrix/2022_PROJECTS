package interview_basic;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		int one=1;
		int two=2;
		int temp=0;
		
		System.out.println("Before swapping value of one!!" + one);
		System.out.println("Before swapping value of two!!" + two);
		
		/*temp=one;
		one=two;
		two=temp;
		
		System.out.println("*********");
		
		System.out.println("After swapping value of one!!" + one);
		System.out.println("After swapping value of two!!" + two);*/
		
		one=one+two;
		two=one-two;
		one=one-two;
		
		System.out.println("After swapping value of one!!" + one);
		System.out.println("After swapping value of two!!" + two);
		
	}

}
