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
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Practice_36 implements Cloneable {

	public void m1(String str) {
		System.out.println("String after reverse:: ");
		System.out.println("Approach 1::");
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);

		System.out.println("Approach 2::");
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println("\nApproach 3::");
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}

	public void m2(String str) {
		System.out.println("String reverse on their position:: ");
		String[] strRev = str.split(" ");
		for (int i = 0; i < strRev.length; i++) {
			for (int j = strRev[i].length() - 1; j >= 0; j--) {
				System.out.print(strRev[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public void m3(String str) {
		System.out.println("\nNumber of character in a String :: ");
		int count_char = 1;
		int count_words = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) != '\t')) {
				count_char++;
			}
		}
		System.out.println("Count of character in a String:: " + count_char);
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count_words++;
			}
		}
		System.out.println("Count of words in a String:: " + count_words);
	}

	public void m4(String str) {
		System.out.println("First and last word replace::");
		String result = "";
		int len = str.length() - 1;
		while (len >= 0) {
			while (len >= 0 && str.charAt(len) == ' ')
				len--;
			int j = len;
			if (len < 0) {
				break;
			}
			while (len >= 0 && str.charAt(len) != ' ')
				len--;

			if (result.isEmpty()) {
				result = result.concat(str.substring(1 + len, 1 + j));
			} else {
				result = result.concat(" " + str.substring(1 + len, 1 + j));
			}
		}
		System.out.println(result);
	}

	public void m5(String str) {
		System.out.println("Find Duplicate character in a String using Map: ");
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		int count = 0;
		Map<Character, Integer> cMap = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (cMap.containsKey(c)) {
				if (count < cMap.get(c)) {
					count = cMap.get(c) + 1;
				}
				cMap.put(c, cMap.get(c) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				cMap.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entSet = cMap.entrySet();
		for (Map.Entry<Character, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
			}
		}
	}

	public void m6(String str) {
		if (str == null || str.length() == 1) {
			return;
		}
		str = str.replaceAll(" ", "");
		Set<Character> cSet = new HashSet<>();
		System.out.println("Find Duplicate character in a String using Set:: ");
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (cSet.add(c) == false) {
				System.out.println(c);
			}
		}

	}

	public void m7(String str) {
		System.out.println("Only Unqiue and non-repeated character in a String::");

		for (int i = 0; i < str.length(); i++) {
			boolean is_Unique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					is_Unique = false;
				}
			}
			if (is_Unique) {
				System.out.println(str.charAt(i));
			}
		}
	}

	public void m8(String str) {
		String strFinal = "";
		for (int i = 0; i < str.length(); i++) {
			if (!strFinal.contains(String.valueOf(str.charAt(i)))) {
				strFinal += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Unique and one time repeated character only:: " + strFinal);
	}

	public void m9(String prefix, String str) {
		if (str == null || str.length() == 0) {
			System.out.println(prefix + " ");
		}
		for (int i = 0; i < str.length(); i++) {
			m9(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}
	}

	public void m10(String str) {
		char temp = 0;
		str = str.replace(" ", "");
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		str = "";
		for (int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		System.out.println("Sorted String:: " + str);
	}

	public void m11(String str1, String str2) {
		System.out.println("String1 before swapping:: " + str1);
		System.out.println("String2 before swapping:: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String1 after swapping:: " + str1);
		System.out.println("String2 after swapping:: " + str2);

	}

	public void m12(String str) {
		String result = "";
		String[] sSplit = str.split(" ");
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			result += " " + ch + sSplit[i].substring(1);
		}

		System.out.println("First letter in upper case:: " + result.trim());
	}

	public void m13(String str) {
		if (str == null || str.isEmpty()) {
			return;
		}
		str = str.replaceAll("( +)", " ").trim();
		final StringBuilder sb = new StringBuilder(str.length());
		for (final String words : str.split(" ")) {
			if (!words.isEmpty()) {
				sb.append(Character.toUpperCase(words.charAt(0)));
				sb.append(words.substring(1).toLowerCase());
			}
			if (!(words.length() == str.length())) {
				sb.append(" ");
			}
		}
		System.out.println("Camel case from random rumble String:: " + sb);
	}

	public void m14(String str) {
		if (str == null || str.isEmpty()) {
			return;
		}
		str = str.replaceAll("( +)", " ").trim();
		int index = 2;
		String[] sSplit = str.split(" ");
		if (index >= 0 && index < sSplit.length) {
			System.out.print("Output is:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		} else {
			System.out.println("Invalid Input!!");
		}
	}

	public void m15(String str) {
		System.out.println("Occurence of characters in a String:: ");
		str = str.replaceAll(" ", "").trim();
		char[] ch = str.toCharArray();
		int count = 0;
		Map<Character, Integer> cMap = new HashMap<>();
		for (char c : ch) {
			if (cMap.containsKey(c)) {
				if (count < cMap.get(c)) {
					count = cMap.get(c) + 1;
				}
				cMap.put(c, cMap.get(c) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				cMap.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> entSet = cMap.entrySet();
		for (Map.Entry<Character, Integer> entMap : entSet) {
			System.out.println(entMap.getKey() + "=" + entMap.getValue());
		}

	}

	public void m16(String str1, String str2) {
		boolean result = false;
		if (str1.length() != str2.length()) {
			System.out.println("Strings are not anagram!!");
		} else {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

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

	public void m17(String str) {
		String search_String = "us learn";
		boolean is_Present = str.contains(search_String);
		System.out.println("is search string present in our string?:: " + is_Present);
		boolean is_Present2 = str.matches("(.*)" + search_String + "(.*)");
		System.out.println("is search string present in our string?:: " + is_Present2);
	}

	public void m18(String str) {
		System.out.println("Only String from rumble jumble:: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only integer from rumble jumble:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only special characters from rumble jumble:: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	public void m19(String[] str) {
		System.out.println("String array sorted:: ");
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

	public void m20(String[] str) {
		System.out.println("Finding duplicate array elements using brute force:: ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					System.out.println(str[i]);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate elemnet present!!");
		}
	}

	public void m21(String[] str) {
		System.out.println("Finding duplicate array elements using Set:: ");
		int count = 0;
		Set<String> sSet = new HashSet<>();
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
		}

		if (count == 0) {
			System.out.println("No Duplicate elemnet present!!");
		}
	}

	public void m22(String[] str) {
		System.out.println("Finding duplicate array elements using Map:: ");
		Map<String, Integer> sMap = new HashMap<>();
		for (String s : str) {
			if (sMap.containsKey(s)) {
				sMap.put(s, sMap.get(s) + 1);
			} else {
				sMap.put(s, 1);
			}
		}
		Set<Entry<String, Integer>> entSet = sMap.entrySet();
		for (Map.Entry<String, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
			}
		}

	}

	public void m23(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Only Unique element between two array:: ");

		for (String s : s1) {
			System.out.println(s);
		}
	}

	public void m24(String[] str) {
		boolean is_Sorted = true;
		if (str == null || str.length == 0 || str.length == 1) {
			is_Sorted = true;
		}
		for (int i = 1; i < str.length; i++) {
			if (str[i - 1].compareTo(str[i]) > 0) {
				is_Sorted = false;
			}
		}
		System.out.println("Is array Sorted?? " + is_Sorted);
	}

	public void m25(String[] str) {
		System.out.println("Occurence of array elements:: ");
		Map<String, Integer> sMap = new HashMap<>();
		for (String s : str) {
			if (sMap.containsKey(s)) {
				sMap.put(s, sMap.get(s) + 1);
			} else {
				sMap.put(s, 1);
			}
		}
		System.out.println(sMap);
	}

	public void m26(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is the 36th statement from java code.!!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void m27(String readline) {
		try {
			FileReader fr = new FileReader(new File("E:\\" + readline + ".txt"));
			BufferedReader br = new BufferedReader(fr);
			String sb;
			while ((sb = br.readLine()) != null) {
				System.out.println(sb);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void m28() {
		int sLength;
		System.out.println("Enter teh length of an array:: ");
		Scanner scan = new Scanner(System.in);
		sLength = scan.nextInt();

		String[] arr = new String[sLength];
		System.out.println("Enter the array elemnts:: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.next();
		}
		System.out.println("Array elements are:: ");
		for (String s : arr) {
			System.out.println(s);
		}

	}

	public void m29(String str) {
		int count = 0;
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count++;
			}
		}
		System.out.println("Number of vowels present in str:: " + count);
	}

	public static void main(String[] args) {
		String str1 = "learning";
		String str2 = "let us learn again us";
		String str3 = " lEt uS  learn aGAin ";
		String str4 = "let us learn again new things";
		String perm = "DEN";
		String ana1 = "ONLY";
		String ana2 = "LONY";
		String random = "Rama75647n&*%&^98656757&^&%%";
		String[] arr1 = str2.split(" ");
		String[] arr2 = str4.split(" ");
		Practice_36 obj1 = new Practice_36();
		try {
			Practice_36 obj2 = (Practice_36) obj1.clone();
			obj2.m1(str1);
			obj2.m2(str2);
			obj2.m3(str2);
			obj2.m4(str2);
			obj2.m5(str2);
			obj2.m6(str2);
			obj2.m7(str2);
			obj2.m8(str2);
			System.out.println("Permutation of " + perm + " is: ");
			obj2.m9("", perm);
			obj2.m10(str1);
			obj2.m11(str1, str2);
			obj2.m12(str2);
			obj2.m13(str3);
			obj2.m14(str3);
			obj2.m15(str2);
			obj2.m16(ana2, ana1);
			obj2.m17(str2);
			obj2.m18(random);
			obj2.m19(arr1);
			obj2.m20(arr1);
			obj2.m21(arr1);
			obj2.m22(arr1);
			obj2.m23(arr1, arr2);
			obj2.m24(arr1);
			obj2.m25(arr1);
			obj2.m26("thirtysix");
			obj2.m27("thirtysix");
			// obj2.m28();
			obj2.m29(str4);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
