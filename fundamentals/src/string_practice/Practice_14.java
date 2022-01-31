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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_14 implements Cloneable {

	public static void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.println("String after reverse:: " + strReverse);
	}

	public static void m2(String str) {
		System.out.println("String reverse on their position:: ");
		String[] sSplit = str.split(" ");
		for (int i = 0; i < sSplit.length; i++) {
			for (int j = sSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(sSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public static void m3(String str) {
		int count = 1;
		int count2 = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("\nCount of character in a string :: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words in a string:: " + count2);
	}

	public static void m4(String prefix, String str) {
		if (str.isEmpty() || str == null) {
			System.out.println(prefix + " ");
		}
		for (int i = 0; i < str.length(); i++) {
			m4(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
		}
	}

	public static void m5(String str) {
		System.out.println("Only unique character in a string are:: ");
		for (int i = 0; i < str.length(); i++) {
			boolean isUnique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j & str.charAt(i) == str.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(str.charAt(i));
			}
		}
	}

	public static void m6(String str) {
		String finalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!finalStr.contains(String.valueOf(str.charAt(i)))) {
				finalStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Only Unique and one time character :: " + finalStr);
	}

	public static void m7(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First letter in uppercase:: " + str.trim());
	}

	public static void m8(String str) {
		char[] ch = str.toCharArray();
		char temp = 0;
		str = "";
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
		System.out.println("STring sorted:: " + str);
	}

	public static void m9(String str1, String str2) {
		System.out.println("Str1 before swapping :: " + str1);
		System.out.println("Str2 before swapping :: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("Str1 after swapping :: " + str1);
		System.out.println("Str2 after swapping :: " + str2);
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

	public static void m11(String str) {
		System.out.println("Duplicate character in a string: ");
		int count = 0;
		char[] ch = str.toCharArray();
		Set<Character> cSet = new LinkedHashSet<>();
		for (char c : ch) {
			if (cSet.add(c) == false) {
				count++;
				System.out.println(c);
			}

		}
		if (count == 0) {
			System.out.println("No duplicate element in a string!!");
		}

	}

	public static void m12(String str) {
		Set<Character> cSet = new LinkedHashSet<>();
		System.out.println("String after removing duplicate character:: ");
		char[] ch = str.toCharArray();
		for (char c : ch) {
			cSet.add(c);
		}
		Iterator<Character> itr = cSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public static void m13(String str) {
		int count = 0;
		char[] ch = str.toCharArray();
		Map<Character, Integer> cMap = new LinkedHashMap<>();
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
		System.out.println("\nOccurence of character in a string :: " + cMap);
	}

	public static void m14(String str) {
		System.out.println("Only String :: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Numbers:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only special characters:: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	public static void m15(String[] str) {
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
		System.out.println("String array sorted in acscending order:: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void m16(String[] str) {
		int count = 0;
		Set<String> sSet = new HashSet<>();
		System.out.println("Duplicate element in string array:: ");
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate");
		}
	}

	public static void m17(String[] str) {
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
		System.out.println("Occurence of elements in a String:: " + sMap);
	}

	public static void m18(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<>();
		List<String> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new LinkedHashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new LinkedHashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);
		System.out.println("Unique element between two array:: ");
		for (String s : s1) {
			System.out.println(s);
		}
	}

	public static void m19(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hey, this is my 14th file to write from code!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void m20(String readfile) {
		try {
			FileReader fr = new FileReader(new File("E:\\" + readfile + ".txt"));
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

	public static void m21(String[] str) {
		Set<String> sSet = new LinkedHashSet<>();
		int count = 0;
		System.out.println("Is there any duplicate element?:: ");
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
			sSet.add(s);
		}
		if (count == 0) {
			System.out.println("No Duplicate element");
		}
		System.out.println("After removing duplicate element:: ");
		sSet.forEach(ss -> System.out.println(ss));
	}

	public static void main(String[] args) {
		String str1 = "eclipse";
		String str2 = "this is the eclipse editor";
		String str3 = "this is the eclipse editor in my this machine";
		String perm = "oyo";
		String ana1 = "read";
		String ana2 = "dear";
		String random = "RA123&*&*&*M677676*(@#$A9650975504*(*(N A876Y98O";
		String[] arr = str2.split(" ");
		String[] arr2 = str3.split(" ");
		m1(str1);
		m2(str2);
		m3(str2);
		System.out.println("Permuatation of " + perm + " is: ");
		m4("", perm);
		m5(str2);
		m6(str2);
		m7(str2);
		m8(str1);
		m9(str1, str2);
		m10(ana1, ana2);
		m11(str1);
		m12(str1);
		m13(str1);
		m14(random);
		m15(arr);
		m16(arr);
		m17(arr);
		m18(arr, arr2);
		m19("14th");

		Practice_14 obj = new Practice_14();
		try {
			Practice_14 obj2 = (Practice_14) obj.clone();
			obj2.m20("14th");
		} catch (CloneNotSupportedException c) {
			System.out.println(c.getMessage());
		}
		m21(arr2);

	}

}
