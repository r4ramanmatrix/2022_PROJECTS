package strings;

import java.util.HashSet;
import java.util.Set;

public class Practicing4 {
	
	public int[] arrays() {
		int[] num= {99,88,77,55,33,11};
		return num;
	}
	
	public void passArray(int[] arr) {
		System.out.println("Passing array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void nums(int arr[], int lengths) {
		
		
		int[] a =new int[lengths];
		int j=lengths;
		
		for(int i=0;i<arr.length;i++) {
			a[j-1]=arr[i];
			j=j-1;
		}
		
		System.out.println("Reverse array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Practicing4 obj=new Practicing4();
		
		System.out.println("Return array method: ");
		int[] arrMethod=obj.arrays();
		for(int i=0;i<=arrMethod.length-1;i++) {
			System.out.println(arrMethod[i]);
		}
		int arrs[]= {1,9,2,8,3,7,9};
		obj.nums(arrs, arrs.length);
		int[] passArrayMethod= {1,-10,-20,-30, 50};
		
		obj.passArray(passArrayMethod);
		System.out.println("Sorted array is: ");
		int temp1=0;
		for(int i=0;i<arrs.length;i++) {
			for(int j=0;j<arrs.length-1;j++) {
				if(arrs[j]>arrs[j+1]) {
					temp1=arrs[j];
					arrs[j]=arrs[j+1];
					arrs[j+1]=temp1;
				}
			}
		}
		for(int i=0;i<arrs.length;i++) {
			System.out.println(arrs[i]);
		}
		
		System.out.println("Duplicate element in an array: ");
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
		
		int factNumber=5;
		int fact=1;
		for(int i=1;i<=factNumber;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of " + factNumber + " is: " + fact);
		
		int primeNumber=85;
		int temp2=0;
		for(int i=2;i<primeNumber;i++) {
			if(primeNumber%i==0) {
				temp2=temp2+1;
			}
		}if(temp2==0) {
			System.out.println("Number is Prime");
		}else {
			System.out.println("Not a Prime Number");
		}
		
		
		String name1="Raman Kumar";
		System.out.println("Name before reversing: " + name1);
		String reverseName="";
		for(int i=name1.length()-1;i>=0;i--) {
			reverseName=reverseName+name1.charAt(i);
		}
		System.out.println("Name after reversing: " + reverseName);
		
		String[] name2=name1.split(" ");
		String part1=name2[0];
		String part2=name2[1];
		String revPart1="";
		String revPart2="";
		String reversing="";
		
		for(int i=part1.length()-1;i>=0;i--) {
			revPart1=revPart1+part1.charAt(i);
		}
		for(int i=part2.length()-1;i>=0;i--) {
			revPart2=revPart2+part2.charAt(i);
		}
		reversing=revPart1+" "+ revPart2;
		System.out.println("Name after reversing on their position: "+ reversing);
		
		int number = 987654321;
		int rev=0;
		
		System.out.println("Number before reversing: " + number);
		
		while(number!=0) {
			rev=rev*10+number%10;
			number=number/10;
		}
		
		System.out.println("Number after reversing: " + rev);
		
		String nam1="stop";
		String nam2="post";
		char temp3=0;
		char temp4=0;
		
		char[] ch1=nam1.toCharArray();
		char[] ch2=nam2.toCharArray();
		
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch1.length-1;j++) {
				if(ch1[j]>ch1[j+1]) {
					temp3=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp3;
				}
			}
		}
		
		for(int i=0;i<ch1.length;i++) {
			System.out.println(ch1[i]);
		}
		
		String nam3=new String(ch1);
		
		for(int i=0;i<ch2.length;i++) {
			for(int j=0;j<ch2.length-1;j++) {
				if(ch2[j]>ch2[j+1]) {
					temp4=ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=temp4;
				}
			}
		}
		
		for(int i=0;i<ch2.length;i++) {
			System.out.println(ch2[i]);
		}
		
		String nam4=new String(ch2);
		
		System.out.println(nam3);
		System.out.println(nam4);
		
		if(nam3.equals(nam4)) {
			System.out.println("Strings are anagrams");
		}else {
			System.out.println("Strings are not anagrams");
		}
		
		int count=0;
		for(int i=0;i<=name1.length()-1;i++) {
			if(Character.isLetter(name1.charAt(i))) {
				count++;
			}
		}
		
		System.out.println("Character in a String are:  " + count);
		
		//OR
		
		int count2=0;
		
		for(int i=0;i<=name1.length();i++) {
			count2++;
		}
		System.out.println("Character is: " + count2);
	}

}
