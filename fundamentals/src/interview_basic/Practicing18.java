package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing18 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reversed: ");

		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 11, 9, 2, 6, 3, 5, 2 };
		System.out.println("Elements of an array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practicing18 obj = new Practicing18();
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

		System.out.println("duplicate element in an array: ");
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

		int temp2 = 0;
		int primeNumber = 19;
		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("Number is prime");
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

		int number = 987654321; // 12121
		int revNUmber = 0;
		int temp3 = number;
		while (number != 0) {
			revNUmber = revNUmber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversing: " + revNUmber);
		if (temp3 == revNUmber) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
		System.out.println("Length of an array: " + arr.length);
		System.out.println("Second largest element is: " + arr[arr.length - 2]);
		System.out.println("Second smallest element in array: " + arr[arr.length - 5]);

		String str1 = "Raman";
		String revStr = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			revStr = revStr + str1.charAt(i);
		}
		System.out.println("Name after reversing : " + revStr);

		String str2 = "This is the String statement";
		String[] str2Split = str2.split(" ");

		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();

		String name1 = "Gspann";
		String name2 = "Technologies";

		System.out.println("name1 before swapping: " + name1);
		System.out.println("name2 before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("name1 after swapping: " + name1);
		System.out.println("name2 after swapping: " + name2);

		System.out.println("Selection sort");

		int temp5 = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			temp5 = arr[i];
			arr[i] = arr[min];
			arr[min] = temp5;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
