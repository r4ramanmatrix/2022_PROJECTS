package interview_questions;

import java.util.Scanner;

public class FactorialNumber {
	
	public static int fact(int num) {
		if(num==0) {
			return 1;
		}else {
		return (num*fact(num-1));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number=scan.nextInt();
		System.out.println("Entered number is: " + number);
		int fact=1;
		
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);
		
		System.out.println("***********");
		
		System.out.println(fact(4));
	}

}
