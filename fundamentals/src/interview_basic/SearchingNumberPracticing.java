package interview_basic;

import java.util.Scanner;

public class SearchingNumberPracticing {
	
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,7,8,9};
		int li=0;
		int hi=numbers.length-1;
		int mi=(li+hi)/2;
		
		System.out.println("Please enter a number to search: ");
		Scanner scan=new Scanner(System.in);
		int searchNumber=scan.nextInt();
		
		while(li<=hi) {
			if(numbers[mi]==searchNumber) {
				System.out.println("Element present at " + mi +" index position.");
				break;
			}
			else if(numbers[mi]<searchNumber) {
				li=mi+1;
			}else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}if(li>hi) {
			System.out.println("Entered number is not present in the array.");
		}
	}

}
