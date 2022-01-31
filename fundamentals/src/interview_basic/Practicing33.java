package interview_basic;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practicing33 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements in reverse order: ");

		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Array elements: ");
		int[] arr = { 1, 9, 2, 8, 4, 7, 1 };
		for (int i : arr) {
			System.out.println(i);
		}

		Practicing33 obj = new Practicing33();
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
		System.out.println("Array elements Sorted: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Duplicate element in an array:");
		Set<Integer> getDuplicate = new HashSet<>();
		for (int n : arr) {
			if (getDuplicate.add(n) == false) {
				System.out.println(n);
			}
		}

		int number = 12345;
		int revNumber = 0;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Reverse number is: " + revNumber);

		String str1 = "java selenium";
		String str1Reverse = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			str1Reverse = str1Reverse + str1.charAt(i);
		}
		System.out.println("Reverse String is: " + str1Reverse);

		String str2 = "this is java selenium practice";
		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}

		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		str2 = str2.replaceAll("\\s+", "");
		for (char ch1 : str2.toCharArray()) {
			if (charMap.containsKey(ch1)) {
				charMap.put(ch1, charMap.get(ch1) + 1);
			} else {
				charMap.put(ch1, 1);
			}
		}
		System.out.println("Occurence of character: ");
		System.out.println(charMap);

		Set<Character> sets = new LinkedHashSet<>();
		for (char ch2 : str2.toCharArray()) {
			sets.add(ch2);
		}

		StringBuilder sb = new StringBuilder();
		for (Character charact : sets) {
			sb.append(charact);
		}
		System.out.println("Only unique values are: ");
		System.out.println(sb.toString());

		String name1 = "Java";
		String name2 = "Selenium";

		System.out.println("Name1 before swapping : " + name1);
		System.out.println("Name2 before swapping : " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping : " + name1);
		System.out.println("Name2 after swapping : " + name2);

		String cities = "Delhi Noida Mumbai Gurgaon Noida Delhi Banglore";
		String[] cit = cities.split(" ");

		Set<String> city = new LinkedHashSet<>();
		for (String ch3 : cit) {
			city.add(ch3);
		}

		StringBuilder sb2 = new StringBuilder();
		for (String chx : city) {
			sb2.append(chx);
		}
		System.out.println(sb2.toString());

		int fact = 1;
		int factNumber = 6;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial is: " + fact);

		int temp2 = 0;
		int primeNumber = 13;
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
	}
}
