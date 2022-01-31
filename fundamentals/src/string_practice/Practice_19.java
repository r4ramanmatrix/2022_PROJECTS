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
import java.util.stream.Stream;

import classesAndobjects.Finals;

public class Practice_19 implements Cloneable {

	public static void m1(String str) {

		String revString = "";
		for (int i = 0; i < str.length(); i++) {
			revString = revString + str.charAt(i);
		}
		System.out.println("String after reverse:: " + revString);
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
		System.out.println("\nCount duplicate character in a String:: ");
		if (str == null || str.isEmpty() || str.length() <= 1) {
			System.out.println("VOID");
			return;
		} else {
			char[] ch = str.toCharArray();
			Map<Character, Integer> cMap = new HashMap<Character, Integer>();
			for (char c : ch) {
				if (cMap.containsKey(c)) {
					cMap.put(c, cMap.get(c) + 1);
				} else {
					cMap.put(c, 1);
				}
			}
			Set<Map.Entry<Character, Integer>> eSet = cMap.entrySet();
			for (Map.Entry<Character, Integer> e : eSet) {
				if (e.getValue() > 1) {
					System.out.println(e.getKey() + "=" + e.getValue());
				}
			}
		}
	}

	public static void m4(String str) {
		int count = 1;
		int count2 = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("Count of character in a String:: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words in a string:: " + count2);
	}

	public static void m5(String str) {
		System.out.println("Only unqiue and non repeated character in a String:: ");
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

	public static void m6(String str) {
		String strFinal = "";
		for (int i = 0; i < str.length(); i++) {
			if (!strFinal.contains(String.valueOf(str.charAt(i)))) {
				strFinal += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Unique and only one time repeated character:: " + strFinal);
	}

	public void m7(String prefix, String str) {
		if (str == null || str.isEmpty()) {
			System.out.println(prefix + " ");
		}
		for (int i = 0; i < str.length(); i++) {
			m7(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}
	}

	public void m8(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First letter in uppercase:: " + str);
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
		System.out.println("Duplicate character in a String:: ");
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		for (char c : ch) {
			if (cSet.add(c) == false) {
				System.out.println(c);
			}
		}
	}

	public void m11(String str) {
		System.out.println("Count of duplicate character in a String:: ");
		char[] ch = str.toCharArray();
		Map<Character, Integer> cMap = new HashMap<>();
		for (char c : ch) {
			if (cMap.containsKey(c)) {
				cMap.put(c, cMap.get(c) + 1);
			} else {
				cMap.put(c, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> entSet = cMap.entrySet();
		for (Map.Entry<Character, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
			}
		}

	}

	public void m12(String str) {
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
		System.out.println("Occurence of characetr in a String:: \n" + cMap);
	}

	public void m13(String str1, String str2) {
		System.out.println("String1 before swap:: " + str1);
		System.out.println("String2 before swap:: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String1 after swap:: " + str1);
		System.out.println("String2 after swap:: " + str2);
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
				System.out.println("Strings are anagram!!");
			} else {
				System.out.println("Strings are not anagram!");
			}
		}
	}

	public void m15(String str) {
		String pali = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			pali = pali + str.charAt(i);
		}
		if (pali.equalsIgnoreCase(str)) {
			System.out.println(str + " is a Palindrome String");
		} else {
			System.out.println(str + " is not a Palindrome String");
		}
	}

	public void m16(String[] str) {
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
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void m17(String[] str) {

		System.out.println("By Using brute force:: ");
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					System.out.println(str[i]);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No any duplicate element in String");
		}

		System.out.println("By Using HashSet:: ");
		Set<String> sSet = new HashSet<>();
		int count2 = 0;
		for (String s : str) {
			if (sSet.add(s) == false) {
				System.out.println(s);
				count2++;
			}
		}
		if (count2 == 0) {
			System.out.println("No any duplicate element");
		}

		System.out.println("By Using HashMap:: ");
		Map<String, Integer> sMap = new HashMap<>();
		for (String s : str) {
			if (sMap.containsKey(s)) {
				sMap.put(s, sMap.get(s) + 1);
			} else {
				sMap.put(s, 1);
			}
		}
		Set<Map.Entry<String, Integer>> strSet = sMap.entrySet();
		int count3 = 0;
		for (Map.Entry<String, Integer> siMap : strSet) {
			if (siMap.getValue() > 1) {
				System.out.println(siMap.getKey() + "=" + siMap.getValue());
				count3++;
			}
		}
		if (count3 == 0) {
			System.out.println("No Duplicate element");
		}
	}

	public static void m18(String[] str) {
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
		System.out.println("Occurence of String element in array:: " + sMap);
	}

	public void m19(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();

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

	public static void m20(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hey, This is the nineteenth file i'm writing through code!!");
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void m21(String readFile) {
		try {
			FileReader fr = new FileReader(new File("E:\\" + readFile + ".txt"));
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String str1 = "java is the wording";
		String str2 = "this is the string statement";
		String str3 = "this is the string statement in java";
		String perm = "OXY";
		String ana1 = "java";
		String ana2 = "avaj";
		String pali = "rubbur";
		String[] arr = str2.split(" ");
		String[] arr2 = str3.split(" ");
		m1(str1);
		m2(str2);
		m3(str1);
		m4(str2);
		m5(str2);
		m6(str2);
		System.out.println("Permutation of: " + perm + " is: ");
		Practice_19 obj1 = new Practice_19();
		try {
			Practice_19 obj2 = (Practice_19) obj1.clone();
			obj2.m7("", perm);
			obj2.m8(str2);
			obj2.m9(str1);
			obj2.m10(str1);
			obj2.m11(str1);
			obj2.m12(str2);
			obj2.m13(str1, str2);
			obj2.m15(pali);
			obj2.m16(arr);
			obj2.m19(arr, arr2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		m14(ana1, ana2);
		m17(arr);
		m18(arr);
		m20("nineteenth");
		m21("nineteenth");
	}

}
