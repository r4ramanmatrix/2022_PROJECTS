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
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_16 implements Cloneable {

	public static void m1(String str) {
		String sReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			sReverse = sReverse + str.charAt(i);
		}
		System.out.println("String after reverse:: " + sReverse);
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
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) != '\t')) {
				count++;
			}
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("\nChracter count in a String:: " + count);
		System.out.println("Words count in a String:: " + count2);
	}

	public static void m4(String str) {
		System.out.println("Only unique characters in a string :: ");
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

	public static void m5(String str) {
		System.out.println("Only unqiue and repeated character in a string:: ");
		String strFinal = "";
		for (int i = 0; i < str.length(); i++) {
			if (!strFinal.contains(String.valueOf(str.charAt(i)))) {
				strFinal += String.valueOf(str.charAt(i));
			}
		}
		System.out.println(strFinal);
	}

	public static void m6(String prefix, String str) {
		if (str.isEmpty() || str == null) {
			System.out.println(prefix + " ");
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
		System.out.println("First character in upper case:: " + str);
	}

	public static void m8(String str) {
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
		System.out.println("Sorted string :: " + str);
	}

	public static void m9(String str1, String str2) {
		System.out.println("String1 before swap:: " + str1);
		System.out.println("String2 before swap:: " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String1 after swap:: " + str1);
		System.out.println("String2 after swap:: " + str2);
	}

	public static void m10(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		System.out.println("Duplicate character in a string ::");
		Set<Character> sSet = new HashSet<Character>();
		for (char c : ch) {
			if (sSet.add(c) == false) {
				count++;
				System.out.println(c);
			}
		}
		if (count == 0) {
			System.out.println("No duplicate characetr");
		}
	}

	public static void m11(String str) {
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<Character>();
		for (char c : ch) {
			cSet.add(c);
		}
		Iterator<Character> itr = cSet.iterator();
		System.out.println("String after remove duplicate:: ");
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}

	public static void m12(String str) {
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
		System.out.println("\nOccurence of character in a String :: " + cMap);
	}

	public static void m13(String str) {
		System.out.println("Only String from Rumble jumble :: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only numbers from Rumble jumble :: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only special character from rumble jumble:: " + str.replaceAll("[0-9a-zA-Z]", ""));
	}

	public static void m14(String str1, String str2) {
		boolean result = false;
		if (str1.length() != str2.length()) {
			System.out.println("Strings are not anagram!!");
		} else {
			char[] ch1 = str1.toUpperCase().toCharArray();
			char[] ch2 = str2.toUpperCase().toCharArray();

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

	public static void m15(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		if (str.equalsIgnoreCase(temp)) {
			System.out.println("String is palindrome!!");
		} else {
			System.out.println("String is not Palindrome!!");
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
		System.out.println("Sorted String array elements:: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void m17(String[] str) {
		int count = 0;
		Set<String> sSet = new HashSet<>();
		System.out.println("Duplicate lement in a String array:: ");
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element in String array!!");
		}
	}

	public void m18(String[] str) {
		int count = 0;
		Set<String> sSet = new HashSet<>();
		System.out.println("After removing duplicate elements from string array:: ");
		for (String s : str) {
			sSet.add(s);
			count++;
		}
		Iterator<String> itr = sSet.iterator();
		if (count == 0) {
			System.out.println("No Duplicate element in string array");
		} else {
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
		System.out.println("Occurence of array elements:: " + sMap);

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

		System.out.println("Only Unique element between the two array:: ");
		for (String s : s1) {
			System.out.println(s);
		}
	}

	public static void m21(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hey, this is the 16th file we are writting from code!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void m22(String readFile) {
		try {
			FileReader fr = new FileReader(new File("E:" + readFile + ".txt"));
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
		String str1 = "selenium";
		String str2 = "java selenium session";
		String str3 = "java selenium session running";
		String perm = "HUL";
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
		System.out.println("Permutation of :: " + perm);
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

		Practice_16 obj1 = new Practice_16();
		try {
			Practice_16 obj2 = (Practice_16) obj1.clone();
			obj2.m18(arr);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m19(arr);
		m20(arr, arr2);
		m21("twenty1");
		m22("twenty1");
		String str = "ramana7865423-Raman@911-jhgvfs";
		String[] sSplit = str.split("-");
		String s = sSplit[sSplit.length - 2];
		System.out.println(s);

		int[] iarr = { 1, 2, 5, 6, 7, 9 };

		int li = 0;
		int hi = iarr.length - 1;
		int mi = (li + hi) / 2;
		int search_number = 9;
		while (li <= hi) {
			if (iarr[mi] == search_number) {
				System.out.println(search_number + " is at " + mi + " index position!!");
				break;
			} else if (iarr[mi] < search_number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(search_number + " is not present in the array!!");
		}

	}

}
