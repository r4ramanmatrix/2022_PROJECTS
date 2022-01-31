package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practicing3 {
	
	public static void main(String[] args) {
		String name="Raman";
		String temp=""; 
		
		for(int i=name.length()-1;i>=0;i--) {
			temp=temp+name.charAt(i);
		}
		
		System.out.println("Reversing an String: " + temp);
		
		String[] sarray= {"Raman", "Java","Raman", "Selenium"};
		
		for(int i=0;i<=sarray.length-1;i++) {
			System.out.println(sarray[i]);
		}
		
		Set<String> store=new HashSet<String>();
		
		System.out.println("Duplicate String : ");
		
		for(String s1:sarray) {
			if(store.add(s1)==false) {
				System.out.println(s1);
			}
		}
		
		int[] numbers= {1,2,3,4,4,5,5,5,5,5,6,7,8};
		int largest=numbers[0];
		int smallest=numbers[0];
		int temp2=0;
		for(int i=1;i<=numbers.length-1;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		
		System.out.println("Largest number is : " + largest);
		System.out.println("Smallest number is : " + smallest);
		
		System.out.println("Sorted array is: ");
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					temp2=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp2;
				}
			}
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("Duplicate value in an array:");
		Set<Integer> sin=new HashSet<Integer>();
		for(Integer value:numbers) {
			if(sin.add(value)==false) {
				System.out.println(value);
			}
		}
		
		int number=123456789;
		int rev=0;
		while(number!=0) {
			rev=rev*10+number%10;
			number=number/10;
		}
		System.out.println("Reversed number is: " + rev);
		
		System.out.println("Enter a number to check number is prime or not: ");
		int temp4=0;
		Scanner sysin=new Scanner(System.in);
		int num=sysin.nextInt();
		System.out.println("Entered number is:  " + num);
		for(int i=2;i<num-1;i++) {
			if(num%i==0) {
				temp4=temp4+1;
			}
		}if(temp4==0) {
			System.out.println("Entered number is prime");
		}else {
			System.out.println("entered number is not prime!");
		}
	}

}
