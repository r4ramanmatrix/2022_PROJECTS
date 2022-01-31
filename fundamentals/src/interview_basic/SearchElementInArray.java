package interview_basic;

import java.util.Scanner;

public class SearchElementInArray {
	
	public int[] m1() {
		int[] arr= {22,3,5,6,9,1,2};
		return arr;
		
	}
	
	public static void main(String[] args) {
		SearchElementInArray obj=new SearchElementInArray();
		int[] number=obj.m1();
		int temp=0;
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number.length-1;j++) {
				if(number[j]>number[j+1]) {
					temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
		int li=0;
		int hi=number.length-1;
		int mi=(li+hi)/2;
		
		System.out.println("Please enter the number");
		Scanner scan=new Scanner(System.in);
		int searchNumber=scan.nextInt();
		System.out.println("Entered number is: " + searchNumber);
		
		while(li<=hi) {
			if(number[mi]==searchNumber) {
				System.out.println("Element is present at " + mi + " index position");
				break;
			}else if(number[mi]<searchNumber) {
				li=mi+1;
			}else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("Element not found in array!!");
		}
		
	}

}
