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

public class Practice_12 {

	public static void m1(String str) {
		String strReverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			strReverse = strReverse + str.charAt(i);
		}
		System.out.println("String after reverse:: " + strReverse);
	}

	public static void m2(String str) {
		System.out.println("String statement reverse on their position:: ");
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
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) != '\t')) {
				count++;
			}
		}
		System.out.println("\nCount of characters in a string are:: " + count);

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) != ' ') & (str.charAt(i + 1) == ' ')) {
				count2++;
			}
		}
		System.out.println("Count of words in a string are:: " + count2);
	}

	public static void m4(String str) {
		System.out.println("Non repeated character in a string:: ");
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

	public static void m5(String str) {
		System.out.println("Unique and only once repeated character:: ");
		String finalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!finalStr.contains(String.valueOf(str.charAt(i)))) {
				finalStr += String.valueOf(str.charAt(i));
			}
		}
		System.out.println(finalStr);
	}

	public static void m6(String str) {
		System.out.println("First character in upper case: ");
		String[] sSplit = str.split(" ");
		str = "";
		for (int i = 0; i < sSplit.length; i++) {
			char ch = Character.toUpperCase(sSplit[i].charAt(0));
			str += " " + ch + sSplit[i].substring(1);
		}
		System.out.println(str.trim());
	}

	public static void m7(String prefix, String str) {
		if (str.isEmpty() || str == null) {
			System.out.println(prefix + " ");
		}
		for (int i = 0; i < str.length(); i++) {
			m7(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, str.length()));
		}
	}

	public static void m8(String str1, String str2) {
		System.out.println("String first before swapping :: " + str1);
		System.out.println("String second before swapping :: " + str2);
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());

		System.out.println("String first after swapping :: " + str1);
		System.out.println("String second after swapping :: " + str2);
	}

	public static void m9(String str) {
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
		System.out.println("String after sorted:: " + str);
	}

	public static void m10(String str1, String str2) {
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

	public static void m11(String[] str) {
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
		System.out.println("String array lements sorted:: ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void m12(String[] str) {
		int count = 0;
		Set<String> sSet = new HashSet<>();
		System.out.println("Duplicate element in an string array:: ");
		for (String s : str) {
			if (sSet.add(s) == false) {
				count++;
				System.out.println(s);
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate element in a string array!!");
		}
	}

	public static void m13(String[] str) {
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
		System.out.println("Occurence of array elements in a string array ::\n" + sMap);
	}

	public static void m14(String[] str1, String[] str2) {
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
	
	

	public static void m15(String[] str1, String[] str2) {
		System.out.println("Common element between two array:: ");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equalsIgnoreCase(str2[j])) {
					System.out.println(str1[i]);
				}
			}
		}
	}

	public static void m16(String writeFile) {
		try {
			FileWriter fw = new FileWriter(new File("E:\\" + writeFile + ".txt"));
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Hi, this is the 12th file i'm writing through the code!!, thanks!!!");
			bw.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Successfully wtitten!!");
		}
	}

	public static void m17(String readFile) {
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
			System.out.println("File Read Successfully!!");
		}
	}

	public static void m18(String str) {
		System.out.println("Only Numbers:: " + str.replaceAll("[^0-9]", ""));
		System.out.println("Only String:: " + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Only Special characters:: " + str.replaceAll("[a-zA-Z0-9]", ""));
	}

	public static void m19(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		Map<Character, Integer> sMap = new HashMap<>();
		for (char ch2 : ch) {
			if (sMap.containsKey(ch2)) {
				if (count < sMap.get(ch2)) {
					count = sMap.get(ch2) + 1;
				}
				sMap.put(ch2, sMap.get(ch2) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				sMap.put(ch2, 1);
			}
		}
		System.out.println("Occurence of character in a string are:: \n" + sMap);
	}

	public static void m20(String str) {
		System.out.println("Duplicate character in a string are:: ");
		int count = 0;
		Set<Character> cSet = new HashSet<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (cSet.add(c) == false) {
				count++;
				System.out.println(c);
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate character in a string");
		}
	}
	
	public static void m21(String str){
		
	}

	public static void main(String[] args) {
		String str1 = "Sunshine";
		String str2 = "this is the new phase";
		String str3 = "sunshine";
		String[] arr2 = { "sunshine", "of", "the", "new", "phase" };
		String[] arr = str2.split(" ");
		String random = "RA123&*&*&*M677676*(@#$A9650975504*(*(N";
		m1(str1);
		m2(str2);
		m3(str2);
		m4(str2);
		m5(str2);
		m6(str2);
		System.out.println("Permutation :: ");
		m7("", "NEW");
		m8(str1, str2);
		m9(str1);
		m10(str1, str3);
		m11(arr);
		m12(arr);
		m13(arr);
		m14(arr, arr2);
		m15(arr, arr2);
		m16("twelfth");
		m17("twelfth");
		m18(random);
		m19(str1);
		m20(str1);
	}
}
