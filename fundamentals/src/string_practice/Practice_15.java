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

public class Practice_15 {

	public static void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.println("String after reverse:: " + strReverse);
	}

	public static void m2(String str) {
		String[] sSplit = str.split(" ");
		System.out.println("String reverse on their position:: ");
		for (int i = 0; i < sSplit.length; i++) {
			for (int j = sSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(sSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public static void m3(String str) {
		System.out.println("\nOnly unique character in a string:: ");
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

	public static void m4(String str) {
		int count = 1;
		int count2 = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) != '\t')) {
				count++;
			}
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of character in a String:: " + count);
		System.out.println("Count of words in a String:: " + count2);
	}

	public static void m5(String str) {
		String finalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!finalStr.contains(String.valueOf(str.charAt(i)))) {
				finalStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Only unique and one time repeated character in a string :: " + finalStr);
	}

	public static void m6(String prefix, String str) {
		if (str.isEmpty() || str == null) {
			System.out.println(prefix + "");
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
		System.out.println("First letter in uppercase:: " + str);
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
		System.out.println("String after sorted:: " + str);
	}

	public static void m9(String str1, String str2) {
		System.out.println("String1 before swapping:: " + str1);
		System.out.println("String2 before swapping:: " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String1 after swapping:: " + str1);
		System.out.println("String2 after swapping:: " + str2);
	}

	public static void m10(String str) {
		int count = 0;
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		System.out.println("Duplicate character in a string:: ");
		for (char c : ch) {
			if (cSet.add(c) == false) {
				count++;
				System.out.println(c);
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate character!!");
		}
	}

	public static void m11(String str) {
		char[] ch = str.toCharArray();
		Set<Character> cSet = new LinkedHashSet<>();
		for (char c : ch) {
			cSet.add(c);
		}
		System.out.println("After removed duplicate character from a string:: ");
		Iterator<Character> itr = cSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

	public static void m12(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
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
		System.out.println("\nOccurence of character in astring :: " + cMap);
	}

	public static void m13(String str) {
		System.out.println("Only Character:: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only numbers:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only special characters:: " + str.replaceAll("[0-9a-zA-Z]", ""));
	}

	public static void m14(String str1, String str2) {
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
				System.out.println("Strings are anagram!");
			} else {
				System.out.println("Strings are not anagram!!");
			}
		}
	}

	public static void m15(String str) {
		String p = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			p = p + str.charAt(i);
		}
		if (str.equalsIgnoreCase(p)) {
			System.out.println(str + " String is palindrome");
		} else {
			System.out.println(str + " String is not palindrome");
		}
	}

	public static void m16(String[] str) {
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

	public static void m17(String[] str) {
		int count = 0;
		Set<String> sSet = new HashSet<>();
		System.out.println("Duplicate element in an array:: ");
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

	public static void m18(String[] str) {
		Set<String> sSet = new LinkedHashSet<>();
		for (String s : str) {
			sSet.add(s);
		}
		Iterator<String> itr = sSet.iterator();
		System.out.println("After removed duplicate element:: ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
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
		System.out.println("Occurence of array elements in an String array :: \n" + sMap);
	}

	public static void m20(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<>();
		List<String> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s1.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Unique element between two array:: ");
		for (String s : s1) {
			System.out.println(s);
		}

	}

	public static void m21(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hey, this is the 15th file i'm writting!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void m22(String readFile) {
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
		String str1 = "amazing";
		String str2 = "java is an an amazing language";
		String str3 = "java is an an amazing programming language";
		String perm = "FAX";
		String random = "RA123&*&*&*M677676*(@#$A9650975504*(*(N A876Y98O";
		String ana1 = "hallo";
		String ana2 = "holla";
		String pali = "malayalam";
		String[] arr = str2.split(" ");
		String[] arr2 = str3.split(" ");
		m1(str1);
		m2(str2);
		m3(str2);
		m4(str2);
		m5(str2);
		System.out.println("Permutation of " + perm + " is: ");
		m6("", perm);
		m7(str2);
		m8(str1);
		m9(str1, str2);
		m10(str1);
		m11(str1);
		m12(str1);
		m13(random);
		m14(ana1, ana2);
		m15(pali);
		m16(arr);
		m17(arr);
		m18(arr);
		m19(arr);
		m20(arr, arr2);
		m21("15th");
		m22("15th");

	}

}
