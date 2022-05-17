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
import java.util.Set;

public class Practice_40 implements Cloneable {

	public void m1(String str) {
		System.out.println("Reverse a String:: \nApproach1:: ");
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.print(strReverse);

		System.out.println("\nApproach2:: ");
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		System.out.println("\nApproach3:: ");
		StringBuilder sb = new StringBuilder(str);
		System.out.print(sb.reverse());

	}

	public void m2(String str) {
		System.out.println("\nString reverse on their position:: ");
		String[] sSplit = str.split(" ");
		for (int i = 0; i < sSplit.length; i++) {
			for (int j = sSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(sSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public void m3(String str) {
		System.out.println("\nStrings statement in reverse order:: ");
		String result = "";
		int i = str.length() - 1;
		while (i >= 0) {
			while (i >= 0 && str.charAt(i) == ' ')
				i--;
			int j = i;
			if (i < 0) {
				break;
			}
			while (i >= 0 && str.charAt(i) != ' ')
				i--;
			if (result.isEmpty()) {
				result = result.concat(str.substring(1 + i, 1 + j));
			} else {
				result = result.concat(" " + str.substring(1 + i, 1 + j));
			}
		}
		System.out.println(result);
	}

	public void m4(String str) {

		int char_count = 1;
		int word_count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) != '\t')) {
				char_count++;
			}
		}
		System.out.println("Count of character in a string:: " + char_count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				word_count++;
			}
		}
		System.out.println("Count of word in a string:: " + word_count);
	}

	public void m5(String str) {
		System.out.println("Find Duplicate character in a String using Map: ");
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Map<Character, Integer> cMap = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (cMap.containsKey(c)) {
				cMap.put(c, cMap.get(c) + 1);
			} else {
				cMap.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> cSet = cMap.entrySet();
		for (Map.Entry<Character, Integer> entMap : cSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
			}
		}
	}

	public void m6(String str) {
		System.out.println("Find Duplicate character in a String using Set:: ");
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		for (char c : ch) {
			if (cSet.add(c) == false) {
				System.out.print(c + " ");
			}
		}
	}

	public void m7(String str) {
		System.out.println("\nOnly Unqiue and non-repeated character in a String::");

		boolean isUnique = true;
		if (str == null || str.isEmpty()) {
			isUnique = true;
		}
		for (int i = 0; i < str.length(); i++) {
			isUnique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.print(str.charAt(i));
			}
		}
	}

	public void m8(String str) {

		String finalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!finalStr.contains(String.valueOf(str.charAt(i)))) {
				finalStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("\nUnique and one time repeated character only:: " + finalStr);
	}

	public void m9(String prefix, String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("" + prefix);
		}
		for (int i = 0; i < str.length(); i++) {
			m9(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}
	}

	public void m10(String str) {

		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
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
		str = "";
		for (int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		System.out.println("Sorted String:: " + str);
	}

	public void m11(String str1, String str2) {
		System.out.println("String1 before swap:: " + str1);
		System.out.println("String2 before swap:: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String1 after swap:: " + str1);
		System.out.println("String2 after swap:: " + str2);
	}

	public void m12(String str) {

		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First letter in upper case:: " + str.trim());

	}

	public void m13(String str) {
		if (str == null || str.isEmpty()) {
			return;
		}
		str = str.replaceAll("\\s+", " ");
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
		int index = 2;
		String[] sSplit = str.split(" ");
		if (index >= 0 && 0 <= sSplit.length - 1) {
			System.out.print("Output is:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		}
	}

	public void m15(String str) {
		System.out.println("Occurence of characters:: ");
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Map<Character, Integer> cMap = new HashMap<>();
		for (char c : ch) {
			if (cMap.containsKey(c)) {
				cMap.put(c, cMap.get(c) + 1);
			} else {
				cMap.put(c, 1);
			}
		}
		System.out.println(cMap);
	}

	public void m16(String ana1, String ana2) {
		boolean result = false;
		if (ana1.length() != ana2.length()) {
			System.out.println("Strings are not anagram!!");
		} else {
			char[] ch1 = ana1.toLowerCase().toCharArray();
			char[] ch2 = ana1.toLowerCase().toCharArray();

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
		String searched_string = "is a";
		boolean is_present_1 = str.contains(searched_string);
		System.out.println("is Searched String present in our string?:: " + is_present_1);
		boolean is_present_2 = str.matches("(.*)" + searched_string + "(.*)");
		System.out.println("is Searched String present in our string?:: " + is_present_2);

	}

	public void m18(String str) {
		System.out.println("Only String :: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Numbers :: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only Special Characters :: " + str.replaceAll("[0-9a-zA-Z]", ""));
	}

	public void m19(String str, String str3) {
		int spaces = str.replaceAll("[^ ]", "").length();
		System.out.println("Count only spaces :: " + spaces);

		int count = 0;
		for (int i = 0; i < str3.length(); i++) {
			if (Character.isWhitespace(str3.charAt(i))) {
				count++;
			}
		}
		System.out.println("Count space and tab as well:: " + count);

	}

	public void m20(String[] str) {
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
		System.out.println("Sorted Array elements:: ");
		for (int i = 0; i < str.length; i++) {
			if (i >= str.length - 1) {
				System.out.print(str[i] + " ");
			} else {
				System.out.print(str[i] + ", ");
			}
		}
	}

	public void m21(String[] str) {
		System.out.println("\nFinding duplicate array elements using brute force:: ");
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < i; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
	}

	public void m22(String[] str) {
		System.out.println("Finding duplicate array elements using Set:: ");
		Set<String> sSet = new HashSet<>();
		for (String s : str) {
			if (sSet.add(s) == false) {
				System.out.println(s);
			}
		}
	}

	public void m23(String[] str) {
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

	public void m24(String[] str) {
		boolean isSorted = true;
		if (str == null || str.length == 0) {
			isSorted = true;
		}
		for (int i = 1; i < str.length; i++) {
			if (str[i - 1].compareTo(str[i]) > 0) {
				isSorted = false;
			}
		}
		System.out.println("Is String array Sorted:: " + isSorted);
	}

	public void m25(String[] arr1, String[] arr2) {
		List<String> li1 = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();

		li1.addAll(Arrays.asList(arr1));
		li2.addAll(Arrays.asList(arr2));

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

	public void m26(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is the 40th file I'm writing from the code!!");
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void m27(String readFile) {
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
		}
	}

	public void m28(String str) {

	}

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "this is a java programming";
		String str3 = "     	tHis   iS a 	sTRIng    STATEment     ";
		String perm = "TWO";
		String ana1 = "NIT";
		String ana2 = "TIN";
		String random = "Rama75647n&*%&^98656757&^&%%";
		String str4 = "		this is a string statement";

		String arr = "this is a string statement of a language";
		String arr_2 = "this is a string statement in the java";
		String[] arr1 = arr.split(" ");
		String[] arr2 = arr_2.split(" ");
		Practice_40 obj1 = new Practice_40();

		try {
			Practice_40 obj2 = (Practice_40) obj1.clone();
			obj2.m1(str1);
			obj2.m2(str2);
			obj2.m3(str2);
			obj2.m4(str2);
			obj2.m5(str2);
			obj2.m6(str2);
			obj2.m7(str2);
			obj2.m8(str2);
			System.out.println("Permutation of " + perm + " is:: ");
			obj2.m9("", perm);
			obj2.m10(str1);
			obj2.m11(str1, str2);
			obj2.m12(str2);
			obj2.m13(str3);
			obj2.m14(str2);
			obj2.m15(str2);
			obj2.m16(ana1, ana2);
			obj2.m17(str2);
			obj2.m18(random);
			obj2.m19(str2, str3);
			obj2.m20(arr1);
			obj2.m21(arr1);
			obj2.m22(arr1);
			obj2.m23(arr1);
			obj2.m24(arr2);
			obj2.m25(arr1, arr2);
			obj2.m26("fortythFile");
			obj2.m27("fortythFile");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
