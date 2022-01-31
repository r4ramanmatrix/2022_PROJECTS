package interview_basic;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Practicing36 {

	public static void main(String[] args) {
		String str1 = "java selenium maven git jenkins testng junit";
		Set<Character> charSet = new LinkedHashSet<>();
		for (char ch : str1.toCharArray()) {
			charSet.add(ch);
		}

		StringBuilder sb = new StringBuilder();
		for (Character chx : charSet) {
			sb.append(chx);
		}
		System.out.println("Unique values are: " + sb.toString());

		// str1 = str1.replaceAll("\\s+", "");
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		for (char ch1 : str1.toCharArray()) {
			if (charMap.containsKey(ch1)) {
				charMap.put(ch1, charMap.get(ch1) + 1);
			} else {
				charMap.put(ch1, 1);
			}
		}
		System.out.println("Occurence of letters are: ");
		System.out.println(charMap);

		String str2 = "Java Selenium";
		String str2Reverse = "";
		for (int i = str2.length() - 1; i >= 0; i--) {
			str2Reverse = str2Reverse + str2.charAt(i);
		}
		System.out.println("After reversing: " + str2Reverse);

		String[] str1Split = str1.split(" ");
		System.out.println("Reversing on their position: ");
		for (int i = 0; i < str1Split.length; i++) {
			for (int j = str1Split[i].length() - 1; j >= 0; j--) {
				System.out.print(str1Split[i].charAt(j));
			}
			System.out.print(" ");
		}
		String sortThis = "java";
		char[] ch = sortThis.toCharArray();
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
		System.out.println("Sorted String: ");
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

		String name1 = "Raman";
		String name2 = "Kumar";

		System.out.println("Name1 before swapping: " + name1);
		System.out.println("Name2 before swapping: " + name2);

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());

		System.out.println("Name1 after swapping: " + name1);
		System.out.println("Name2 after swapping: " + name2);

	}

}
