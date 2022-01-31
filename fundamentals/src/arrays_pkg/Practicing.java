package arrays_pkg;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practicing {
	
	public static void main(String[] args) {
		String name="naman";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse is: " + rev);
		
		if(rev.equals(name)) {
			System.out.println("Entered String is Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		System.out.println("Please enter a number:");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println("Entered number is: " + number);
		int temp=0;
		
		for(int i=2;i<number;i++) {
		if(number%i==0) {
			temp=temp+1;
		}
		}
		if(temp==0) {
			System.out.println("Entered number is prime!!");
		}else {
			System.out.println("Not a prime number");
		}
		
		int[] numbers= {1,2,3,3,3,5,5,5};
		
		/*int temp2=0;
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length-1;j++) {
				if(numbers[i]==numbers[j]) {
					System.out.println(numbers[j]);
				}
			}
		}
	}*/
		
		Set<Integer> store=new HashSet<Integer>();
		for(int num1:numbers) {
			if(store.add(num1)==false) {
				System.out.println(num1);
			}
		}
	}
}
