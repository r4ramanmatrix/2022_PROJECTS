package interview_questions;

import java.util.Scanner;

public class SearchNumberInArray {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		
		int li=0;
		int hi=arr.length-1;
		int mi=(li+hi)/2;
		
		System.out.println("Please enter the number to search!!");
		Scanner scan=new Scanner(System.in);
		int srch=scan.nextInt();
		System.out.println("Entered number to search is: " + srch);
		
		while(li<=hi) {
			if(arr[mi]==srch) {
				System.out.println("Element is present at " + mi + " index position!!!");
				break;
			}else if(arr[mi]<srch) {
				li=mi+1;
				
			}else {
				hi=mi-1;
				
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("Element not found!!!");
		}
	}

}
