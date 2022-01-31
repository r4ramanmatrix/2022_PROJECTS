package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing22 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array in reverse order:");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 9, 2, 7, 3, 6, 5, 4, 2 };
		System.out.println("Array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practicing22 obj = new Practicing22();
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
		System.out.println("Sorted elemenyts of an array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Duplicate element in an aaray: ");
		Set<Integer> store = new HashSet<>();
		for (int n1 : arr) {
			if (store.add(n1) == false) {
				System.out.println(n1);
			}
		}

		int fact = 1;
		int factNumber = 5;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is : " + fact);

		int temp1 = 0;
		int primeNumber = 13;
		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp1 = temp1 + 1;
			}
		}
		if (temp1 == 0) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not prime");
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

		int number = 12321;// 987654321;
		int revNnumber = 0;
		int temp2 = number;
		while (number != 0) {
			revNnumber = revNnumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number reverse: " + revNnumber);
		if (temp2 == revNnumber) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest element in an array: " + largest);
		System.out.println("Smallest element in an array: " + smallest);
		System.out.println("Second largest element is: " + arr[arr.length - 2]);

		String str1 = "Ramman kumar";
		String revString = "";
		for (int i = 0; i < str1.length(); i++) {
			revString = revString + str1.charAt(i);
		}
		System.out.println("String after reverse: " + revString);

		String str2 = "this is the string statement";
		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		int count = 1;
		char[] ch = str2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 's') {
				count++;
			}
		}
		System.out.println("Total s: " + count);
	}

}
