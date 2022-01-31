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
import java.util.Set;

public class Practice_24 implements Cloneable {

	public void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.println("String after reverse:: " + strReverse);
	}

	public void m2(String str) {
		System.out.println("String reverse on their position:: ");
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
		int count2 = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("\nCount of character in a String:: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words in a String :: " + count2);
	}

	public void m4(String str) {
		System.out.println("Duplicate character in a String using Map:: ");
		int count = 0;
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
		Set<Map.Entry<Character, Integer>> setEntry = cMap.entrySet();
		for (Map.Entry<Character, Integer> mapEntry : setEntry) {
			if (mapEntry.getValue() > 1) {
				System.out.println(mapEntry.getKey() + "=" + mapEntry.getValue());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate character");
		}

	}

	public void m5(String str) {
		System.out.println("Only Unqiue and non-repeated character in a String:: ");
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

	public void m6(String str) {

		String isFinal = "";
		for (int i = 0; i < str.length(); i++) {
			if (!isFinal.contains(String.valueOf(str.charAt(i)))) {
				isFinal += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Unique and one time repeated character only:: " + isFinal);
	}

	public void m7(String str) {
		System.out.println("Duplicate element in a string using Set:: ");
		int count = 0;
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		for (char c : ch) {
			if (cSet.add(c) == false) {
				System.out.print(c + " ");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No duplicate");
		}
	}

	public void m8(String prefix, String str) {
		if (str == null || str.isEmpty()) {
			System.out.println(prefix + " ");
		}
		for (int i = 0; i < str.length(); i++) {
			m8(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}

	}

	public void m9(String str) {
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
		System.out.println("String after sorted:: " + str);
	}

	public void m10(String str) {
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Map<Character, Integer> cMap = new LinkedHashMap<>();
		int count = 0;
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
		System.out.println("Occurence of character in count :: \n" + cMap);

	}

	public void m11(String str1, String str2) {
		System.out.println("Str1 before swapping:: " + str1);
		System.out.println("Str2 before swapping:: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("Str1 after swapping:: " + str1);
		System.out.println("Str2 after swapping:: " + str2);

	}

	public void m12(String ana1, String ana2) {
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

	public void m13(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("String first character in upper case:: \n" + str.trim());
	}

	public void m14(String str) {
		String[] sSplit = str.split(" ");
		int index = 7;
		if (index >= 0 && index < sSplit.length) {
			System.out.print("Output:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		} else {
			System.out.println("Invalid index");
		}

	}

	public void m15(String str) {
		if (str == null) {
			System.out.println("Void");
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
		System.out.println("Camel case:: " + sb);
	}

	public void m16(String str) {
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		int count = 0;
		for (char c : ch) {
			count++;
		}
		System.out.println("Length of String without length method is:: " + count);
	}

	public void m17(String str) {
		String searching_Sub = "in eclipse";
		boolean isPresent_1 = str.contains(searching_Sub);
		System.out.println(isPresent_1);

		boolean isPresent_2 = str.matches("(.*)" + searching_Sub + "(.*)");
		System.out.println(isPresent_2);

		boolean isPresent_3 = str.indexOf(str) != -1;
		System.out.println(isPresent_3);
	}

	public void m18(String[] str) {
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
		System.out.println("String array elements sorted:: ");
		for (String s : str) {
			System.out.println(s);
		}
	}

	public void m19(String[] str) {
		System.out.println("Finding duplicate array elements using brute force:: ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					System.out.println(str[i]);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate element present in String array!!");
		}
	}

	public void m20(String[] str) {
		System.out.println("Finding duplicate array elements using Set:: ");
		Set<String> sSet = new HashSet<>();
		for (String s : str) {
			if (sSet.add(s) == false) {
				System.out.println(s);
			}
		}
	}

	public void m21(String[] str) {
		System.out.println("Finding duplicate array elements using Map:: ");
		Map<String, Integer> sMap = new HashMap<>();
		int count = 0;
		for (String S : str) {
			if (sMap.containsKey(S)) {
				sMap.put(S, sMap.get(S) + 1);
			} else {
				sMap.put(S, 1);
			}
		}
		Set<Map.Entry<String, Integer>> entSet = sMap.entrySet();
		for (Map.Entry<String, Integer> mapEntry : entSet) {
			if (mapEntry.getValue() > 1) {
				System.out.println(mapEntry.getKey() + "=" + mapEntry.getValue());
			}
		}
	}

	public void m22(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Only unique element between two array:: ");
		for (String S : s1) {
			System.out.println(S);
		}
	}

	public void m23(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is the Twentyfourth file i'm writting from the code.");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void m24(String readFile) {
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

	public static void main(String[] args) {
		String str1 = "selenium";
		String str2 = "practicing java program questions in eclipse in";
		String str3 = "practicing of java program questions in the eclipse IDE";
		String[] arr1 = str2.split(" ");
		String[] arr2 = str3.split(" ");
		String pali = "racecar";
		String perm = "HOL";
		String ana1 = "Listen";
		String ana2 = "Silent";
		Practice_24 obj1 = new Practice_24();
		try {
			Practice_24 obj2 = (Practice_24) obj1.clone();
			obj2.m1(str1);
			obj2.m2(str2);
			obj2.m3(str2);
			obj2.m4(str2);
			obj2.m5(str2);
			obj2.m6(str2);
			obj2.m7(str2);
			System.out.println("\nPermuatation of " + perm + " is:");
			obj2.m8("", perm);
			obj2.m9(str1);
			obj2.m10(str2);
			obj2.m11(str1, str2);
			obj2.m12(ana1, ana2);
			obj2.m13(str2);
			obj2.m14(str2);
			obj2.m15(str2);
			obj2.m16(str2);
			obj2.m17(str2);
			obj2.m18(arr1);
			obj2.m19(arr1);
			obj2.m20(arr1);
			obj2.m21(arr1);
			obj2.m22(arr1, arr2);
			obj2.m23("Twentyfourth");
			obj2.m24("Twentyfourth");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
