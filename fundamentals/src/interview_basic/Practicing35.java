package interview_basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practicing35 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Elements reversed: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		String str = "this is the string statement";
		Set<Character> sets = new LinkedHashSet<>();
		for (char ch : str.toCharArray()) {
			sets.add(ch);
		}

		StringBuilder sb = new StringBuilder();
		for (Character ch1 : sets) {
			sb.append(ch1);
		}
		System.out.println("Only Unique values: ");
		System.out.println(sb.toString());

		str = str.replaceAll("\\s+", "");
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (char ch : str.toCharArray()) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		System.out.println("Occurence of letter are: ");
		System.out.println(charMap);

		String cities = "Delhi Noida Gurgaon Hyderabad Delhi Noida Banglore";
		String[] city = cities.split(" ");
		Set<String> sets2 = new LinkedHashSet<>();
		for (String s2 : city) {
			sets2.add(s2);
		}
		StringBuilder sb1 = new StringBuilder();
		for (String str3 : sets2) {
			sb1.append(str3);
		}
		System.out.println(sb1.toString());

		int[] arr = { 1, 2, 5, 2, 8, 9, 5 };
		System.out.println("Sorted Arrays:");
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
		System.out.println("Largest Element is: " + largest);
		System.out.println("Smallest Element is: " + smallest);
		System.out.println("Length of an array: " + arr.length);
		System.out.println("Second largest element is: " + arr[arr.length - 2]);
		Practicing35 obj = new Practicing35();
		obj.m1(arr, arr.length);

		int fact = 1;
		int factNumber = 5;
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
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not Prime");
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

		System.out.println("Duplicate value in an array: ");
		Set<Integer> duplicate = new HashSet<>();
		for (int n1 : arr) {
			if (duplicate.add(n1) == false) {
				System.out.println(n1);
			}
		}

		ArrayList<Integer> lists = new ArrayList<>();
		lists.add(2020);
		lists.add(2019);
		lists.add(2018);
		lists.add(2021);
		System.out.println("Objects in an arraylist are:");
		for (int i : lists) {
			System.out.println(i);
		}
		int temp3 = 0;
		for (int i = 0; i < lists.size(); i++) {
			for (int j = lists.size() - 1; j > i; j--) {
				if (lists.get(i) > lists.get(j)) {
					temp3 = lists.get(i);
					lists.set(i, lists.get(j));
					lists.set(j, temp3);
				}
			}
		}

		System.out.println("Sorting an arraylist");
		for (int x : lists) {
			System.out.println(x);
		}
	}

}
