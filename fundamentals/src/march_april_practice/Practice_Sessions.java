package march_april_practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice_Sessions implements Cloneable {

	public void m1(int[] num) {
		System.out.println("Find duplicate using brute force logic:: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.print(num[i] + " ");
				}
			}
		}
	}

	public void m2(int[] num) {
		System.out.println("\nFind duplicate using HashSet:: ");
		Set<Integer> iSet = new HashSet<>();
		for (int i : num) {
			if (iSet.add(i) == false) {
				System.out.print(i + " ");
			}
		}
	}

	public void m3(int[] num) {
		System.out.println("\nFind duplicate using HashMap:: ");
		Map<Integer, Integer> iMap = new HashMap<>();
		for (int i : num) {
			Integer count = iMap.get(i);
			if (count == null) {
				iMap.put(i, 1);
			} else {
				iMap.put(i, ++count);
			}
		}
		Set<Map.Entry<Integer, Integer>> entSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> im : entSet) {
			if (im.getValue() > 1) {
				System.out.print(im.getKey() + " ");
			}
		}
	}

	public static void m4(String str) {
		System.out.println("\nDuplicate character in a String:: ");
		if (str == null || str.isEmpty() || str.length() <= 1) {
			System.out.println("VOID");
		} else {
			char[] ch = str.toCharArray();
			Map<Character, Integer> cMap = new HashMap<>();
			for (char c : ch) {
				if (cMap.containsKey(c)) {
					cMap.put(c, cMap.get(c) + 1);
				} else {
					cMap.put(c, 1);
				}
			}
			Set<Map.Entry<Character, Integer>> eSet = cMap.entrySet();
			for (Map.Entry<Character, Integer> ciMap : eSet) {
				if (ciMap.getValue() > 1) {
					System.out.println(ciMap.getKey() + "=" + ciMap.getValue());
				}
			}
		}
	}

	public static void m5(int[] num) {
		int j = 0;
		int[] tempArr = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				tempArr[j++] = num[i];
			}
		}
		if (j == 0 || j == num.length) {
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				tempArr[j++] = num[i];
			}
		}
		System.out.println("All zero element in th eend of the array:: ");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}
	}

	public void m6(int[] num) {
		System.out.println("Array elements:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		Arrays.sort(num);
		System.out.println("\nArray elements after sorting:: ");
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println("\nSearching number using Binary Search:: ");
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int search_Number = 77;
		while (li <= hi) {
			if (num[mi] == search_Number) {
				System.out.println(search_Number + " at the " + mi + " index position!");
				break;
			} else if (num[mi] < search_Number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(search_Number + " is not present in array!!");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 88, 0, 2, 0, 5, 66, 1, 77, 2 };
		String str1 = "ramankumar";

		Practice_Sessions obj1 = new Practice_Sessions();
		try {
			Practice_Sessions obj2 = (Practice_Sessions) obj1.clone();
			obj2.m1(arr);
			obj2.m2(arr);
			obj2.m3(arr);
			m4(str1);
			m5(arr);
			obj2.m6(arr);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
