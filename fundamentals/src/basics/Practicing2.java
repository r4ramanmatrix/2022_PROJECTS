package basics;

import java.util.Scanner;

public class Practicing2 {
	
	
	public static void main(String[] args) {
		
		System.out.println("Hallo");
		boolean test=false;
		int[] arr= {11,2,3,5,7,1,-10};
		System.out.println("Please neter the number you want to search in an array");
		Scanner scan=new Scanner(System.in);
		int checkValue=scan.nextInt();
		System.out.println("Entered number is: " + checkValue);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==checkValue) {
				test=true;
			}if(test==true) {
				System.out.println(checkValue + " is present in the array");
			}
		}		
		
		int temp1=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp1=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp1;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}else if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		
		System.out.println("Largest number is: " + largest);
		System.out.println("Smallest number is: " + smallest);
		
		int temp2=0;
		System.out.println("Please enter an number: ");
		int pNumber=scan.nextInt();
		System.out.println("Entered number is: " + pNumber);
		for(int i=2;i<pNumber;i++) {
			if(pNumber%i==0) {
				temp2=temp2+1;
			}
		}if(temp2==0) {
			System.out.println("Number is Prime number");
		}else {
			System.out.println("Number is not a prime number");
		}
		
		String revString="";
		System.out.println("Please enter the String Value");
		String name1=scan.next();
		System.out.println("Entered String is: " + name1);
		for(int i=name1.length()-1;i>=0;i--) {
			revString=revString+name1.charAt(i);
		}
		System.out.println(revString);
		if(revString.equals(name1)) {
			System.out.println("Entered String is Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		int fact=1;
		System.out.println("Please enter an number: ");
		int factNumber=scan.nextInt();
		System.out.println("Entered number is: " + factNumber);
		
		for(int i=1;i<=factNumber;i++) {
			fact=fact*i;
		}
		
		System.out.println("factorial of number: " + factNumber + " is " + fact);
		
		long number=9650975504l;
		long revNum=0;
		
		while(number!=0) {
			revNum=revNum*10+number%10;
			number=number/10;
		}
		System.out.println("Reverse integer value is: " + revNum);
		
		int temp4=0;
		
		for(int i=arr.length-1;i>0;i--) {
			for(int j=arr.length-1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					temp4=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp4;
				}
			}
		}
		System.out.println("Array in descending order: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(+arr[i]);
		}
	}

}
