package interview_basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Practicing27 {

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
		int[] arr = { 1, 2, 9, 8, 6, 4, 2 };
		System.out.println("Array elements are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practicing27 obj = new Practicing27();
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
		System.out.println("Array elements sorted: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
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
		int primeNumber = 192;
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
		int fiboSeries = 8;
		System.out.print(first + " " + second + " ");
		for (int i = 2; i < fiboSeries; i++) {
			next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}
		System.out.println();

		String str1 = "Raman Kumar";
		String str1Reverse = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str1Reverse = str1Reverse + str1.charAt(i);
		}
		System.out.println("str1 after reversing: " + str1Reverse);

		String str2 = "this is the string statement";
		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		int count = 0;
		char[] ch = str2.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 's') {
				count++;
			}
		}
		System.out.println("s is " + count + " times.");
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (Character.isLetter(str1.charAt(i))) {
				count2++;
			}
			if ((str1.charAt(i) == ' ') && (str1.charAt(i + 1) != ' ')) {
				count3++;
			}
		}
		System.out.println("Character in str1 are: " + count2);
		System.out.println("Number of words in str1 are: " + count3);

		int number = 12345;
		int revNumber = 0;
		int temp3 = number;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reversing: " + revNumber);
		int count4 = 0;
		ArrayList<Integer> storing = new ArrayList<>();
		do {
			storing.add(temp3 % 10);
			temp3 /= 10;
		} while (temp3 > 0);
		for (Integer n2 : storing) {
			System.out.println(n2);

			if (n2.equals(1)) {
				count4++;
			}
		}
		// System.out.println(storing);
		System.out.println("1 is : " + count4);

		String name1 = "Java";
		String name2 = "Selenium";

		System.out.println("Name1 before swapping: " + name1);
		System.out.println("Name2 before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping: " + name2);

		int A = 10;
		int B = 20;
		System.out.println(A % B);
		System.out.println(A += B);
		System.out.println(A = A + B);
		System.out.println(A /= B);

		String name11 = "Raman";
		String name12 = new String("Raman");
		System.out.println(name11 == name12);

		String statement = "this is the string statements";
		char[] ch1 = statement.toCharArray();

		Set<Character> stores = new LinkedHashSet<>();
		for (char c : ch1) {
			if (stores.add(c) == false) {
				System.out.println(c);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (Character cha : stores) {
			sb.append(cha);
		}
		System.out.println(sb.toString());

	}

}
