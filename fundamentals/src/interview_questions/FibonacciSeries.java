package interview_questions;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		System.out.println("Please enter a number");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println("Entered number is: " + number);
		System.out.print(first + " " + second + " ");
		int next;
		for(int i=2;i<number;i++) {
			next=first+second;
			System.out.print(next + " ");
			first=second;
			second=next;
		}
	}

}
