package string_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_03 {

	public void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.println("String after reverse :: " + strReverse);
	}

	public void m2(String str) {
		String[] sSplit = str.split(" ");
		System.out.println("String split on their position :: ");
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
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("\nCount of Character in a String are :: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words in a string are :: " + count2);
	}

	public void m4(String prefix, String str) {
		if (str == null || str.isEmpty()) {
			System.out.println(prefix + "");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			m4(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}

	}

	public void m5(String str) {
		System.out.println("Only unique character in a string");
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

	public void m6(String str) {
		String finalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!finalStr.contains(String.valueOf(str.charAt(i)))) {
				finalStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Only unique character are :: " + finalStr);
	}

	public void m7(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First character in upper case :: " + str);
	}

	public void m8(String str1, String str2) {
		System.out.println("name1 before swapping :: " + str1);
		System.out.println("name2 before swapping :: " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("name1 before swapping :: " + str1);
		System.out.println("name2 before swapping :: " + str2);
	}

	public void m9(String str) {
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
		System.out.println("String sorted :: " + str);
	}

	public void m10(String str1, String str2) {
		boolean result = false;
		if (str1.length() != str2.length()) {
			System.out.println("Strings are not anagram");
		} else {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			result = Arrays.equals(ch1, ch2);
			if (result) {
				System.out.println("Strings are anagram");
			} else {
				System.out.println("Strings are not anagram");
			}
		}
	}

	public void m11(String[] str) {
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
		System.out.println("String array elements sorted :: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public void m12(String[] str) {
		int count = 0;
		System.out.println("Duplicate element in an array :: ");
		Set<String> sSet = new HashSet<>();
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate element in an array");
		}
	}

	public void m13(String[] str) {
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
		System.out.println("Occurence of string element in an array :: " + sMap);
	}

	public void m14(String[] str1, String[] str2) {

		List<String> li1 = new ArrayList<>();
		List<String> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s1.retainAll(li2);

		s1.removeAll(s2);
		System.out.println("Unique element between two array :: ");
		for (String s : s1) {
			System.out.println(s);
		}
	}

	public void m15(String writeFile) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\" + writeFile + ".txt"));
			bw.write("This is the string statement written from code");
			bw.close();
		} catch (IOException ie) {
			ie.printStackTrace();
			System.out.println(ie.getMessage());
		} finally {
			System.out.println("Written successfully!");
		}
	}

	public void m16(String readFile) {
		try {
			FileReader fr = new FileReader("E:\\" + readFile + ".txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Read Successfully!!");
		}
	}

	public static void main(String[] args) {
		String str1 = "Matrix";
		String str2 = "this is the matrix system";
		String perm = "NEW";
		String ana1 = "NAME";
		String ana2 = "MANE";
		String[] arr = { "this", "is", "the", "string", "statement" };
		String[] arr2 = { "this", "is", "the", "string", "statement", "of", "Java" };
		Practice_03 obj = new Practice_03();
		obj.m1(str1);
		obj.m2(str2);
		obj.m3(str2);
		System.out.println("Permutation :: ");
		obj.m4("", perm);
		obj.m5(str2);
		obj.m6(str2);
		obj.m7(str2);
		obj.m8(str1, str2);
		obj.m9(str1);
		obj.m10(ana1, ana2);
		obj.m11(arr);
		obj.m12(arr);
		obj.m13(arr);
		obj.m14(arr, arr2);
		obj.m15("ThirdFile");
		obj.m16("ThirdFile");
	}

}
