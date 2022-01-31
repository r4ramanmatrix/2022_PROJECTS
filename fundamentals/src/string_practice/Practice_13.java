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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Practice_13 {

	public static void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.println("String after reverse:: " + strReverse);
	}

	public static void m2(String str) {
		String[] sSplit = str.split(" ");
		System.out.println("String statement reverse:: ");
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
		System.out.println("Characters in a String are:: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Words in a string statement:: " + count2);
	}

	public static void m4(String str) {
		System.out.println("Non repeated number in a string:: ");
		for (int i = 0; i < str.length(); i++) {
			boolean isUnique = true;
			for (int j = 0; j < str.length() - 1; j++) {
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

	public static void m5(String prefix, String str) {
		if (str.isEmpty() || str == null) {
			System.out.println(prefix + " ");
		}
		for (int i = 0; i < str.length(); i++) {
			m5(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
		}
	}

	public static void m6(String str) {
		System.out.println("Unique and only once time character:: ");
		String finalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!finalStr.contains(String.valueOf(str.charAt(i)))) {
				finalStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println(finalStr);
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

	public static void m8(String str1, String str2) {
		System.out.println("Before swapping str1:: " + str1);
		System.out.println("Before swapping str2:: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("After swapping str1:: " + str1);
		System.out.println("After swapping str2:: " + str2);
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
		System.out.println("String sorted:: " + str);
	}

	public static void m10(String str1, String str2) {
		boolean result = false;
		if (str1.length() != str2.length()) {
			System.out.println("STrings are not anagram!!");
		} else {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			result = Arrays.equals(ch1, ch2);
			if (result) {
				System.out.println("Strings are anagram");
			} else {
				System.out.println("Strings are not anagram!!");
			}
		}
	}

	public static void m11(String str) {
		int count = 0;
		System.out.println("Duplicate character in a string:: ");
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		for (char ch1 : ch) {
			if (cSet.add(ch1) == false) {
				count++;
				System.out.println(ch1);
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate character in a string!!");
		}
	}

	public static void m12(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		Map<Character, Integer> cMap = new HashMap<>();
		for (char ch1 : ch) {
			if (cMap.containsKey(ch1)) {
				if (count < cMap.get(ch1)) {
					count = cMap.get(ch1) + 1;
				}
				cMap.put(ch1, cMap.get(ch1) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				cMap.put(ch1, 1);
			}
		}
		System.out.println("Occurence of character in a string ::\n" + cMap);
	}

	public static void m13(String[] str) {
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
		System.out.println("String sorted:: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void m14(String[] str) {
		int count = 0;
		Set<String> sSet = new HashSet<>();
		System.out.println("Duplicate element in an array: ");
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element");
		}
	}

	public static void m15(String[] str) {
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
		System.out.println("Occurence of element in an array:: \n" + sMap);
	}

	public static void m16(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();

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

	public static void m17(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("this is the 13th file i'm writting from code, Thanks for reading!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void m18(String readfile) {
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

	public static void m19(String str) {
		System.out.println("Only numbers:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only Strings:: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Special characters:: " + str.replaceAll("[0-9a-zA-Z]", ""));
	}

	public static void m20(String str) {
		System.out.println("Removing duplicate from a string statement:: ");
		String[] sSplit = str.split(" ");
		Set<String> sSet = new LinkedHashSet<>();
		for (String s : sSplit) {
			sSet.add(s);
		}
		Iterator<String> itr = sSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		// System.out.println("Only Unique :: " + sSet);
	}

	public static void m21(String str) {
		System.out.println("Is string well formed or not? :: ");
		Stack<Character> sStack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (sStack.isEmpty()) {
				sStack.push(ch);
			} else if (ch == '{' || ch == '[' || ch == '(') {
				sStack.push(ch);
			} else if (ch == '}' && sStack.peek() == '{') {
				sStack.pop();
			} else if (ch == ']' && sStack.peek() == '[') {
				sStack.pop();
			} else if (ch == ')' && sStack.peek() == '(') {
				sStack.pop();
			}
		}
		if (sStack.isEmpty()) {
			System.out.println("String is well formed");
		} else {
			System.out.println("Given String is not well formed!!");
		}
	}

	public static void main(String[] args) {
		String str1 = "update";
		String str2 = "mindset updated";
		String perm = "ONE";
		String str3 = "MINDSET updated by me for me";
		String[] arr = str2.split(" ");
		String[] arr2 = str3.split(" ");
		String random = "RA123&*&*&*M677676*(@#$A9650975504*(*(N";
		String formed = "[{{}]";
		m1(str1);
		m2(str2);
		m3(str2);
		m4(str2);
		System.out.println("Permuatation of : " + perm);
		m5("", perm);
		m6(str2);
		m7(str2);
		m8(str1, str2);
		m9(str1);
		m10(str3, str2);
		m11(str2);
		m12(str1);
		m13(arr);
		m14(arr2);
		m15(arr2);
		m16(arr, arr2);
		m17("13th");
		m18("13th");
		m19(random);
		m20(str3);
		m21(formed);
	}

}
