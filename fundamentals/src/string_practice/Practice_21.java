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

public class Practice_21 implements Cloneable {

	public void m1(String str) {
		String sreverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			sreverse = sreverse + str.charAt(i);
		}
		System.out.println("String after reverse:: " + sreverse);
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
		System.out.println("\nCount of character in a String " + count);
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words in a String " + count2);
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
			System.out.println("No Duplicate character in a String!");
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
		String strFinal = "";
		for (int i = 0; i < str.length(); i++) {
			if (!strFinal.contains(String.valueOf(str.charAt(i)))) {
				strFinal += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Unique and one time repeated character only:: " + strFinal);
	}

	public void m7(String str) {
		int count = 0;
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		System.out.println("Duplicate character in a String using Set:: ");
		for (char c : ch) {
			if (cSet.add(c) == false) {
				System.out.println(c);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There is no duplicate character in a STring!!");
		}
	}

	public void m8(String prefix, String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("" + prefix);
		}
		for (int i = 0; i < str.length(); i++) {
			m8(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
		}
	}

	public void m9(String str) {
		char temp = 0;
		char[] ch = str.toCharArray();
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
		System.out.println("Sorted String:: " + str);
	}

	public void m10(String str) {
		char[] ch = str.toCharArray();
		Map<Character, Integer> cMap = new LinkedHashMap<Character, Integer>();
		int count = 1;
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
		System.out.println("Occurence of character in count:: " + cMap);
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

	public void m12(String str1, String str2) {
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
				System.out.println("Strings are anagram");
			} else {
				System.out.println("Strings are not anagram!!");
			}

		}
	}

	public void m13(String str) {
		String Palindrome = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			Palindrome = Palindrome + str.charAt(i);
		}
		if (Palindrome.equalsIgnoreCase(str)) {
			System.out.println(str + " is a Palindrome String");
		} else {
			System.out.println(str + " is not a Palindrome String");
		}

	}

	public void m14(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First letter in upper case:: " + str);
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
			System.out.println("Sorry, No duplicate in String array!");
		}
	}

	public void m16(String[] str) {
		System.out.println("Duplicate element using Set:: ");
		int count = 0;
		Set<String> sSet = new HashSet<>();
		for (String s : str) {
			if (sSet.add(s) == false) {
				System.out.println(s);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Sorry, No duplicate in String array!");
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
			System.out.println("Sorry, No duplicate in String array!");
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
		for (String s : str) {
			System.out.println(s);
		}
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
		System.out.println("Only Unique element between two array:: ");
		for (String s : s1) {
			System.out.println(s);
		}
	}

	public void m20(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is the twentyone file which is written by code!!");
			bw.close();
			fw.close();
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

	public static void main(String[] args) {
		String str1 = "serials";
		String str2 = "this is the string statement";
		String str3 = "this is the string statement of the java and the editor is eclipse";
		String perm = "YES";
		String ana1 = "santa";
		String ana2 = "satan";
		String pali = "madam";
		String[] arr = str2.split(" ");
		String[] arr2 = str3.split(" ");
		Practice_21 obj1 = new Practice_21();
		try {
			Practice_21 obj2 = (Practice_21) obj1.clone();
			obj2.m1(str1);
			obj2.m2(str2);
			obj2.m3(str2);
			obj2.m4(str1);
			obj2.m5(str2);
			obj2.m6(str2);
			obj2.m7(str2);
			System.out.println("Permutation of " + perm + " is: ");
			obj2.m8("", perm);
			obj2.m9(str1);
			obj2.m10(str2);
			obj2.m11(str1, str2);
			obj2.m12(ana1, ana2);
			obj2.m13(pali);
			obj2.m14(str2);
			obj2.m15(arr2);
			obj2.m16(arr2);
			obj2.m17(arr2);
			obj2.m18(arr);
			obj2.m19(arr, arr2);
			obj2.m20("TwentyOne");
			obj2.m21("TwentyOne");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
