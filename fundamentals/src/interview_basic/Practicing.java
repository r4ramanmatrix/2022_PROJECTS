package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing {
	
	public int[] num() {
		System.out.println("Return array: ");
		int[] arrs= {1,6,9,2,3,5};
		return arrs;
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
		Practicing obj=new Practicing();
		int[] numbers= {11,2,3,-20,99,100,99};
		obj.m1(numbers, numbers.length);
		
		int temp1=0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				if(numbers[j]>numbers[j+1]) {
					temp1=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp1;
				}
			}
		}
		
		System.out.println("Sorted arrays : ");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else if(numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		
		System.out.println("Largest is: " + largest);
		System.out.println("Smallest is: " + smallest);
		
		String name1="naman";
		String revName1="";
		
		for(int i=name1.length()-1;i>=0;i--) {
			revName1=revName1+name1.charAt(i);
		}
		System.out.println("Name after reversing is: " + revName1);
		if(revName1.equals(name1)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		int pNumber=71;
		int temp2=0;
		
		for(int i=2;i<pNumber;i++) {
			if(pNumber%i==0) {
				temp2=temp2+1;
			}
		}if(temp2==0) {
			System.out.println("Number " + pNumber +" is Prime");
		}else {
			System.out.println("Number " +pNumber+" is not Prime!!");
		}
		
		int factNumber=5;
		int fact=1;
		
		for(int i=1;i<=factNumber;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial is: " + fact);
		
		int Number=12345;
		int revnumber=0;
		
		while(Number!=0) {
			revnumber=revnumber*10+Number%10;
			Number=Number/10;
		}
		
		System.out.println("reverse number is: " + revnumber);
		
		Set<Integer> store=new HashSet<>();
		System.out.println("Duplicate elements in array: ");
		for(int n1:numbers) {
			if(store.add(n1)==false) {
				System.out.println(n1);
			}
		}
		
		int[] arrs1=obj.num();
		for(int i=0;i<arrs1.length;i++) {
			System.out.println(arrs1[i]);
		}
		
		int count=0;
		for(int i=0;i<name1.length();i++) {
			if(Character.isLetter(name1.charAt(i))) {
				count++;
			}
		}
		
		System.out.println("Number of letter in name1: " + count);
		
		int count2=1;
		for(int i=0;i<name1.length()-1;i++) {
			if((name1.charAt(i)==' ' ) && (name1.charAt(i+1)!=' ')) {
				count2++;
			}
		}
		System.out.println("Number of words in name1: " + count2);
	}

}
