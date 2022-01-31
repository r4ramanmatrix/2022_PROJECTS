package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing3 {
	
	public int[] m1() {
		
		System.out.println("Returning array method!!");
		int[] arr= {9,7,1,2,4,7,-10};
		return arr;
	}
	
	public void m1(int[] num, int lengths) {
		int[] a=new int[lengths];
		int j=lengths;
		
		for(int i=0;i<num.length;i++) {
			a[j-1]=num[i];
			j=j-1;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Practicing3 obj=new Practicing3();
		int[] number=obj.m1();
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		System.out.println("Array in reverse order: ");
		obj.m1(number, number.length);
		
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
		System.out.println("Sorted Array: ");
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
		
		System.out.println("Duplicate element in array: ");
		Set<Integer> store=new HashSet<>();
		for(int n1:number) {
			if(store.add(n1)==false) {
				System.out.println(n1);
			}
		}
		
		int largest=number[0];
		int smallest=number[0];
		for(int i=0;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}else if(number[i]<smallest) {
				smallest=number[i];
			}
		}
		
		System.out.println("Largest element is: " + largest);
		System.out.println("Smallest element is: " + smallest);
		System.out.println("Second largest element is : " + number[number.length-2] );
		
		int fact=1;
		int factNumber=6;
		for(int i=1;i<=factNumber;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " + factNumber +" is " + fact);
		
		int temp2=0;
		int primeNumber=4;
		for(int i=2;i<primeNumber;i++) {
			if(primeNumber%i==0) {
				temp2=temp2+1;
			}
		}if(temp2==0) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Number is not prime");
		}
		System.out.println("Fibonacci Series is: ");
		int first=0;
		int second =1;
		int next;
		int fnumber=10;
		System.out.print(first +" " + second + " ");
		for(int i=2;i<fnumber;i++) {
			next=first+second;
			System.out.print(next + " ");
			first=second;
			second=next;
		}
		System.out.println();
		
		int actualNumber=13131;
		int revNumber=0;
		int temp3=actualNumber;
		while(actualNumber!=0) {
			revNumber=revNumber*10+actualNumber%10;
			actualNumber=actualNumber/10;
		}
		System.out.println("Number after reversing: " + revNumber);
		if(revNumber==temp3) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Not a palindrome number");
		}
		
		String name1="Raman";
		String revName="";
		
		for(int i=name1.length()-1;i>=0;i--) {
			revName=revName+name1.charAt(i);
		}
		
		System.out.println("Name after reversing : " + revName);
		
		String name2="www.google.com";
		String[] name2Split=name2.split("\\.");
		String part1=name2Split[0];
		String part2=name2Split[1];
		String part3=name2Split[2];
		
		String revPart1="";
		String revPart2="";
		String revPart3="";
		
		for(int i=part1.length()-1;i>=0;i--) {
			revPart1=revPart1+part1.charAt(i);
		}
		
		for(int i=part2.length()-1;i>=0;i--) {
			revPart2=revPart2+part2.charAt(i);
		}
		
		for(int i=part3.length()-1;i>=0;i--) {
			revPart3=revPart3+part3.charAt(i);
		}
		
		System.out.println("Name2 after reversing on their positions: " +revPart1 +" " + revPart2 + " " + revPart3);
		
		String name3="katak";
		String revName3="";
		String temp4=name3;
		
		for(int i=name3.length()-1;i>=0;i--) {
			revName3=revName3+name3.charAt(i);
		}
		System.out.println("Reverse name is: "+ revName3);
		if(revName3.equals(temp4)) {
			System.out.println("Entered String is Palindrome!!! ");
		}else{
			System.out.println("String is not palindrome");
		}
		
		System.out.println("Sorted "+ name3 +" is: ");
		char[] ch1=name3.toCharArray();
		char temp5=0;
		for(int i=0;i<=ch1.length;i++) {
			for(int j=0;j<ch1.length-1;j++) {
				if(ch1[j]>ch1[j+1]) {
					temp5=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp5;
				}
			}
		}
		for(int i=0;i<ch1.length;i++) {
			System.out.println(ch1[i]);
		}
		
		
		int count=0;
		for(int i=0;i<name3.length();i++) {
			if(Character.isLetter(name3.charAt(i))) {
				count++;
			}
		}
		System.out.print("Number of letters in String "+count);
		
		System.out.println();
		int count2=1;
		for(int i=0;i<=name2.length()-1;i++) {
			if((name2.charAt(i)=='.') && (name2.charAt(i+1)!='.')) {
				count2++;
			}
		}
		System.out.println("Number of words in String : " + count2);
		
		String value="100";
		
		String addInt=value+100;
		System.out.println(addInt);
		Integer stringInt=Integer.valueOf(value);
		System.out.println(stringInt + 100);
		
		String firstName="Raman";
		String lastName="Kumar";
		
		System.out.println("First name before swapping: " + firstName);
		System.out.println("Last name before swapping: " + lastName);
		
		firstName=firstName+lastName;
		lastName=firstName.substring(0,firstName.length()-lastName.length());
		firstName=firstName.substring(lastName.length());
		
		System.out.println("First name after swapping: " + firstName);
		System.out.println("Last name after swapping: " + lastName);
				
	}

}
