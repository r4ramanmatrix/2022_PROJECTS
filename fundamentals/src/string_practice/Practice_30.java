package string_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.temporal.IsoFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice_30 {

	public void m1(String str) {
		String stReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			stReverse = stReverse + str.charAt(i);
		}
		System.out.println("String reverse:: " + stReverse);
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
		System.out.println("\nCount of character in a String:: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words:: " + count2);
	}

	public void m4(String str) {
		System.out.println("Find Duplicate character in a String using Map: ");
		str = str.replaceAll(" ", "");
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
				System.out.println(entMap.getKey() + " = " + entMap.getValue());
			}
		}
	}

	public void m5(String str) {
		System.out.println("Find Duplicate character in a String using Set:: ");
		str = str.replaceAll(" ", "");
		char[] ch = str.toCharArray();
		Set<Character> cSet = new HashSet<>();
		for (char c : ch) {
			if (cSet.add(c) == false) {
				System.out.print(c + " ");
			}
		}
	}

	public void m6(String str) {
		System.out.println("\nOnly Unqiue and non-repeated character in a String:: ");
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

	public void m7(String str) {

		String sFinal = "";
		for (int i = 0; i < str.length(); i++) {
			if (!sFinal.contains(String.valueOf(str.charAt(i)))) {
				sFinal += String.valueOf(str.charAt(i));
			}
		}
		System.out.println("Unique and one time repeated character only:: " + sFinal);
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
		str = str.replaceAll(" ", "");
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
		System.out.println("Sorted String:: " + str);
	}

	public void m10(String str1, String str2) {
		System.out.println("String1 before swapping:: " + str1);
		System.out.println("String2 before swapping:: " + str2);

		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String1 after swapping:: " + str1);
		System.out.println("String2 after swapping:: " + str2);

	}

	public void m11(String str) {
		System.out.println("Occurence of character in a String:: ");
		str = str.replaceAll(" ", "");
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

	public void m12(String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("VOID!!");
		}
		String[] sSPlit = str.split(" ");
		str = "";
		for (int i = 0; i < sSPlit.length; i++) {
			char ch = Character.toUpperCase(sSPlit[i].charAt(0));
			str += " " + ch + sSPlit[i].substring(1);
		}
		System.out.println("First character in uppercase:: " + str.trim());

	}

	public void m13(String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("VOID!!");
		}

		final StringBuilder sb = new StringBuilder(str.length());
		for (final String word : str.split(" ")) {
			if (!word.isEmpty()) {
				sb.append(Character.toUpperCase(word.charAt(0)));
				sb.append(word.substring(1).toLowerCase());
			}
			if (!(word.length() == str.length())) {
				sb.append(" ");
			}
		}
		System.out.println("From random rumble jumble to Camel Case:: " + sb);
	}

	public void m14(String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("VOID!!");
		}
		String[] sSplit = str.split(" ");
		int index = 5;
		if (index >= 0 && index < sSplit.length) {
			System.out.print("Output is:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		}
	}

	public void m15(String ana1, String ana2) {
		System.out.println();
		boolean result = false;
		if (ana1.length() != ana2.length()) {
			System.out.println(ana1 + " & " + ana2 + " are not anagram!!");
		} else {
			char[] ch1 = ana1.toLowerCase().toCharArray();
			char[] ch2 = ana2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			result = Arrays.equals(ch1, ch2);
			if (result) {
				System.out.println(ana1 + " & " + ana2 + " are anagram!!");
			} else {
				System.out.println(ana1 + " & " + ana2 + " are not anagram!!");
			}
		}
	}

	public void m16(String str) {
		String subStrings = "of the";
		boolean is_Present_1 = str.matches("(.*)" + subStrings + "(.*)");
		System.out.println("'" + subStrings + "'" + " is the substring of string statement ? " + is_Present_1);

		boolean is_Present_2 = str.contains(subStrings);
		System.out.println("'" + subStrings + "'" + " is the substring of string statement ? " + is_Present_2);
	}

	public void m17(String[] str) {
		System.out.println("String array after sorted:: ");
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
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public void m18(String[] str) {
		System.out.println("Finding duplicate array elements using brute force:: ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
	}

	public void m19(String[] str) {
		System.out.println("Finding duplicate array elements using Set:: ");
		Set<String> sSet = new HashSet<>();
		for (String s : str) {
			if (sSet.add(s) == false) {
				System.out.println(s);
			}
		}
	}

	public void m20(String[] str) {
		System.out.println("Finding duplicate array elements using Map:: ");
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
				System.out.println(entMap.getKey() + " = " + entMap.getValue());
			}
		}
	}

	public void m21(String[] str1, String[] str2) {
		System.out.println("Only Unique element between two array:: ");
		List<String> li1 = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);
		for (String s : s1) {
			System.out.println(s);
		}
	}

	public void m22(String[] str) {
		System.out.println("Occurence of array elements:: ");
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
		System.out.println(sMap);
	}

	public void m23(String[] str) {

		System.out.println("Array elements:: ");
		for (String s : str) {
			System.out.println(s);
		}
		boolean isSorted = true;
		if (str == null || str.length == 0) {
			isSorted = true;
			System.out.println("VOID!!");
		}
		for (int i = 1; i < str.length; i++) {
			if (str[i - 1].compareTo(str[i]) > 0) {
				isSorted = false;
			}
		}
		if (isSorted) {
			System.out.println("is String array sorted:: " + isSorted);
		} else {
			System.out.println("is String array sorted:: " + isSorted);
		}
	}

	public void m24(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("This is the thirtyteeth file i'm reading from code!!");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void m25(String readFile) {
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

	public void m26(String str) {
		System.out.println("Only character from rumble string:: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only number from rumble string:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only special character from rumble string:: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	public void m27() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array:: ");
		int sLength = scan.nextInt();

		String[] arrs = new String[sLength];

		System.out.println("Enter the array elements:: ");
		for (int i = 0; i < sLength; i++) {
			arrs[i] = scan.next();
		}
		for (int i = 0; i < arrs.length; i++) {
			System.out.println(arrs[i]);
		}
	}

	public static void main(String[] args) {
		String str1 = "programs";
		String str2 = "This is the Programming Practice of the java";
		String str3 = "This iS tHe proGRAMMINg Practice of the jAvA";
		String perm = "OIL";
		String ana1 = "sony";
		String ana2 = "NOSY";
		String[] arr1 = str2.split(" ");
		String[] arr2 = str3.split(" ");
		String random = "Rama75647n&*%&^98656757&^&%%";
		Practice_30 obj1 = new Practice_30();
		obj1.m1(str1);
		obj1.m2(str2);
		obj1.m3(str2);
		obj1.m4(str2);
		obj1.m5(str2);
		obj1.m6(str2);
		obj1.m7(str2);
		System.out.println("Permutation of " + perm + " is: ");
		obj1.m8("", perm);
		obj1.m9(str1);
		obj1.m10(str1, str2);
		obj1.m11(str1);
		obj1.m12(str2);
		obj1.m13(str3);
		obj1.m14(str2);
		obj1.m15(ana1, ana2);
		obj1.m16(str2);
		obj1.m17(arr1);
		obj1.m18(arr1);
		obj1.m19(arr1);
		obj1.m20(arr1);
		obj1.m21(arr1, arr2);
		obj1.m22(arr1);
		obj1.m23(arr2);
		obj1.m24("thirty");
		obj1.m25("thirty");
		obj1.m26(random);
		obj1.m27();
	}

}
