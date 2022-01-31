package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing4 {
	
	public int[] m1() {
		int[] num= {9,8,6,1,3,5,-20,1};
		return num;
	}
	
	public void m1(int[] arr, int lengths) {
		int[] a=new int[lengths];
		int j=lengths;
		
		for(int i=0;i<arr.length;i++) {
			a[j-1]=arr[i];
			j=j-1;
		}
		
		System.out.println("Reverse order of element in an array");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Practicing4 obj=new Practicing4();
		int[] numbers=obj.m1();
		
		System.out.println("Element in an array are: ");
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		obj.m1(numbers, numbers.length);
		
		System.out.println("Sorted element in an array");
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
		
		System.out.println("Duplicate element in an array: ");
		Set<Integer> store=new HashSet<>();
		for(int n1:numbers) {
			if(store.add(n1)==false) {
				System.out.println(n1);
			}
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
		
		System.out.println("Largest element is: " + largest);
		System.out.println("Smallest element is: " + smallest);
		System.out.println("Second largest element in the array: " + numbers[numbers.length-2]);
		
		int fact=1;
		int factNumber=6;
		for(int i=1;i<=factNumber;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial of " + factNumber + " is: " + fact);
		
		System.out.println("Fibonacci Series is: ");
		
		int first =0;
		int second = 1;
		int next;
		int fNumber=12;
		System.out.print(first +" " + second + " ");
		for(int i=2;i<fNumber;i++) {
			next = first+second;
			System.out.print(next + " ");
			first=second;
			second=next;
		}
		System.out.println();
		
		int temp2=0;
		int paliNumber=131031;
		int revNumber=0;
		temp2=paliNumber;
		while(paliNumber!=0) {
			revNumber=revNumber*10+paliNumber%10;
			paliNumber=paliNumber/10;
		}
		if(temp2==revNumber) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not a Palindrome");
		}
		
		int temp3=0;
		int primeNumber=43;
		for(int i=2;i<primeNumber;i++) {
			if(primeNumber%i==0) {
				temp3=temp3+1;
			}
		}if(temp3==0) {
			System.out.println(primeNumber +" is a Prime Number");
		}else {
			System.out.println(primeNumber +" is not a Prime Number");
		}
		
		int number=987654321;
		int rev=0;
		while(number!=0) {
			rev=rev*10+number%10;
			number=number/10;
		}
		
		System.out.println("Number after reversing is: " + rev);
		
		String name="Raman";
		String revString="";
		for(int i=name.length()-1;i>=0;i--) {
			revString=revString+name.charAt(i);
		}
		System.out.println("Name after reversing: " + revString);
		
		String name1="elvis lives";
		System.out.println("Before reversing name is: " + name1);
		String[] nameSplit=name1.split(" ");
		String part1=nameSplit[0];
		String revPart1="";
		String part2=nameSplit[1];
		String revPart2="";
		
		
		for(int i=part1.length()-1;i>=0;i--) {
			revPart1=revPart1+part1.charAt(i);
		}
		
		for(int i=part2.length()-1;i>=0;i--) {
			revPart2=revPart2+part2.charAt(i);
		}
		
		System.out.println("Words reversing on their position: " + revPart1 +" "+ revPart2);
		
		char[] ch1=revPart1.toCharArray();
		char[] ch2=revPart2.toCharArray();
		char temp4=0;
		char temp5=0;
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch1.length-1;j++) {
				if(ch1[j]>ch1[j+1]) {
					temp4=ch1[j];
					ch1[j]=ch1[j+1];
					ch1[j+1]=temp4;
				}
			}
		}
		
		for(int i=0;i<ch2.length;i++) {
			System.out.print(ch1[i]);
		}
		
		
		System.out.print(" ");
		String charElement1=new String(ch1);
		
		for(int i=0;i<ch2.length;i++) {
			for(int j=0;j<ch2.length-1;j++) {
				if(ch2[j]>ch2[j+1]) {
					temp5=ch2[j];
					ch2[j]=ch2[j+1];
					ch2[j+1]=temp5;
				}
			}
		}
		
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch2[i]);
		}
		
		String charElement2=new String(ch2);
		
		System.out.println();
		if(charElement1.equals(charElement2)) {
			System.out.println("String are anagrams");
		}else {
			System.out.println("String are not anagrams");
		}
		
		String extractName="%$%$^&R776A97..88M^&^*(*{{{}A87687N";
		System.out.println("Name extract from rumble jumble words: " + extractName.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only number/digits extract from rumble jumble words: " + extractName.replaceAll("[^0-9]", ""));
		String site="www.facebook.com";
		
		System.out.println("Site name is: " + site);
		
		String[] siteSplit=site.split("\\.");
		
		/*for(String words:siteSplit) {
			System.out.println(words); 
		}
		*/
		
		String sitePart1=siteSplit[0];
		String sitePart2=siteSplit[1];
		String sitePart3=siteSplit[2];
		System.out.println("Site name after spliting it: " + sitePart1 +" " + sitePart2 + " " + sitePart3);
	}

}
