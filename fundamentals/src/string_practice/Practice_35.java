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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import serialization_deserialzation.ArrayLIst_Serialization;

public class Practice_35 {

	public void m1(String str) {
		System.out.println("Approach 1:");
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.println("String after reverse:: " + strReverse);

		System.out.println("Approach 2:");
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

		System.out.println("\nApproach 3:");
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());

	}

	public void m2(String str) {
		System.out.println("String reverse character on their position:: ");
		String[] sSplit = str.split(" ");
		for (int i = 0; i < sSplit.length; i++) {
			for (int j = sSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(sSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public void m3(String str) {
		System.out.println("\nFirst and last word replace::");
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
		int count = 1;
		int count2 = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("Count of characters in a String:: " + count);
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words in a String:: " + count2);
	}

	public void m5(String str) {
		System.out.println("Find Duplicate character in a String using Map: ");
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Map<Character, Integer> cMap = new HashMap<Character, Integer>();
		for (char c : ch) {
			Integer count = cMap.get(c);
			if (count == null) {
				cMap.put(c, 1);
			} else {
				cMap.put(c, ++count);
			}
		}
		Set<Map.Entry<Character, Integer>> eSet = cMap.entrySet();
		for (Map.Entry<Character, Integer> eMap : eSet) {
			if (eMap.getValue() > 1) {
				System.out.println(eMap.getKey() + "=" + eMap.getValue());
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
		if (str == null || str.isEmpty()) {
			System.out.println(prefix + " ");
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
		System.out.println("Sorted String is:: " + str);
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
			System.out.println("Void!!");
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
		System.out.println("Camel case from random rumble String:: " + sb);
	}

	public void m14(String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("VOID!!");
		}
		String[] sSplit = str.split(" ");
		int index = 2;
		if (index >= 0 && index < sSplit.length) {
			System.out.print("Output is:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		} else {
			System.out.println("Invalid input");
		}
	}

	public void m15(String str) {
		System.out.println("\nOccurence of characters in a String:: ");
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Map<Character, Integer> cMap = new LinkedHashMap<Character, Integer>();
		for (char c : ch) {
			if (cMap.containsKey(c)) {
				cMap.put(c, cMap.get(c) + 1);
			} else {
				cMap.put(c, 1);
			}
		}
		System.out.println(cMap);
	}

	public void m16(String str1, String str2) {
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

	public void m17(String str) {
		String searchString = "this is";
		boolean result_1 = str.matches("(.*)" + searchString + "(.*)");
		System.out.println("is search string present in our string:: " + result_1);

		boolean result_2 = str.contains(searchString);
		System.out.println("is search string present in our string:: " + result_2);
	}

	public void m18(String str) {
		System.out.println("Only String:: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Numbers:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only Special characters:: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	public void m19(String str) {
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
		System.out.println("After string replaced:: " + result);
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
		System.out.println("String array sorted:: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public void m21(String[] str) {
		System.out.println("Finding duplicate array elements using brute force:: ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i; j < str.length; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					System.out.println(str[i]);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate!!");
		}
	}

	public void m22(String[] str) {
		System.out.println("Finding duplicate array elements using Set:: ");
		int count = 0;
		Set<String> sSet = new HashSet<>();

		for (String s : str) {
			if (sSet.add(s) == false) {
				System.out.println(s);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate!!");
		}
	}

	public void m23(String[] str) {
		System.out.println("Finding duplicate array elements using Map:: ");
		Map<String, Integer> sMap = new HashMap<>();
		int count = 0;
		for (String s : str) {
			if (sMap.containsKey(s)) {
				sMap.put(s, sMap.get(s) + 1);
			} else {
				sMap.put(s, 1);
			}
		}
		Set<Map.Entry<String, Integer>> entSet = sMap.entrySet();
		for (Map.Entry<String, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate!!");
		}
	}

	public void m24(String[] str1, String[] str2) {
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

	public void m25(String[] str) {
		boolean isSorted = true;
		if (str == null | str.length == 0 || str.length == 1) {
			isSorted = true;
		}
		for (int i = 1; i < str.length; i++) {
			if (str[i - 1].compareTo(str[i]) > 0) {
				isSorted = false;
			}
		}
		System.out.println("Is Array Sorted:: " + isSorted);
	}

	public void m26(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is the thirty fifth file writting from the code!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
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

	public void m28(String[] str) {
		Map<String, Integer> sMap = new LinkedHashMap<>();
		for (String s : str) {
			if (sMap.containsKey(s)) {
				sMap.put(s, sMap.get(s) + 1);
			} else {
				sMap.put(s, 1);
			}
		}
		System.out.println("Occurence of array elements:: ");
		Set<Map.Entry<String, Integer>> entSet = sMap.entrySet();
		for (Map.Entry<String, Integer> entMap : entSet) {
			System.out.println(entMap.getKey());
		}
	}
	
	public void m27() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array:: ");
		int sLength = scan.nextInt();

		String[] arrs = new String[sLength];

		System.out.println("Enter the array elements:: ");
		for (int i = 0; i < sLength; i++) {
			arrs[i] = scan.next();
		}
		for (int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i]);
		}
	}

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "this is a statement";
		String str3 = "thIs iS a sTRIng staTEMENt";
		String perm = "OIL";
		String ana1 = "end";
		String ana2 = "den";
		String random = "Rama75647n&*%&^98656757&^&%%";
		String[] arr1 = str2.split(" ");
		String[] arr2 = str3.split(" ");
		Practice_35 obj1 = new Practice_35();
		obj1.m1(str1);
		obj1.m2(str2);
		obj1.m3(str2);
		obj1.m4(str2);
		obj1.m5(str2);
		obj1.m6(str2);
		obj1.m7(str2);
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
		obj1.m19(str2);
		obj1.m20(arr1);
		obj1.m21(arr1);
		obj1.m22(arr1);
		obj1.m23(arr1);
		obj1.m24(arr1, arr2);
		obj1.m25(arr1);
		obj1.m26("thirtyfive");
		obj1.m27("thirtyfive");
		obj1.m28(arr1);
	}

}
