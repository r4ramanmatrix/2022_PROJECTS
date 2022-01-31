package interview_basic;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practicing31 {

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
		int[] arr = { 1, 9, 2, 4, 5, 1, 3 };
		System.out.println("Array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practicing31 obj = new Practicing31();
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
		Set store = new HashSet<>();
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
		int primeNumber = 137;
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
		int fiboSeries = 9;
		System.out.print(first + " " + second + " ");
		for (int i = 2; i < fiboSeries; i++) {
			next = first + second;
			System.out.print(next + " ");
			first = second;
			second = next;
		}
		System.out.println();

		int number = 12345;
		int revNumber = 0;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number afetr reversing: " + revNumber);

		String str1 = "Java";

		String str1Reverse = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			str1Reverse = str1Reverse + str1.charAt(i);
		}
		System.out.println("String reverse: " + str1Reverse);

		String str2 = "this is the string statement";
		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();

		str2 = str2.replaceAll("\\s+", "");
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (Character ch : str2.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		System.out.println("Occurence of characters: " + charMap);

		Set<Character> st = new LinkedHashSet<>();
		char[] ch = str2.toCharArray();
		for (Character ch1 : ch) {
			st.add(ch1);
		}

		StringBuilder sb = new StringBuilder();
		for (Character charact : st) {
			sb.append(charact);
		}
		System.out.println("Only unique values are: " + sb.toString());

		System.out.println();

		String cities = "Delhi Banglore Hyderabad Gurgaon Noida Noida Banglore";

		String output = "";
		String[] city = cities.split(" ");

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		for (int i = 0; i < city.length; i++) {
			lhs.add(city[i]);
		}
		for (String s : lhs) {
			output = output + s + " ";
		}
		System.out.println("Only unique values are: " + output);

		char[] ch2 = { 'a', 'b', 'c' };
		char[] ch3 = { 'a', 'x', 'z' };
		char[] ch4 = new char[5];

	}

}
