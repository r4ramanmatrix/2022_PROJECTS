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
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_20 implements Cloneable {

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
		System.out.println("\nCounting of character in a String:: " + count);
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Counting of wrods in a String:: " + count2);
	}

	public void m4(String str) {
		System.out.println("Counting duplicate character in a String:: ");
		if (str == null || str.isEmpty() || str.length() <= 1) {
			System.out.println("String have not any duplicate!!");
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
			Set<Map.Entry<Character, Integer>> entSet = cMap.entrySet();
			for (Map.Entry<Character, Integer> entMap : entSet) {
				if (entMap.getValue() > 1) {
					System.out.println(entMap.getKey() + "=" + entMap.getValue());
				}
			}
		}

	}

	public void m5(String str) {
		System.out.println("Only Unique and non repeated character:: ");
		for (int i = 0; i < str.length(); i++) {
			boolean isUnqiue = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					isUnqiue = false;
					break;
				}
			}
			if (isUnqiue) {
				System.out.println(str.charAt(i));
			}
		}
	}

	public void m6(String str) {

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
			System.out.println("" + prefix);
		}
		for (int i = 0; i < str.length(); i++) {
			m7(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}
	}

	public void m8(String str) {
		str = str.replace(" ", "");
		Set<Character> cSet = new HashSet<>();
		System.out.println("Duplicate character in a String using Set:");
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (cSet.add(c) == false) {
				System.out.println(c);
			}

		}

	}

	public void m9(String str) {
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
		System.out.println("String sorted:: " + str);
	}

	public void m10(String str) {
		Map<Character, Integer> cMap = new LinkedHashMap<>();
		char[] ch = str.toCharArray();
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
		System.out.println("Occurence of character in a String:: \n" + cMap);
	}

	public void m11(String str) {
		String pali = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			pali = pali + str.charAt(i);
		}
		if (pali.equalsIgnoreCase(str)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not a Palindrome String");
		}
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
		boolean result = false;
		if (str1.length() != str2.length()) {
			System.out.println("Strings are not anagram!");
		} else {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			result = Arrays.equals(ch1, ch2);
			if (result) {
				System.out.println("String are anagram!!");
			} else {
				System.out.println("Strings are not anagram!");
			}
		}
	}

	public void m14(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First letter in uppercase:: " + str);
	}

	public void m15(String[] str) {
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
		System.out.println("String array elements after sorted:: ");
		for (String s : str) {
			System.out.println(s);
		}
	}

	public void m16(String[] str) {
		System.out.println("Getting duplicate element using Map");
		if (str == null || str.length <= 1) {
			System.out.println("String array doesn't have duplicate!!");
			return;
		} else {
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
					count++;
					System.out.println(entMap.getKey() + "=" + entMap.getValue());

				}
			}
			if (count == 0) {
				System.out.println("No duplicate element present in String array!!");
			}
		}

		System.out.println("Getting duplicate element using brute force: ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					System.out.println(str[i]);
				}
			}
		}

		System.out.println("Getting duplicate element using Set: ");
		Set<String> strSet = new HashSet<>();
		int count2 = 0;
		for (String s : str) {
			if (strSet.add(s) == false) {
				System.out.println(s);
				count2++;
			}
		}
		if (count2 == 0) {
			System.out.println("No Duplicate element");
		}
	}

	public void m17(String[] str1, String[] str2) {
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();

		l1.addAll(Arrays.asList(str1));
		l2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(l1);
		s1.addAll(l2);

		Set<String> s2 = new HashSet<>(l1);
		s2.retainAll(l2);

		s1.removeAll(s2);
		System.out.println("Unique element between two array:: ");
		for (String s : s1) {
			System.out.println(s);
		}

	}

	public void m18(String writeFile) {
		try {
			FileWriter FW = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(FW);
			bw.write("This is the 20th file i'm writting from java code!!");
			bw.close();
			FW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void m19(String readFile) {
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
		String str1 = "practice";
		String str2 = "this is the java coding practice in java";
		String str3 = "this is the java coding practice session";
		String perm = "DEL";
		String pali = "naman";
		String ana1 = "rail";
		String ana2 = "liar";
		String[] arr = str2.split(" ");
		String[] arr2 = str3.split(" ");
		Practice_20 obj1 = new Practice_20();

		try {
			Practice_20 obj2 = (Practice_20) obj1.clone();
			obj2.m1(str1);
			obj2.m2(str2);
			obj2.m3(str2);
			obj2.m4(str2);
			obj2.m5(str2);
			obj2.m6(str2);
			System.out.println("Permutation of " + perm + " is: ");
			obj2.m7("", perm);
			obj2.m8(str2);
			obj2.m9(str1);
			obj2.m10(str2);
			obj2.m11(pali);
			obj2.m12(str1, str2);
			obj2.m13(ana1, ana2);
			obj2.m14(str2);
			obj2.m15(arr);
			obj2.m16(arr);
			obj2.m17(arr, arr2);
			obj2.m18("twentieth");
			obj2.m19("twentieth");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
