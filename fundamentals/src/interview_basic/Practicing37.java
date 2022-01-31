package interview_basic;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practicing37 {
	
	public void m1(int[] num, int lengths){
		int[] a=new int[lengths];
		int j=lengths;
		
		for(int i=0;i<num.length;i++){
			a[j-1]=num[i];
			j=j-1;
		}
		System.out.println("array in reverse order");
		
		for(int i=0;i<num.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr={1,8,9,7,5,6,1};
		
		System.out.println("Array elements");
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		Practicing37 obj=new Practicing37();
		obj.m1(arr, arr.length);
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array sorted");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Duplicate element in an array: ");
		Set<Integer> sets=new LinkedHashSet<>();
		for(int i:arr){
			if(sets.add(i)==false){
				System.out.println(i);
			}
		}
		
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}else if(arr[i]<smallest){
				smallest=arr[i];
			}
		}
		System.out.println("Largest element in an array: " + largest);
		System.out.println("Smallest element in an array: " + smallest);
			
		int fact=1;
		int factorial=6;
		for(int i=1;i<=factorial;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of " + factorial + " is: " + fact);
		
		int temp2=0;
		int primeNumber=190;
		for(int i=2;i<primeNumber;i++){
			if(primeNumber%i==0){
				temp2=temp2+1;
			}
		}if(temp2==0){
			System.out.println("Number is prime");
		}else{
			System.out.println("Number is not prime");
		}
		
		int first=0;
		int second=1;
		int fiboSeries=10;
		int next;
		System.out.print(first  + " " + second + " ");
		for(int i=2;i<fiboSeries;i++){
			next=first + second;
			System.out.print(next + " ");
			first=second;
			second=next;
		}
		System.out.println();
		
		int number=12345;
		int reverseNumber=0;
		while(number!=0){
			reverseNumber=reverseNumber*10+number%10;
			number=number/10;
		}
		System.out.println("Number after reverse: " + reverseNumber);
		System.out.println("Second highest number in an array: " + arr[arr.length-2]);
		
		int[] arr2={11,78,9,77,25,16,1};
		
		System.out.println("Common element between two array are: ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr[i]==arr2[j]){
					System.out.println(arr2[j]);
				}
			}
		}
		
		String str1="Raman Kumar";
		String strReverse="";
		
		for(int i=str1.length()-1;i>=0;i--){
			strReverse=strReverse+str1.charAt(i);
		}
		System.out.println("Str1 after reverse: " + strReverse);
		
		System.out.println("String reverse on its position: ");
		
		String str2="this is the string statement";
		String[] str2Reverse=str2.split(" ");
		for(int i=0;i<str2Reverse.length;i++){
			for(int j=str2Reverse[i].length()-1;j>=0;j--){
				System.out.print(str2Reverse[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		
		Map<Character, Integer> charMap=new LinkedHashMap<>();
		for(char ch:str2.toCharArray()){
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}else{
				charMap.put(ch, 1);
			}
		}
		System.out.println("Occurence of character are: \n" + charMap);
		
		Set<Character> charSet=new LinkedHashSet<>();
		for(char ch:str1.toCharArray()){
			charSet.add(ch);
		}
		StringBuilder sb=new StringBuilder();
		for(char ch1:charSet){
			sb.append(ch1);
		}
		System.out.println("Only unique values are:");
		System.out.println(sb.toString());
		
		String cities="Delhi noida Delhi Banglore hyderabad mumbai hyderabad chennai";
		String[] city=cities.split(" ");
		
		Set<String> StringSet=new LinkedHashSet<>();
		for(String s1:city){
			StringSet.add(s1);
		}
		StringBuilder sb1=new StringBuilder();
		for(String s2:StringSet){
			sb1.append(s2);
		}
		System.out.println(sb1.toString());
		
		String name1="Raman";
		String name2="Kumar";
		
		System.out.println("Name1 before swapping: " + name1);
		System.out.println("Name2 before swapping: " + name2);
		
		name1=name1+name2;
		name2=name1.substring(0, name1.length()-name2.length());
		name1=name1.substring(name2.length());
		
		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping: " + name2);
				
	}

}
