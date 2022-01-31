package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing19 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reverse: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 1, 9, 2, 8, 3, 7, 4, };
		System.out.println("Elements  in an array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practicing19 obj = new Practicing19();
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

		System.out.println("Duplicate elements in an array");
		Set<Integer> store = new HashSet<>();
		for (int n1 : arr) {
			if (store.add(n1) == false) {
				System.out.println(n1);
			}
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

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);

		int temp2 = 0;
		int primeNumber = 179;

		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("NUmber is prime");
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

		int number = 987654321; // 12121;
		int revNumber = 0;
		int temp3 = number;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number reversed: " + revNumber);
		if (temp3 == revNumber) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}

		String str1 = "Raman";
		String str1Reverse = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str1Reverse = str1Reverse + str1.charAt(i);
		}
		System.out.println("String reverse: " + str1Reverse);

		String str2 = "This is the string statememt";
		String[] str2Reverse = str2.split(" ");
		for (int i = 0; i < str2Reverse.length; i++) {
			for (int j = str2Reverse[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Reverse[i].charAt(j));
			}
			System.out.print(" ");
		}

		System.out.println();

		String name1 = "Raman";
		String name2 = "Kumar";

		System.out.println("Name1 before swapping: " + name1);
		System.out.println("Name2 before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping: " + name2);

		int count = 1;
		for (int i = 1; i < str1.length(); i++) {
			if (Character.isLetter(str1.charAt(i))) {
				count++;
			}
		}
		System.out.println("Total character in str1 is: " + count);

		int count2 = 1;

		for (int i = 1; i < str2.length(); i++) {
			if ((str2.charAt(i) == ' ') && (str2.charAt(i + 1) != ' ')) {
				count2++;
			}
		}
		System.out.println("Total words are: " + count2);

		String rumbleJumble = "R1234A)(*&M098A5677N";
		System.out.println("Extract String: " + rumbleJumble.replaceAll("[^a-aA-Z]", ""));
		System.out.println("Extract Numbers: " + rumbleJumble.replaceAll("[^0-9]", ""));
	}

}
