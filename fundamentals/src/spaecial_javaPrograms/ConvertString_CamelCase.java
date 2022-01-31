package spaecial_javaPrograms;

public class ConvertString_CamelCase {

	public static void m1(String str) {
		if (str == null) {
			System.out.println("VOID!!");
		}

		final StringBuilder ret = new StringBuilder(str.length());

		for (final String word : str.split(" ")) {
			if (!word.isEmpty()) {
				ret.append(Character.toUpperCase(word.charAt(0)));
				ret.append(word.substring(1).toLowerCase());
			}
			if (!(ret.length() == str.length()))
				ret.append(" ");
		}
		System.out.println(ret);
	}

	public static void main(String[] args) {
		String str = "hi ThIs is THE StatemENT";
		m1(str);
		m2(str);
		m3(str);
		m4(str);
		int number = 8;
		m5(number);
		m6(number);
		m7(str);
		m8(str);
	}

	public static void m2(String str) {
		if (str == null) {
			System.out.println("VOID");
		}

		final StringBuilder sb = new StringBuilder(str.length());

		for (final String word : str.split(" ")) {
			if (!word.isEmpty()) {
				sb.append(Character.toUpperCase(word.charAt(0)));
				sb.append(word.substring(1).toLowerCase());
			}
			if (!(sb.length() == str.length())) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}

	public static void m3(String str) {
		if (str == null) {
			System.out.println("Void!!");
		}
		final StringBuilder sb = new StringBuilder(str.length());
		for (final String word : str.split(" ")) {
			if (!word.isEmpty()) {
				sb.append(Character.toUpperCase(word.charAt(0)));
				sb.append(word.substring(1).toLowerCase());
			}
			if (!(sb.length() == str.length())) {
				sb.append(" ");
			}
		}
		System.out.println(sb);

	}

	public static void m4(String str) {
		System.out.println("********************");
		int index = 0;
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

	public static void m5(int Value) {
		System.out.println("\n******************");
		int k = 1;
		for (int i = 1; i <= Value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public static void m6(int number) {
		System.out.println("***************");
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void m7(String str) {
		System.out.println("*****************");
		if (str == null) {
			System.out.println("VOID!!");
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

	public static void m8(String str) {
		System.out.println("****************");
		int count = 0;
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count++;
		}
		System.out.println("Length of string is :: " + count);
	}

}
