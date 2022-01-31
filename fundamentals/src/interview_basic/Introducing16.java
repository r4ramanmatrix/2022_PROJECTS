package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Introducing16 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Reverse order of array elements: ");

		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 11, 9, 2, 8, 4, 6, 5, 2 };

		System.out.println("Array elements: ");

		for (int nums : arr) {
			System.out.println(nums);
		}

		Introducing16 obj = new Introducing16();
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
		System.out.println("Sorted elements of an Array: ");
		for (int nums : arr) {
			System.out.println(nums);
		}

		Set<Integer> store = new HashSet<>();
		System.out.println("Duplicate element in an array: ");
		for (int n1 : arr) {
			if (store.add(n1) == false) {
				System.out.println(n1);
			}
		}
		System.out.println("Common element between two array: ");
		int[] arr1 = { 11, 22, 33, 44, 55 };
		for (int nums1 : arr) {
			for (int nums2 : arr1) {
				if (nums1 == nums2) {
					System.out.println(nums1);
				}
			}
		}
		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);

		System.out.println("Fibonacci Series is: ");
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

		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest number in array is: " + largest);
		System.out.println("Smallest number in array is: " + smallest);
		int temp3 = 0;
		int primeNumber = 17;
		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp3 = temp3 + 1;
			}
		}
		if (temp3 == 0) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not prime");
		}

		int number = 312121;
		int revNumber = 0;
		int temp4 = number;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversing is: " + revNumber);
		if (temp4 == revNumber) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}

		String str1 = "GSPANN"; // eye
		String revStr = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			revStr = revStr + str1.charAt(i);
		}
		System.out.println("String after reversing: " + revStr);
		if (str1.equals(revStr)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}

		System.out.println("String reversing on their position: ");

		String str2 = "This is the String statement";
		String[] str2Rev = str2.split(" ");
		for (int i = 0; i < str2Rev.length; i++) {
			for (int j = str2Rev[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Rev[i].charAt(j));
			}
			System.out.print(" ");
		}

		System.out.println();

		String name1 = "Raman";
		String name2 = "Kumar";

		System.out.println("Name1 before swapping: " + name1);
		System.out.println("Name2 before swapping; " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping; " + name2);

	}

}
