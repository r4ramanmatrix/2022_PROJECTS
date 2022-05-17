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

public class Practice_39 implements Cloneable {

	public void m1(String str) {
		System.out.println("Different approaches to reverse a String:: ");
		String revstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);
		}
		System.out.println("Approach 1:: \n" + revstr);

		char[] ch = str.toCharArray();
		System.out.println("Approach 2:: ");
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		StringBuilder sb = new StringBuilder(str);
		System.out.println("\nApproach 3:: \n" + sb.reverse());

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
		System.out.println("\nStrings statement in reverse order:: ");
		int i = str.length() - 1;
		String result = "";
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
		System.out.println("Count of character :: " + char_count);
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				word_count++;
			}
		}
		System.out.println("Count of word :: " + word_count);
	}

	public void m5(String str) {
		System.out.println("Find Duplicate character in a String using Map: ");
		int count = 0;
		Map<Character, Integer> cMap = new HashMap<Character, Integer>();
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
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
		System.out.println("Find Duplicate character in a String using Set:: ");
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		for (char c : ch) {
			if (cSet.add(c) == false) {
				System.out.print(c);
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
				}
			}
			if (isUnique) {
				System.out.println(str.charAt(i));
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

		System.out.println("Unique and one time repeated character only:: " + finalStr);
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
		System.out.println("Sorted String:: " + str);
	}

	public void m11(String str1, String str2) {
		System.out.println("String 1 before sorted:: " + str1);
		System.out.println("String 2 before sorted:: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String 1 after sorted:: " + str1);
		System.out.println("String 2 after sorted:: " + str2);
	}

	public void m12(String str) {
		System.out.println("First letter in upper case::");
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
		str = str.replaceAll("\\s+", " ").trim();
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
		System.out.println("Camel case from random rumble String:: " + sb);
	}

	public void m14(String str) {
		int index = 3;
		String[] sSplit = str.split(" ");
		if (index >= 0 && index <= sSplit.length - 1) {
			System.out.print("Output is:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		} else {
			System.out.println("Invalid index number!!");
		}
	}

	public void m15(String str) {
		str = str.replaceAll("\\s+", "");
		char[] ch = str.toCharArray();
		Map<Character, Integer> cMap = new HashMap<>();
		for (char c : ch) {
			if (cMap.containsKey(c)) {
				cMap.put(c, cMap.get(c) + 1);
			} else {
				cMap.put(c, 1);
			}
		}
		System.out.println("\nOccurence of characters:: " + cMap);
	}

	public void m16(String ana1, String ana2) {
		boolean result = false;
		if (ana1.length() != ana2.length()) {
			System.out.println("Strings are not anagram!!");
		} else {
			char[] ch1 = ana1.toLowerCase().toCharArray();
			char[] ch2 = ana2.toLowerCase().toCharArray();

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
		String searched_String = "is a";
		boolean is_present_1 = str.contains(searched_String);
		System.out.println("is Searched String present in our string?? :: " + is_present_1);
		boolean is_present_2 = str.matches("(.*)" + searched_String + "(.*)");
		System.out.println("is Searched String present in our string?? :: " + is_present_2);

	}

	public void m18(String str) {
		System.out.println("Only String :: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Numbers:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only Special characters:: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	public void m19(String str) {

		int spaces = str.replaceAll("[^ ]", "").length();
		System.out.println("Count only spaces in a String Approach 1:: " + spaces);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i)))
				count++;
		}
		System.out.println("If want to count tab and space in a String Approach 2:: " + count);
	}

	public void m20(String str[]) {
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
		System.out.println("Sorted String array:: ");
		for (int i = 0; i < str.length; i++) {
			if (i == str.length - 1) {
				System.out.print(str[i] + " ");
			} else {
				System.out.print(str[i] + ", ");
			}
		}
	}

	public void m21(String[] str) {
		System.out.println("\nFinding duplicate array elements using brute force:: ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[i]);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate element!!");
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

	public void m24(String str[]) {
		boolean is_Sorted = true;
		if (str == null || str.length == 0) {
			is_Sorted = true;
		}
		for (int i = 1; i < str.length; i++) {
			if (str[i - 1].compareTo(str[i]) > 0) {
				is_Sorted = false;
			}
		}
		System.out.println("Is String array Sorted:: " + is_Sorted);
	}

	public void m25(String[] str1, String[] str2) {
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

	public void m26(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is the 39th file writting from the code!!");
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public void m27(String readfile) {
		String str;
		try {
			FileReader fer = new FileReader(new File("E:\\" + readfile + ".txt"));
			BufferedReader br = new BufferedReader(fer);

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void m28(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				count++;
			}
		}
		System.out.println("Count of vowel in \"" + str + "\" is:: " + count);
	}

	public void misc(String str) {
		String holdInt = "100";
		System.out.println("Value is:: " + holdInt + 100);
		System.out.println("Value is:: " + str.length() + 100);

		System.out.println("After converting String into Numbers");

		System.out.println("Now Value is:: " + (Integer.parseInt(holdInt) + 100));
		System.out.println("Now Value is:: " + (str.length() + 100));
	}

	public void checkPalindrome(String str) {
		String strRev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strRev = strRev + str.charAt(i);
		}
		if (strRev.equalsIgnoreCase(str)) {
			System.out.println(str + " is a Palindrome.");
		} else {
			System.out.println(str + " is not a Palindrome.");
		}
	}

	public static void main(String[] args) {
		String str1 = "string";
		String str2 = "this is a string statement";
		String str3 = "     	tHis   iS a sTRIng    STATEment     ";
		String perm = "TWO";
		String ana1 = "NIT";
		String ana2 = "TIN";
		String random = "Rama75647n&*%&^98656757&^&%%";
		String str4 = "		this is a string statement";

		String arr = "this is a string statement of a language";
		String arr_2 = "this is a string statement in the java";
		String[] arr1 = arr.split(" ");
		String[] arr2 = arr_2.split(" ");

		Practice_39 obj1 = new Practice_39();
		try {
			Practice_39 obj2 = (Practice_39) obj1.clone();
			obj2.m1(str1);
			obj2.m2(str2);
			obj2.m3(str2);
			obj2.m4(str2);
			obj2.m5(str2);
			obj2.m6(str2);
			obj2.m7(str2);
			obj2.m8(str2);
			System.out.println("Permutaion of " + perm + " is:: ");
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
			obj2.m19(str4);
			obj2.m20(arr1);
			obj2.m21(arr1);
			obj2.m22(arr1);
			obj2.m23(arr1);
			obj2.m24(arr1);
			obj2.m25(arr1, arr2);
			obj2.m26("thirtynine");
			obj2.m27("thirtynine");
			obj2.m28(str2);
			obj2.misc(str1);
			obj2.checkPalindrome("RAMAN");
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
	}

}
