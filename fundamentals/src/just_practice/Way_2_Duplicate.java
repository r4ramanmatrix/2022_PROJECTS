package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Way_2_Duplicate {

	public static void m1(int[] num) {
		System.out.println("Getting duplicate element by using brute force method:: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}

	public static void m2(int[] num) {
		System.out.println("Getting duplicate element by using HashSet:: ");
		Set<Integer> iSet = new HashSet<>();
		for (int i : num) {
			if (iSet.add(i) == false) {
				System.out.println(i);
			}
		}
	}

	public static void m3(int[] num) {
		System.out.println("Getting duplicate element by using HashMap:: ");
		Map<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		for (int i : num) {
			Integer count = iMap.get(i);
			if (count == null) {
				iMap.put(i, 1);
			} else {
				iMap.put(i, ++count);
			}
		}
		Set<Entry<Integer, Integer>> iSet = iMap.entrySet();
		for (Entry<Integer, Integer> ent : iSet) {
			if (ent.getValue() > 1) {
				System.out.println(ent.getKey()+"="+ent.getValue());
			}
		}

	}

	public static void m4(int[] num) {
		System.out.println("Getting duplicate element by using Streams(filter):: ");
		Integer[] i1 = Arrays.stream(num).boxed().toArray(Integer[]::new);
		Set<Integer> iSet = new HashSet<>();
		Set<Integer> dupSet = Arrays.asList(i1).stream().filter(e -> !iSet.add(e)).collect(Collectors.toSet());
		Iterator<Integer> itr = dupSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void m6(int[] num) {
		System.out.println("All Zero in the end of the array:: ");
		int[] tempArr = new int[num.length];
		int j = 0;
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
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}

	}

	public static void m7(int[] num) {
		System.out.println("Method 2 to print all zero in the end of the array:: ");
		List<Integer> allNum = new ArrayList<Integer>();
		List<Integer> zeroNum = new ArrayList<Integer>();
		for (int i : num) {
			if (i > 0) {
				allNum.add(i);
			} else if (i == 0) {
				zeroNum.add(i);
			}
		}
		allNum.addAll(zeroNum);

		ListIterator<Integer> litr = allNum.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
	}

	public static void m8(int[] num) {
		System.out.println("Array elements:: ");
		for (int i : num) {
			System.out.println(i);
		}
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searchN = 2;
		while (li <= hi) {
			if (num[mi] == searchN) {
				System.out.println(searchN + " is at the " + mi + " index position!!");
				break;
			} else if (num[mi] < searchN) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searchN + " is not present in array!!");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 12, 1, 3, 0, 2, 3, 12, 0, 4, 4, 0 };
		m1(arr);
		m2(arr);
		m3(arr);
		m4(arr);
		// m6(arr);
		m7(arr);
		m8(arr);
	}

}
