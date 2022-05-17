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

public class Practice_38 {

	public void m1(String str) {
		System.out.println("To reverse a String ");
		int count = 0;
		System.out.println("Approach " + ++count + ": ");
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);

		System.out.println("Approach " + ++count + ": ");
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		System.out.println("\nApproach " + ++count + ": ");
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());

	}

	public void m2(String str) {
		System.out.println("String reverse of their position:: ");
		String[] sSplit = str.split(" ");
		for (int i = 0; i < sSplit.length; i++) {
			for (int j = sSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(sSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public void m3(String str) {
		int count = 1;
		int count_1 = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("\nCount of number of character in a String:: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count_1++;
			}
		}
		System.out.println("Count of words in a String statement:: " + count_1);
	}

	public void m4(String str) {
		System.out.println("Strings statement in reverse order:: ");
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
		Set<Entry<Character, Integer>> entSet = cMap.entrySet();
		for (Map.Entry<Character, Integer> entmap : entSet) {
			if (entmap.getValue() > 1) {
				System.out.println(entmap.getKey() + "=" + entmap.getValue());
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
				System.out.println(c);
			}
		}
	}

	public void m7(String str) {
		System.out.println("Only Unqiue and non-repeated character in a String::");
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();

		System.out.println("Approach 1:: ");
		for (int i = 0; i < ch.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < ch.length; j++) {
				if (i != j && ch[i] == ch[j]) {
					isUnique = false;
				}
			}
			if (isUnique) {
				System.out.println(ch[i]);
			}
		}

		System.out.println("Approach 2:: ");

		for (int i = 0; i < str.length(); i++) {
			boolean isUnique = true;
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
		System.out.println("String 1 before swapping:: " + str1);
		System.out.println("String 2 before swapping:: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String 1 after swapping:: " + str1);
		System.out.println("String 2 after swapping:: " + str2);
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
		if (str == null || str.isEmpty()) {
			return;
		}
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

		}
	}

	public void m15(String str) {

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
		System.out.println("\nOccurence of characters:: " + cMap);
	}

	public void m16(String str1, String str2) {
		boolean result = false;
		if (str1.length() != str2.length()) {
			System.out.println("String are not anagram!!");
		} else {
			char[] ch1 = str1.toUpperCase().toCharArray();
			char[] ch2 = str2.toUpperCase().toCharArray();

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
		boolean is_Present_1 = str.contains(searched_String);
		System.out.println("is Searched String present in our string?? :: " + is_Present_1);
		boolean is_Present_2 = str.matches("(.*)" + searched_String + "(.*)");
		System.out.println("is Searched String present in our string?? :: " + is_Present_2);
	}

	public void m18(String str) {
		System.out.println("Only String:: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Numbers:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only Special characters:: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	public void m19(String[] str) {
		System.out.println("Sorted String array:: ");
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
			System.out.print(str[i] + " ");
		}
	}

	public void m20(String[] str) {
		System.out.println("\nFinding duplicate array elements using brute force:: ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
	}

	public void m21(String[] str) {
		System.out.println("Finding duplicate array elements using Set:: ");
		Set<String> sSet = new HashSet<>();
		for (String s : str) {
			if (sSet.add(s) == false) {
				System.out.println(s);
			}
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
		System.out.println("Only Unique element between two array:: ");
		List<String> li1 = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		for (String s : s1) {
			System.out.println(s);
		}
	}

	public void m24(String[] str) {
		boolean is_Sorted = true;
		if (str == null || str.length == 0) {
			is_Sorted = true;
		} else {
			for (int i = 1; i < str.length; i++) {
				if (str[i - 1].compareTo(str[i]) > 0) {
					is_Sorted = false;
				}
			}
		}
		System.out.println("Is String array Sorted?:: " + is_Sorted);
	}

	public void m25(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is the 38th file I'm writing from the code!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public void m26(String readFile) {
		String str;
		try {
			FileReader fr = new FileReader(new File("E:\\" + readFile + ".txt"));
			BufferedReader br = new BufferedReader(fr);

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void m27(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
					|| str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				System.out.println(str.charAt(i) + " is a Vowel!!");
				count++;
			}
		}
		System.out.println("Count of Vowel in String :: " + count);
	}

	public static void main(String[] args) {
		String str1 = "strings";
		String str2 = "this is a string statement";
		String str3 = "  tHis iS a    sTring sTATEment ";
		String str4 = "this is the string statement in the java";
		String perm = "WIN";
		String ana1 = "NOW";
		String ana2 = "WiN";
		String random = "Rama75647n&*%&^98656757&^&%%";
		String[] arr1 = str2.split(" ");
		String[] arr2 = str4.split(" ");
		Practice_38 obj1 = new Practice_38();
		obj1.m1(str1);
		obj1.m2(str2);
		obj1.m3(str2);
		obj1.m4(str2);
		obj1.m5(str1);
		obj1.m6(str1);
		obj1.m7(str1);
		obj1.m8(str2);
		System.out.println("Permutation of " + perm + " is: ");
		obj1.m9("", perm);
		obj1.m10(str1);
		obj1.m11(str1, str2);
		obj1.m12(str2);
		obj1.m13(str3);
		obj1.m14(str2);
		obj1.m15(str2);
		obj1.m16(ana1, ana2);
		obj1.m17(str2);
		obj1.m18(random);
		obj1.m19(arr1);
		obj1.m20(arr2);
		obj1.m21(arr2);
		obj1.m22(arr2);
		obj1.m23(arr1, arr2);
		obj1.m24(arr2);
		obj1.m25("thirtyeight");
		obj1.m26("thirtyeight");
		obj1.m27(str2);
	}

}
