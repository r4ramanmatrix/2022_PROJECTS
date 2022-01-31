package interview_basic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practicing2 {
	
	public void arrs(int[] num, int lengths) {
		int[] a =new int[lengths];
		int j=lengths;
		
		for(int i=0;i<num.length;i++) {
			a[j-1]=num[i];
			j=j-1;
		}
		System.out.println("Array element in reverse order: ");
		for(int i=0;i<num.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Practicing2 obj=new Practicing2();
		int[] numbers= {11,2,9,8,7,44,2};
		
		System.out.println("Actual order of element in array");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		obj.arrs(numbers, numbers.length);
		
		System.out.println("Sorted element of array:");
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
		
		System.out.println("Duplicate element in array: ");
		Set<Integer> store=new HashSet<>();
		
		for(int n1:numbers) {
			if(store.add(n1)==false) {
				System.out.println(n1);
			}
		}
		
		int fact=1;
		int factNumber=6;
		
		for(int i=1;i<=factNumber;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial is: " + fact);
		
		int first=0;
		int second=1;
		int number=10;
		int next;
		System.out.print(first + " " + second + " ");
		for(int i=2;i<number;i++) {
			next=first+second;
			System.out.print(next + " ");
			first=second;
			second=next;
		}
		
		System.out.println();
		
		String name1="naman";
		String reverseName1="";
		for(int i=name1.length()-1;i>=0;i--) {
			reverseName1=reverseName1+name1.charAt(i);
		}
		System.out.println("Name after reversing is: " + reverseName1);
		if(reverseName1.equals(name1)) {
			System.out.println("Entered String is palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		String name2="Raman Kumar";
		String[] splitName=name2.split(" ");
		String part1=splitName[0];
		String part2=splitName[1];
		String revpart1="";
		String revpart2="";
		String finalResult="";
		
		for(int i=part1.length()-1;i>=0;i--) {
			revpart1=revpart1+part1.charAt(i);
		}
		
		for(int i=part2.length()-1;i>=0;i--) {
			revpart2=revpart2+part2.charAt(i);
		}
		
		System.out.println(finalResult= revpart1 + " " + revpart2);
		
		int temp2=0;
		System.out.println("Please neter a number");
		Scanner scan=new Scanner(System.in);
		int pNumber=scan.nextInt();
		System.out.println("Entered number is: " + pNumber);
		
		for(int i=2;i<pNumber;i++) {
			if(pNumber%i==0) {
				temp2=temp2+1;
			}
		}if(temp2==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
		
		int number2=987654321;
		int rev=0;
		
		while(number2!=0) {
			rev=rev*10+number2%10;
			number2=number2/10;
		}
		System.out.println("Number after reversing is: " + rev);
		
		int sum=0;
		
		for(int i=0;i<pNumber;i++) {
			sum+=i;
		}
		System.out.println("Sumo of digits is: " +sum);
		
		int number3=131310;
		int rev3=0;
		int temp3=number3;
		
		while(number3!=0) {
			rev3=rev3*10+number3%10;
			number3=number3/10;
		}
		if(temp3==rev3) {
			System.out.println("Palindrome Number");
		}else{
			System.out.println("Not a Palindrome number");
		}
	}

}
