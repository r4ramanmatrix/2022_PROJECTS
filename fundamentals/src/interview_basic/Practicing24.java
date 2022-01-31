package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing24 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements after reverse: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 11, 9, 2, 4, 6, 8, 2, 9 };
		System.out.println("Elements of an array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Practicing24 obj = new Practicing24();
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
			if (n1 == 2) {
				count++;
			}
		}
		System.out.println("2 is " + count + " times");

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

		int temp2 = 0;
		int primeNumber = 17;
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

		int number = 987654321;
		int revNumber = 0;
		int temp3 = number;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversing: " + revNumber);
		if (temp3 == revNumber) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

		String str1 = "Raman Kumar";
		String str1Reverse = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str1Reverse = str1Reverse + str1.charAt(i);
		}
		System.out.println("String after reversing: " + str1Reverse);
		if (str1Reverse.equals(str1)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

		int count2 = 0;
		String str2 = "this is the string statement";
		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		char[] ch = str2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if ('t' == ch[i]) {
				count2++;
			}
		}
		System.out.println("Number t is " + count2 + " times");

		String name1 = "Raman";
		String name2 = "Kumar";

		System.out.println("Name1 before swapping: " + name1);
		System.out.println("Name2 before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping: " + name2);

	}

}
