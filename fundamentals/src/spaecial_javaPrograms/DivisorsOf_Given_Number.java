package spaecial_javaPrograms;

import java.util.Scanner;

public class DivisorsOf_Given_Number {

	public static void m1(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int number = 10;
		m1(number);
		System.out.println("******************");
		String str = "this is the string statement of java";
		m1(str);
		m2(str);
		m4(number);
		m5(number);
		m6(str);
		m7(str);
	}

	public static void m1(String str) {
		int index = 4;
		String[] sSplit = str.split(" ");
		if (index >= 0 && index < sSplit.length) {
			System.out.print("Output:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		} else {
			System.out.println("Index is Invalid");
		}
	}

	public static void m2(String str) {
		System.out.println("\n******************");
		if (str == null) {
			System.out.println("VOID");
		}
		final StringBuilder sb = new StringBuilder(str.length());
		for (final String word : str.split(" ")) {
			if (!word.isEmpty()) {
				sb.append(Character.toUpperCase(word.charAt(0)));
				sb.append(word.substring(1).toLowerCase());
			}
			if (!(word.length() == str.length())) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}

	public static void m4(int Value) {
		System.out.println("******************");
		int k = 1;
		for (int i = 1; i <= Value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public static void m5(int Value) {
		System.out.println("******************");
		for (int i = 1; i < Value; i++) {
			if (Value % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void m6(String str) {
		System.out.println("******************");
		int count = 0;
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		for (char c : ch) {
			count++;
		}
		System.out.println("Length of String is:: " + count);
	}

	public static void m7(String str) {
		System.out.println("******************");
		String search_String = "statement of java the";
		boolean isPresent = str.contains(search_String);
		System.out.println(isPresent);
		/*System.out.println("******************");
		boolean isPresent_2 = str.indexOf(str) != -1;
		System.out.println(isPresent_2);*/
		System.out.println("******************");
		boolean isPresent_3 = str.matches((".*") + search_String + (".*"));
		System.out.println(isPresent_3);
	}

}
