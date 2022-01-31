package string_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_11 {

	public static void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.println("String after reverse :: " + strReverse);
	}

	public static void m2(String str) {
		System.out.println("String reverse on their position:: ");
		String[] strReverse = str.split(" ");
		for (int i = 0; i < strReverse.length; i++) {
			for (int j = strReverse[i].length() - 1; j >= 0; j--) {
				System.out.print(strReverse[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public static void m3(String str) {
		int count = 1;
		int count2 = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("\nTotal count of characters in a string :: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Total count of words in a String :: " + count2);
	}

	public static void m4(String str) {
		System.out.println("Non repeated character in a string :: ");
		for (int i = 0; i < str.length(); i++) {
			boolean isUnique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(str.charAt(i));
			}
		}
	}

	public static void m5(String str) {
		String finalStr = "";
		System.out.println("Unique and one time repeated character:: ");
		for (int i = 0; i < str.length(); i++) {
			if (!finalStr.contains(String.valueOf(str.charAt(i)))) {
				finalStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println(finalStr);
	}

	public static void m6(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First character in uppercase:: " + str);
	}

	public static void m7(String prefix, String str) {
		if (str == null || str.isEmpty()) {
			System.out.println(prefix + " ");
		}
		for (int i = 0; i < str.length(); i++) {
			m7(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
		}
	}

	public static void m8(String str1, String str2) {
		System.out.println("Str1 before swapping :: " + str1);
		System.out.println("Str2 before swapping :: " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Str1 after swapping :: " + str1);
		System.out.println("Str2 after swapping :: " + str2);
	}

	public static void m9(String str) {
		char[] ch = str.toCharArray();
		str = "";
		char temp = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		System.out.println("Sorted string is :: " + str);
	}

	public static void m10(String str1, String str2) {
		boolean result = false;
		if (str1.length() != str2.length()) {
			System.out.println("Strings are not anagram!!");
		} else {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			result = Arrays.equals(ch1, ch2);

			if (result) {
				System.out.println("Strings are anagram!!");
			} else {
				System.out.println("Strings are not anagram!!");
			}
		}
	}

	public static void m11(String[] str) {
		System.out.println("String array Sorted:: ");
		String temp = null;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void m12(String[] str) {
		int count = 0;
		System.out.println("Duplicate element in an array:: ");
		Set<String> sSet = new HashSet<>();
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element in an array!");
		}
	}

	public static void m13(String[] str) {
		int count = 0;
		Map<String, Integer> sMap = new HashMap<>();
		for (String s : str) {
			if (sMap.containsKey(s)) {
				if (count < sMap.get(s)) {
					count = sMap.get(s) + 1;
				}
				sMap.put(s, sMap.get(s) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				sMap.put(s, 1);
			}
		}
		System.out.println("Occurence of words in a string array:: \n" + sMap);
	}

	public static void m14(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<>();
		List<String> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Unique element between two array:: ");
		for (String s : s1) {
			System.out.println(s);
		}
	}

	public static void m15(String[] str1, String[] str2) {
		System.out.println("Common elements between two array:: ");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equalsIgnoreCase(str2[j])) {
					System.out.println(str1[i]);
				}
			}
		}
	}

	public static void m16(String filewrite) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + filewrite + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("this is the ninth file i'm writing through the code!!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("File write successfully!!!");
		}
	}

	public static void m17(String readFile) {
		try {
			FileReader fr = new FileReader(new File("E:\\" + readFile + ".txt"));
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("File read successfully!!");
		}
	}

	public static void m18(String str) {

		System.out.println("Only String from random mix :: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only numbers from random mix :: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only special characters from random mix :: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "java is the oops language";
		String str3 = "java is the oops programming language";
		String perm = "NIK";
		String ana1 = "RAM";
		String ana2 = "ARM";
		String[] arr = str2.split(" ");
		String[] arr2 = str3.split(" ");
		String random = "RA123&*&*&*M677676*(@#$A9650975504*(*(N";
		m1(str1);
		m2(str2);
		m3(str2);
		m4(str2);
		m5(str2);
		m6(str2);
		System.out.println("permutation of " + perm);
		m7("", perm);
		m8(str1, str2);
		m9(str1);
		m10(ana1, ana2);
		m11(arr);
		m12(arr);
		m13(arr);
		m14(arr, arr2);
		m15(arr, arr2);
		m16("NinthFile");
		m17("NinthFile");
		m18(random);
	}

}
