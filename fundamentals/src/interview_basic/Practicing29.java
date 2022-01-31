package interview_basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practicing29 {

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
		int[] arr = { 11, 4, 6, 7, 8, 9, 4 };
		System.out.println("Array elements are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practicing29 obj = new Practicing29();
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

		String str = "raman kumar sharma";
		str = str.replaceAll("\\s+", "");
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		for (Character ch : str.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Occurenece of characters are: " + charMap);

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);

		int temp2 = 0;
		int primeNumber = 167;
		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {
				temp2 = temp2 + 1;
			}
		}
		if (temp2 == 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
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

		int number = 12321;
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
		String str2 = "java";
		char[] ch = str2.toCharArray();
		char temp4 = 0;

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					temp4 = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp4;
				}
			}
		}
		System.out.println("String sorted: ");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		String str3 = "raman";
		String str3Reverse = "";
		for (int i = str3.length() - 1; i >= 0; i--) {
			str3Reverse = str3Reverse + str3.charAt(i);
		}
		System.out.println("String str3 after reverse: " + str3Reverse);

		String str4 = "this is the string statement";
		String[] str4Split = str4.split(" ");
		for (int i = 0; i < str4Split.length; i++) {
			for (int j = str4Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str4Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();

		String name1 = "Java";
		String name2 = "Selenium";

		System.out.println("name1 before swapping: " + name1);
		System.out.println("name2 before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("name1 after swapping: " + name1);
		System.out.println("name2 after swapping: " + name2);

		String s = "welcome to the java";
		s = s.replaceAll("\\s+", "");
		Map<Character, Integer> charM = new LinkedHashMap<>();
		for (Character c : s.toCharArray()) {
			if (charM.containsKey(c)) {
				charM.put(c, charM.get(c) + 1);
			} else {
				charM.put(c, 1);
			}
		}
		System.out.println(charM);

	}

}
