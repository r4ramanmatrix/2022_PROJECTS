package interview_questions;

import java.util.Arrays;

public class LargestAndSmallestNumber {
	
	public static void main(String[] args) {
		
		
		int numbers[]= {-10,1,2,3,1000,4,5,6,88,99};
		//int sum=0;
		
		int largest=numbers[0];
		int smallest=numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		System.out.println("Array is : " + Arrays.toString(numbers));
		System.out.println("Largest Number is : "+largest);
		System.out.println("Smallest number is: " + smallest);
		
		
	}

}
