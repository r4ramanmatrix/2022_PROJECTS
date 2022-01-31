package interview_basic;

import java.util.HashSet;
import java.util.Set;

public class Practicing21 {

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
		int[] arr = { 9, 1, 8, 3, 7, 5, 6, 1 };
		System.out.println("Array elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practicing21 obj = new Practicing21();
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

		System.out.println("Duplicate element in an array: ");
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
		int factNumber = 7;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);

		int temp2 = 0;
		int primeNumber = 137;
		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("Number is Prime");
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

		int number = 987654321;
		int revNumber = 0;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversed: " + revNumber);
		int rNumber = 95432191;
		int count = 0;

		int[] digits = Integer.toString(rNumber).chars().map(c -> c - '0').toArray();
		for (int d : digits) {
			System.out.println(d);
			if (d == 1) {
				count++;
			}
		}
		System.out.println("1 number is " + count + " times");

		String str1 = "Ramman Kumar";
		String str1Reverse = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			str1Reverse = str1Reverse + str1.charAt(i);
		}
		System.out.println("String str1 reversed: " + str1Reverse);

		String str2 = "this is the string statement";
		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		int count2 = 0;
		char[] ch = str2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 's') {
				count2++;
			}
		}
		System.out.println("s letter is " + count2 + " times.");

		String name1 = "Raman";
		String name2 = "Kumar";

		System.out.println("Name1 before swapping: " + name1);
		System.out.println("Name2 before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping: " + name2);

		int count3 = 0;
		int count4 = 1;
		for (int i = 0; i < str2.length(); i++) {
			if (Character.isLetter(str2.charAt(i))) {
				count3++;
			}
			if ((str2.charAt(i)) == ' ' && (str2.charAt(i + 1) != ' ')) {
				count4++;
			}
		}
		System.out.println("Total letter in str2 are: " + count3);
		System.out.println("Total words in str2 are: " + count4);

		String name = "raman";
		char[] ch1 = name.toCharArray();

		System.out.println("Duplicate character in name: ");
		Set<Character> stor = new HashSet<>();
		for (char c1 : ch1) {
			if (stor.add(c1) == false) {
				System.out.println(c1);
			}
		}
	}

}
