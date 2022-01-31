package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing16 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements in reversing order: ");

		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 11, 9, 5, 2, 8, 5, 2 };
		System.out.println("Elements present in an array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practicing16 obj = new Practicing16();
		obj.m1(arr, arr.length);

		int temp5 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp5 = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp5;
				}
			}
		}
		System.out.println("Sorted elements of array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Duplicate element in an array: ");
		Set<Integer> store = new HashSet<>();
		for (int n1 : arr) {
			if (store.add(n1) == false) {
				System.out.println(n1);
			}
		}
		System.out.println("Common elements between two array: ");
		int[] arr1 = { 11, 22, 33, 44, 55 };
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
		System.out.println("Factorial is: " + fact);

		int first = 0;
		int second = 1;
		int next;
		int fiboNumber = 10;
		System.out.print(first + " " + second + " ");
		for (int i = 2; i < fiboNumber; i++) {
			next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
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
		System.out.println();

		System.out.println("Largest element in an array: " + largest);
		System.out.println("Smallest element in an array: " + smallest);

		int temp = 0;
		int primeNumber = 11;
		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not prime");
		}

		String name = "naman";
		String revName = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);
		}
		System.out.println("Name after reversing: " + revName);
		if (revName.equals(name)) {
			System.out.println("Name is Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		System.out.println("String reversing on their positin: ");

		String name2 = "This is the string statement";
		String[] name3 = name2.split(" ");

		for (int i = 0; i < name3.length; i++) {
			for (int j = name3[i].length() - 1; j >= 0; j--) {
				System.out.print(name3[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();

		int number = 987654321;
		int revNumber = 0;
		int temp2 = number;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversing: " + revNumber);
		if (temp2 == revNumber) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}

		String eName = "JAVA";
		char[] ch = eName.toCharArray();
		char temp3 = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					temp3 = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp3;
				}
			}
		}
		System.out.println("Sorted String is: ");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		String name11 = "Raman";
		String name12 = "Kumar";

		System.out.println("Name11 before swapping : " + name11);
		System.out.println("Name12 before swapping: " + name12);

		name11 = name11 + name12;
		name12 = name11.substring(0, name11.length() - name12.length());
		name11 = name11.substring(name12.length());

		System.out.println("Name11 after swapping : " + name11);
		System.out.println("Name12 after swapping: " + name12);
	}
}