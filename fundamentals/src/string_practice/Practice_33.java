package string_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_33 implements Cloneable {

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
			if ((str.charAt(i) != ' ') & (str.charAt(i) != '\t')) {
				count++;
			}
		}
		System.out.println("\nCount of words in a String statement:: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') && (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}

		System.out.println("Count of words in a String statement:: " + count2);
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
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
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
		System.out.println("\nOnly Unqiue and non-repeated character in a String::");
		for (int i = 0; i < str.length(); i++) {
			boolean is_Unique = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					is_Unique = false;
					break;
				}
			}
			if (is_Unique) {
				System.out.println(str.charAt(i));
			}
		}
	}

	public void m7(String str) {
		System.out.println("Unique and one time repeated character only:: ");
		String finalSTr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!finalSTr.contains(String.valueOf(str.charAt(i)))) {
				finalSTr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println(finalSTr);
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

		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println("First letter in upper case:: " + str.trim());
	}

	public void m12(String str) {

		if (str == null || str.isEmpty()) {
			System.out.println("VOID");
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
		System.out.println("String in camel case frm rumble jumble string:: " + sb);
	}

	public void m13(String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("VOID!!");
		}
		String[] sSplit = str.split(" ");
		int index = 5;
		if (index > 0 && index < sSplit.length) {
			System.out.print("OutPut is:: ");
			for (int i = index; i < sSplit.length; i++) {
				System.out.print(sSplit[i] + " ");
			}
			for (int j = 0; j < index; j++) {
				System.out.print(sSplit[j] + " ");
			}
		} else {
			System.out.println("InValid index!!");
		}
	}

	public void m14(String str) {
		System.out.println("\nOccurence of character in a String:: ");
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

	public void m15(String str1, String str2) {
		boolean result = false;
		if (str1.length() != str2.length()) {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		} else {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			result = Arrays.equals(ch1, ch2);
			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		}
	}

	public void m16(String str) {
		String search_String = "the java";
		boolean is_present_1 = str.contains(search_String);
		System.out.println(search_String + " is present: " + is_present_1);

		boolean is_present_2 = str.matches("(.*)" + search_String + "(.*)");
		System.out.println(search_String + " is present: " + is_present_2);
	}

	public void m17(String str) {
		System.out.println("Only String:: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only integer:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only special characters:: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	public void m18(String[] str) {
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

	public void m19(String[] str) {
		System.out.println("Finding duplicate array elements using brute force:: ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
	}

	public void m20(String[] str) {
		System.out.println("Finding duplicate array elements using Set:: ");
		Set<String> sSet = new HashSet<String>();
		for (String s : str) {
			if (sSet.add(s) == false) {
				System.out.println(s);
			}
		}
	}

	public void m21(String[] str) {
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
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
			}
		}
	}

	public void m22(String[] str1, String[] str2) {
		List<String> li1 = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();

		li1.addAll(Arrays.asList(str1));
		li2.addAll(Arrays.asList(str2));

		Set<String> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<String> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Only unique element between two array:: ");
		for (String s : s1) {
			System.out.println(s);
		}
	}

	public void m23(String[] str) {
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
		System.out.println("Occurence of Array elements:: " + sMap);
	}

	public void m24(String[] str) {
		boolean is_Sorted = true;
		if (str == null || str.length == 0) {
			is_Sorted = true;
		}
		for (int i = 1; i < str.length; i++) {
			if (str[i-1].compareTo(str[i]) > 0) {
				is_Sorted = false;
			}
		}
		System.out.println("is Array Sorted:: " + is_Sorted);
	}

	public void m25(String writeFile){
		
	}
	public static void main(String[] args) {
		String str1 = "statement";
		String str2 = "this is the string statement in the java";
		String PERM = "VED";
		String str3 = "thiS iS tHE stRING stATEment in the java prograMMING";
		String ana1 = "DEN";
		String ana2 = "END";
		String random = "Rama75647n&*%&^98656757&^&%%";
		String[] arr1 = str2.split(" ");
		String[] arr2 = str3.split(" ");
		Practice_33 obj1 = new Practice_33();
		try {
			Practice_33 obj2 = (Practice_33) obj1.clone();
			obj2.m1(str1);
			obj2.m2(str2);
			obj2.m3(str2);
			obj2.m4(str2);
			obj2.m5(str2);
			obj2.m6(str2);
			obj2.m7(str2);
			System.out.println("Permutation of " + PERM + " is: ");
			obj2.m8("", PERM);
			obj2.m9(str1);
			obj2.m10(str1, str2);
			obj2.m11(str2);
			obj2.m12(str3);
			obj2.m13(str2);
			obj2.m14(str2);
			obj2.m15(ana1, ana2);
			obj2.m16(str2);
			obj2.m17(random);
			obj2.m18(arr1);
			obj2.m19(arr1);
			obj2.m20(arr1);
			obj2.m21(arr1);
			obj2.m22(arr1, arr2);
			obj2.m23(arr1);
			obj2.m24(arr2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
