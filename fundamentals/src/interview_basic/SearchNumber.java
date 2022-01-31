package interview_basic;

import java.util.Scanner;

public class SearchNumber {
	
	public int[] m1() {
		int[] num= {11,3,4,5,6,7,89,99};
		return num;
	}
	
	public static void main(String[] args) {
		SearchNumber obj=new SearchNumber();
		int[] numbers=obj.m1();
		
		int temp=0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		int li=0;
		int hi=numbers.length-1;
		int mi=(li+hi)/2;
		
		System.out.println("Please enter a number to search:");
		Scanner scan=new Scanner(System.in);
		int searchNumber=scan.nextInt();
		System.out.println("Entered number is: " + searchNumber);
		
		while(li<=hi) {
			if(numbers[mi]==searchNumber) {
				System.out.println("Element is present at " + mi +" index position.");
				break;
			}else if(numbers[mi]<searchNumber) {
				li=mi+1;
			}else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}if(li>hi) {
			System.out.println("Entered number not found in array.");
		}
	}

}
