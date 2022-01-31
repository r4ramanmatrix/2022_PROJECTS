package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing25 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements after reversing: ");

		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 1, 7, 11, 2, 6, 1, 9 };
		System.out.println("Elements of an array: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Practicing25 obj = new Practicing25();
		obj.m1(arr, arr.length);

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted elements of an array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int count = 0;
		System.out.println("Duplicate element in an array: ");
		Set<Integer> store = new HashSet<>();
		for (int n1 : arr) {
			if (store.add(n1) == false) {
				System.out.println(n1);
			}
			if (1 == n1) {
				count++;
			}
		}
		System.out.println("1 is " + count + " times");

		System.out.println("Duplicate elements between two array: ");

		int[] arr1 = { 11, 3, 4, 5, 6, -7, 8, 10 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println(arr[i]);
				}
			}
		}

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + factNumber + " is: " + fact);

		int temp2 = 0;
		int primeNumber = 13;
		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not Prime");
		}

		int first = 0;
		int second = 1;
		int next;
		int fiboSeries = 10;
		System.out.print(first + " " + second + " ");
		for (int i = 2; i < fiboSeries; i++) {
			next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}
		System.out.println();

		int number = 123456789;
		int revNumber = 0;
		int temp3 = number;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversing: " + revNumber);
		if (temp3 == revNumber) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

		String str1 = "Raman Kumar";
		String str1Reverse = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str1Reverse = str1Reverse + str1.charAt(i);
		}
		System.out.println("String str1 after reverse: " + str1Reverse);

		String str2 = "This is the string statement";
		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		int temp4 = 0;
		int count2 = 0;
		char[] ch = str2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 's') {
				count2++;
			}
		}
		System.out.println("s is " + count2 + " times");

		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest element in an array: " + largest);
		System.out.println("Smallest elementin an array: " + smallest);

		int count3 = 0;
		for (int i = 0; i < str2.length(); i++) {
			char ch1 = str2.charAt(i);
			if ((ch1 == 'a') || (ch1 == 'e') || (ch1 == 'i') || (ch1 == 'o') || (ch1 == 'u')) {
				System.out.println(ch1 + " ");
				count3++;
			}
		}

		Set s = new HashSet<>();
		s.add(12);
		s.add("ABC");

		System.out.println(s);
		Practicing25 obj1 = new Practicing25();
		System.out.println();

	}

}
