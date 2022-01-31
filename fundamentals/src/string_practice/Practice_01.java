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
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_01 {

	public void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.println("String after reverse :: " + strReverse);
	}

	public void m2(String str) {
		String[] sSplit = str.split(" ");
		System.out.println("String after reverse on their position :: ");
		for (int i = 0; i < sSplit.length; i++) {
			for (int j = sSplit[i].length() - 1; j >= 0; j--) {
				System.out.print(sSplit[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

	public void m3(String prefix, String str) {
		if (str == null || str.isEmpty()) {
			System.out.println(prefix + "");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			m3(prefix + str.charAt(i), str.substring(0, i) + str.substring(1 + i, str.length()));
		}
	}

	public void m4(String str) {
		int count = 1;
		int count2 = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("Count of characters :: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words :: " + count2);
	}

	public void m5(String str) {
		System.out.println("Unique or non repeated character in a string");
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

	public void m6(String str) {
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char upper = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + upper + sSplit[i].substring(1);
		}
		System.out.println("First char in uppercase : " + str);
	}

	public void m7(String str) {
		String finalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!finalStr.contains(String.valueOf(str.charAt(i)))) {
				finalStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Only unique character are :: " + finalStr);
	}

	public void m8(String str1, String str2) {
		System.out.println("name1 before swapping :: " + str1);
		System.out.println("name2 before swapping :: " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("name1 after swapping :: " + str1);
		System.out.println("name2 after swapping :: " + str2);
	}

	public void m9(String str1, String str2) {
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
				System.out.println("Strings are anagram!");
			} else {
				System.out.println("Strings are not anagram!");
			}
		}
	}

	public void m10(String[] str) {
		int count = 0;
		Set<String> strSet = new HashSet<>();
		System.out.println("duplicate element in an array :: ");
		for (String s : str) {
			if (strSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
		}
		if (count == 0) {
			System.out.println("There are no duplicates!");
		}
	}

	public void m11(String[] str) {
		int count = 0;
		Map<String, Integer> strmap = new HashMap<String, Integer>();
		for (String s : str) {
			if (strmap.containsKey(s)) {
				if (count < strmap.get(s)) {
					count = strmap.get(s) + 1;
				}
				strmap.put(s, strmap.get(s) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				strmap.put(s, 1);
			}
		}
		System.out.println("Occurence of String element in an array :: " + strmap);
	}

	public void m12(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<>();
		List<String> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Unique element between two array :: ");
		for (String s : s1) {
			System.out.println(s);
		}
	}

	public void m13(String str) {
		String stringOnly = str.replaceAll("[^a-zA-Z]", "");
		String upperOnly = str.replaceAll("[^A-Z]", "");
		int intOnly = Integer.parseInt(str.replaceAll("[^0-9]", ""));
		String specialOnly = str.replaceAll("[a-zA-Z0-9]", "");

		System.out.println("Only string :: " + stringOnly);
		System.out.println("Uppercase string :: " + upperOnly);
		System.out.println("Integer only :: " + intOnly);
		System.out.println("Special Only :: " + specialOnly);
	}

	public void m14(String fileWriter) {
		BufferedWriter bw;

		try {
			bw = new BufferedWriter(new FileWriter("E:\\" + fileWriter + ".txt"));
			bw.write("This is the string statement wrote from code!!! CHEERS!!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Wrote successfully");
		}
	}

	public void m15(String readFile) {
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
		} finally {
			System.out.println("Clean try successfully!");
		}
	}

	public void m16(String str) {
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
		System.out.println("String sorted :: " + str);
	}

	public static void main(String[] args) {
		String str1 = "String";
		String str2 = "This is the string statement";
		String[] arr = { "MAC", "WINDOWS", "HDD", "LINUX", "UBUNTU" };
		String[] arr2 = { "MAC", "WINDOWS", "HDD", "LINUX", "UBUNTU", "SDD" };
		String perm = "SEX";
		String ana1 = "rited";
		String ana2 = "tired";
		String random = "123#@!R7^&raman%AM^%A*&^N950)(*&^%$#@!4";
		Practice_01 obj = new Practice_01();
		obj.m1(str1);
		obj.m2(str2);
		System.out.println("\nPermutation :: ");
		obj.m3("", perm);
		obj.m4(str2);
		obj.m5(str2);
		obj.m6(str2);
		obj.m7(str2);
		obj.m8(str1, str2);
		obj.m9(ana1, ana2);
		obj.m10(arr);
		obj.m11(arr);
		obj.m12(arr, arr2);
		obj.m13(random);
		obj.m14("FirstFile");
		obj.m15("FirstFile");
		obj.m16(str1);
	}

}
