package interview_questions;

import java.util.Scanner;

public class Prime_Number {
	
	public static void main(String[] args) {
		
		int temp=0;
		System.out.println("Please enter a number: ");
		Scanner sin=new Scanner(System.in);
		int number=sin.nextInt();
		System.out.println("Entered number is: " + number);
		
		for(int i=2;i<=number-1;i++) {
			if(number%i==0) {
				temp=temp+1;
			}
		}if(temp==0) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	}

}
