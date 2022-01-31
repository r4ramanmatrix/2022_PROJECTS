package basics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practicing3 {
	
	public void m1(int[] num, int lengths) {
		int[] a=new int[lengths];
		int j=lengths;
		
		for(int i=0;i<lengths;i++) {
			a[j-1]=num[i];
			j=j-1;
		}
		
		System.out.println("Reverse array is: ");
		for(int i=0;i<lengths;i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public int[] numbers() {
		int[] nums= {1,9,8,8};
		return nums;
	}
	
	public static void main(String[] args) {
		Practicing3 obj=new Practicing3();
		int[] arr= {4,8,9,1};
		obj.m1(arr, arr.length);
		
		System.out.println("Array is: ");
		int[] arrs=obj.numbers();
		for(int i=0;i<arrs.length;i++) {
			System.out.println(arrs[i]);
		}
		int temp=0;
		for(int i=0;i<arrs.length;i++) {
			for(int j=0;j<arrs.length-1;j++) {
				if(arrs[j]>arrs[j+1]) {
					temp=arrs[j];
					arrs[j]=arrs[j+1];
					arrs[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array is: ");
		for(int i=0;i<arrs.length;i++) {
			System.out.println(arrs[i]);
		}
		
		System.out.println("Duplicate element in array: ");
		Set<Integer> store=new HashSet<>();
		for(int n1:arrs) {
			if(store.add(n1)==false) {
				System.out.println(n1);
			}
		}
		
		int largest=arrs[0];
		int smallest=arrs[0];
		
		for(int i=0;i<arrs.length;i++) {
			if(arrs[i]>largest) {
				largest=arrs[i];
			}else if(arrs[i]<smallest) {
				smallest=arrs[i];
			}
		}
		
		System.out.println("Largest is: " + largest);
		System.out.println("Smallest is: " + smallest);
		
		int fact=1;
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter a number: " );
		int factNumber=scan.nextInt();
		System.out.println("Entered number is: " + factNumber);
		
		for(int i=1;i<=factNumber;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+ factNumber+ " is: " + fact);
		
		System.out.println("Please enter a number: " );
		int primeNumber=scan.nextInt();
		System.out.println("Entered number is: " + primeNumber);
		int temp2=0;
		for(int i=2;i<primeNumber;i++) {
			if(primeNumber%i==0) {
				temp2=temp2+1;
			}
		}if(temp2==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}
		
		String name="Raman Kumar";
		String[] name1=name.split(" ");
		String part1=name1[0];
		String part2=name1[1];
		String rev1="";
		String rev2="";
		String reverseName="";
		for(int i=part1.length()-1;i>=0;i--) {
			rev1=rev1+part1.charAt(i);
		}
		for(int i=part2.length()-1;i>=0;i--) {
			rev2=rev2+part2.charAt(i);
		}
		
		System.out.println(reverseName=rev1 +" " + rev2);
		
		int rev=0;
		int Number=987654321;
		
		while(Number!=0) {
			rev=rev*10+Number%10;
			Number=Number/10;
		}
		
		System.out.println("Reverse number is : " + rev);
		
		String name3=scan.next();
		String reverseName3="";
		for(int i=name3.length()-1;i>=0;i--) {
			reverseName3=reverseName3+name3.charAt(i);
		}
		
		if(reverseName3.equals(name3)) {
			System.out.println("Name is Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		boolean b=false;
		int checkValue=scan.nextInt();
		for(int i=0;i<arrs.length;i++) {
			if(arrs[i]==checkValue) {
				b=true;
				break;
			}
			if(b==true) {
				System.out.println(checkValue+" is present in array.");
			}
		}
		System.out.println(b);
	}

}
