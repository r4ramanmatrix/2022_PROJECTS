package interview_basic;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practicing32 {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}

		System.out.println("Reversed array: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 9, 2, 8, 3, 7, 1 };
		System.out.println("Array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Practicing32 obj = new Practicing32();
		obj.m1(arr, arr.length);

		System.out.println(obj);
		System.out.println(obj.toString());

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
		System.out.println("Sorted array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Duplicate value in an array: ");
		Set<Integer> sets = new HashSet<>();
		for (int n1 : arr) {
			if (sets.add(n1) == false) {
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
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not prime");
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

		int number = 12321;
		int revNumber = 0;
		int temp3 = number;
		while (number != 0) {
			revNumber = revNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reverse: " + revNumber);
		if (temp3 == revNumber) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		String str1 = "java selenium";
		String str1Reverse = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			str1Reverse = str1Reverse + str1.charAt(i);
		}
		System.out.println("Name after reverse: " + str1Reverse);

		String str2 = "this is the java code";

		String[] str2Split = str2.split(" ");
		for (int i = 0; i < str2Split.length; i++) {
			for (int j = str2Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str2Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		String name1 = "Java";
		String name2 = "selenium";

		System.out.println("name1 before swapping: " + name1);
		System.out.println("name2 before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("name1 after swapping: " + name1);
		System.out.println("name2 after swapping: " + name2);

		char[] ch = str2.toCharArray();
		Set<Character> charSet = new LinkedHashSet<>();
		for (char ch1 : ch) {
			charSet.add(ch1);
		}

		StringBuilder sb = new StringBuilder();
		for (Character ch2 : charSet) {
			sb.append(ch2);
		}
		System.out.println("Unique value from String statement are: " + sb.toString());

		str2 = str2.replaceAll("\\s+", "");
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (Character chx : str2.toCharArray()) {
			if (charMap.containsKey(chx)) {
				charMap.put(chx, charMap.get(chx) + 1);
			} else {
				charMap.put(chx, 1);
			}
		}
		System.out.println("Occurence of letters in String are: \n" + charMap);

		String cities = "Delhi Banglore Hyderabad Delhi Noida Chennai Noida Gurgaon";
		String[] citySplit = cities.split(" ");
		Set<String> stringSet = new LinkedHashSet<>();
		for (String s : citySplit) {
			stringSet.add(s);
		}
		System.out.println("Unique city are: " + stringSet);
		int count = 0;

		try {
			Class c = Class.forName("java.lang.Object");
			Method[] m = c.getDeclaredMethods();
			for (Method m1 : m) {
				++count;
				System.out.println(m1.getName());
			}
			System.out.println(count);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
