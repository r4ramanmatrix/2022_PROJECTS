package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing17 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];

		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}

		System.out.println("Array in reverse order: ");

		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 11, 8, 2, 5, 7, 2, 9 };

		System.out.println("Elements of an array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Practicing17 obj = new Practicing17();
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

		System.out.println("Duplicate elements in an array: ");
		Set<Integer> store = new HashSet<>();

		for (int n1 : arr) {
			if (store.add(n1) == false) {
				System.out.println(n1);
			}
		}

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);

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
		System.out.println("Largest element in array : " + largest);
		System.out.println("Smallest element in array: " + smallest);

		int temp2 = 0;
		int primeNumber = 101;
		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not prime");
		}

		int number = 112121;
		int revNumber = 0;
		int isPalindrome = number;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversing : " + revNumber);
		if (isPalindrome == revNumber) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

		System.out.println("Second largest element in an array: " + arr[arr.length - 2]);

		String str = "Raman";
		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println("String str after reversing: " + revString);
		if (str.equals(revString)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String not a palindrome");
		}

		System.out.println("String reverse on their position:");
		String str1 = "This is the String statement";
		String[] stringSplit = str1.split(" ");

		for (int i = 0; i < stringSplit.length; i++) {
			for (int j = stringSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(stringSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();

		String name1 = "Raman";
		String name2 = "Kumar";

		System.out.println("Name1 before swapping : " + name1);
		System.out.println("Name2 before swapping : " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping : " + name1);
		System.out.println("Name2 after swapping : " + name2);

	}

}
