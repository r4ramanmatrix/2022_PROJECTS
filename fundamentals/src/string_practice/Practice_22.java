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

public class Practice_22 implements Cloneable {

	public void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}

		System.out.println("String after reverse:: " + strReverse);
	}

	public void m2(String str) {
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
		System.out.println("\nCount of character in a String statement:: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words in a string stetement: " + count2);
	}

	public void m4(String str) {
		System.out.println("Counting duplicate character in a String");
		char[] ch = str.toCharArray();
		int count = 0;
		Map<Character, Integer> cMap = new HashMap<>();
		if (str == null || str.isEmpty() || str.length() == 1) {
			System.out.println("VOID");
		} else {
			for (char c : ch) {
				if (cMap.containsKey(c)) {
					cMap.put(c, cMap.get(c) + 1);
				} else {
					cMap.put(c, 1);
				}
			}
		}

		Set<Map.Entry<Character, Integer>> entSet = cMap.entrySet();

		for (Map.Entry<Character, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element");
		}

	}

	public void m5(String str) {
		System.out.println("Only unqiue and non repeated character in a String:: ");
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

		String finalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!finalStr.contains(String.valueOf(str.charAt(i)))) {
				finalStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Unique and one time repeated character only:: " + finalStr);
	}

	public void m7(String str) {
		System.out.println("Duplicate character in a String using Set:: ");
		int count = 0;
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		if (ch == null || ch.length == 1) {
			System.out.println("Void");
		} else {
			for (char c : ch) {
				if (cSet.add(c) == false) {
					System.out.print(c + " ");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate element!");
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
		System.out.println("Occurence of character in count:: ");
		char[] ch = str.toCharArray();
		int count = 0;
		Map<Character, Integer> cMap = new LinkedHashMap<Character, Integer>();
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
		System.out.println(cMap);
	}

	public void m11(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First letter in upper case:: " + str);
	}

	public void m12(String str1, String str2) {
		System.out.println("String1 before swapping:: " + str1);
		System.out.println("String2 before swapping:: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String1 after swapping:: " + str1);
		System.out.println("String2 after swapping:: " + str2);
	}

	public void m13(String str1, String str2) {
		boolean isResult = false;
		if (str1.length() != str2.length()) {
			System.out.println("STring are not anagram!!");
		} else {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			isResult = Arrays.equals(ch1, ch2);

			if (isResult) {
				System.out.println("String are anagram!!");
			} else {
				System.out.println("String are not anagram!!");
			}
		}
	}

	public void m14(String str) {
		String pali = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			pali = pali + str.charAt(i);
		}
		if (pali.equalsIgnoreCase(str)) {
			System.out.println(pali + " is a Palindrome string");
		} else {
			System.out.println(pali + " is not a Palindrome string");
		}
	}

	public void m15(String[] str) {
		System.out.println("Finding duplicate element using brute force:: ");
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
			System.out.println("No duplicate element");
		}
	}

	public void m16(String[] str) {
		System.out.println("Duplicate element using Set:: ");
		Set<String> sSet = new HashSet<>();
		int count = 0;
		for (String s : str) {
			if (sSet.add(s) == false) {
				System.out.println(s);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element");
		}
	}

	public void m17(String[] str) {
		System.out.println("Duplicate element using Map:: ");
		int count = 0;
		Map<String, Integer> sMap = new HashMap<>();
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
			System.out.println("No duplicate element");
		}
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
		System.out.println("Sorted String array elements:: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public void m19(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<>();
		List<String> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Unique element between two array:: ");
		for (String s : s1) {
			System.out.println(s);
		}

	}

	public void m20(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("this is the twentytwo file i'm writting from the code!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void m21(String readFile) {
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

	String n;

	public static void main(String[] args) {
		String str1 = "practice_22";
		String str2 = "this is the 22nd practice session in the java";
		String str3 = "this is the 22nd practice session in the java using eclipse";
		String perm = "ONO";
		String ana1 = "santa";
		String ana2 = "satan";
		String pali = "madam";
		String[] arr = str2.split(" ");
		String[] arr2 = str3.split(" ");
		Practice_22 obj1 = new Practice_22();
		System.out.println(obj1.n);
		try {
			Practice_22 obj2 = (Practice_22) obj1.clone();
			obj2.m1(str1);
			obj2.m2(str2);
			obj2.m3(str2);
			obj2.m4(str1);
			obj2.m5(str2);
			obj2.m6(str2);
			obj2.m7(str2);
			System.out.println("\nPermuatation of " + perm + " is: ");
			obj2.m8("", perm);
			obj2.m9(str1);
			obj2.m10(str2);
			obj2.m11(str2);
			obj2.m12(str1, str2);
			obj2.m13(ana1, ana2);
			obj2.m14(pali);
			obj2.m15(arr2);
			obj2.m16(arr);
			obj2.m17(arr);
			obj2.m18(arr);
			obj2.m19(arr, arr2);
			obj2.m20("twentytwo");
			obj2.m21("twentytwo");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
