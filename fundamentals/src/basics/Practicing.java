package basics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practicing {
	
	public void arrsPass(int num1[]) {
		
		System.out.println("Array elements are: ");
		for(int i=0;i<num1.length;i++) {
			System.out.println(num1[i]);
		}
	}
	
	public int[] arrsReturn() {
		System.out.println("Array elements in Return method are: ");
		int[] arr= {32,6,7,9,1,2,3,1,-32};
		return arr;
	}
	
	public static void main(String[] args) {
		
		Practicing obj=new Practicing();
		String alphaNumeric="56457R$*^$^675A76%&^M%*^*&^*&A765765{}{}{&(*&*&^N";
		System.out.println(alphaNumeric.replaceAll("[^a-zA-Z]", ""));
		
		
		int[] ints= {99,22,55,4,4,-1,-100};
		obj.arrsPass(ints);
		
		int[] arr1=obj.arrsReturn();
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		String name2=alphaNumeric.replaceAll("[^a-zA-Z]", "");
		String reverseName=" ";
		for(int i=name2.length()-1;i>=0;i--) {
			reverseName=reverseName+name2.charAt(i);
		}
		System.out.println("Name after reverse is: " + reverseName);
		
		int temp1=0;
		int largest=arr1[0];
		int smallest=arr1[0];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					temp1=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp1;
				}
			}
		}
		System.out.println("Array after sorting: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		Set<Integer> store=new HashSet<Integer>();
		System.out.println("Duplicate element in an array: ");
		for(int a1:arr1) {
			if(store.add(a1)==false) {
				System.out.println(a1);
			}
		}
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>largest) {
				largest=arr1[i];
			}else if(arr1[i]<smallest) {
				smallest=arr1[i];
			}
		}
		
		System.out.println("Largest element in an array is: " + largest);
		System.out.println("Smallest element in an array is: " + smallest);
		
		int fact=1;
		System.out.println("Please enter a number");
		Scanner scan=new Scanner(System.in);
		int factNumber=scan.nextInt();
		System.out.println("Entered number is: " + factNumber);
		
		for(int i=1;i<=factNumber;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of number of " + factNumber + " is: " + fact);
		
		int temp2=0;
		System.out.println("Please enter a number");
		int primeNumber=scan.nextInt();
		System.out.println("Entered number is: " + primeNumber);
		
		for(int i=2;i<=primeNumber-1;i++) {
			if(primeNumber%i==0) {
				temp2=temp2+1;
			}
		}if(temp2==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime number");
		}
		String rev="";
		System.out.println("Please enter the String value: ");
		String name3=scan.next();
		System.out.println("Entered String is: " + name3);
		
		for(int i=name3.length()-1;i>=0;i--) {
			rev=rev+name3.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(name3)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
