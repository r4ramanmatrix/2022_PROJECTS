package string_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_18 implements Cloneable {

	public static void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}

		System.out.println("String reverse:: " + strReverse);
	}

	public static void m2(String str) {
		System.out.println("String reverse on their position");
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
		int count_2 = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("\nCount of character in a String:: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) == ' ')) {
				count_2++;
			}
		}
		System.out.println("Count of Words in a String statement:: " + count_2);
	}

	public static void m4(String str) {
		System.out.println("Only unique character in a String statement:: ");
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
		String strFinal = "";
		for (int i = 0; i < str.length(); i++) {
			if (!strFinal.contains(String.valueOf(str.charAt(i)))) {
				strFinal += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Only one time repeated and unique character:: " + strFinal);
	}

	public static void m6(String prefix, String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("" + prefix);
		}
		for (int i = 0; i < str.length(); i++) {
			m6(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}
	}

	public static void m7(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First character in uppercase:: " + str);
	}

	public static void m8(String str) {
		char[] ch = str.toLowerCase().toCharArray();
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

	public static void m9(String str) {
		System.out.println("String after removing duplicates:: ");
		char[] ch = str.toCharArray();
		Set<Character> cSet = new LinkedHashSet<>();
		for (char c : ch) {
			cSet.add(c);
		}
		Iterator<Character> itr = cSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

	public static void m10(String str) {
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		System.out.println("Duplicate character in a String:: ");
		for (char c : ch) {
			if (cSet.add(c) == false) {
				System.out.print(c);
			}
		}
	}

	public static void m11(String str) {
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
		System.out.println("Occurence of character in a string:: " + cMap);
	}

	public static void m12(String str1, String str2) {
		System.out.println("String1 before swap is:: " + str1);
		System.out.println("String2 before swap is:: " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("String1 after swap is:: " + str1);
		System.out.println("String2 after swap is:: " + str2);
	}

	public static void m13(String s1, String s2) {
		boolean result = false;
		if (s1.length() != s2.length()) {
			System.out.println("String " + s1 + " and " + s2 + " are not anagram!");
		} else {
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s1.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);
			result = Arrays.equals(ch1, ch2);
			if (result) {
				System.out.println("String " + s1 + " and " + s2 + " are anagram!");
			} else {
				System.out.println("String " + s1 + " and " + s2 + " are not anagram!");
			}

		}
	}

	public static void m14(String str) {
		String pali = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			pali = pali + str.charAt(i);
		}
		if (pali.equalsIgnoreCase(str)) {
			System.out.println(str + " is a Palindrome String!!");
		} else {
			System.out.println(str + " is not a Palindrome String!!");
		}
	}

	public static void m15(String str) {
		System.out.println("String only :: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Numbers only:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only special characters:: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	public static void m16(String[] str) {
		String temp = null;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length - 1; j++) {
				if (str[j].compareTo(str[j + 1]) >= 0) {
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted String array elements:: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void m17(String[] str) {
		int count = 0;
		Set<String> sSet = new HashSet<>();
		System.out.println("Duplicate element in String:: ");
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate element in String array!!");
		}
	}

	public static void m18(String[] str) {

		Set<String> sSet = new LinkedHashSet<>();
		int count = 0;
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
			}
		}
		Iterator<String> itr = sSet.iterator();
		if (count > 0) {
			System.out.println("String array after removing duplicate elements:: ");
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} else {
			System.out.println("String array not having duplicate elements:: ");
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}

	public static void m19(String[] str) {
		int count = 0;
		Map<String, Integer> sMap = new LinkedHashMap<>();
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
		System.out.println("Occurence of string elements:: " + sMap);
	}

	public static void m20(String[] str1, String[] str2) {
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

	public static void m21(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hey, This is the 18th file i'm writing through the code!!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void m22(String readFile) {
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
		String str1 = "himalaya";
		String str2 = "this is the practice session";
		String str3 = "this is the practice session of the java";
		String perm = "SON";
		String palin = "madam";
		String ana1 = "read";
		String ana2 = "dear";
		String random = "RA123&*&*&*M677676*(@#$A9650975504*(*(N A876Y98O";
		String[] arr = str2.split(" ");
		String[] arr2 = str3.split(" ");
		m1(str1);
		m2(str2);
		m3(str2);
		m4(str2);
		m5(str2);
		System.out.println("Permutation of " + perm + " is:: ");
		m6("", perm);
		m7(str2);
		m8(str1);
		m9(str1);
		m10(str1);
		m11(str2);
		m12(str1, str2);
		m13(ana1, ana2);
		m14(palin);
		m15(random);
		m16(arr);
		m17(arr);
		m18(arr);
		m19(arr);
		m20(arr, arr2);
		m21("eighteenth");
		Practice_18 obj1 = new Practice_18();
		try {
			Practice_18 obj2 = (Practice_18) obj1.clone();
			obj2.m22("eighteenth");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
