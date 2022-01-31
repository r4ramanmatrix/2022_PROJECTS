package interview_questions;

public class ReverseAnArray {
	
	public static void reverse(int[] arr, int num) {
		int[] b=new int[num];
		int j=num;
		
		for(int i=0;i<num;i++) {
			b[j-1]=arr[i];
			j=j-1;
		}
		
		System.out.println("Reverse array is: ");
		for(int i=0;i<num;i++) {
			System.out.println(b[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int[] numbers= {8,3,5,6};
		reverse(numbers, numbers.length);
		
		
	}

}
