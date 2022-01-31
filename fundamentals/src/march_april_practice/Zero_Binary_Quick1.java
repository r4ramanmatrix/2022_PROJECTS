package march_april_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Zero_Binary_Quick1 implements Cloneable {

	public void m1(int[] num) {
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
		System.out.println("\nAll zero element in the end of the array:: ");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}
	}

	public void m2(int[] num) {
		System.out.println("Zero element in the end using List");
		List<Integer> allNum = new ArrayList<>();
		List<Integer> allZero = new ArrayList<>();
		for (int data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data == 0) {
				allZero.add(data);
			}
		}
		allNum.addAll(allZero);
		System.out.println(allNum);
	}

	public int divideConquer(int[] num, int low, int high) {
		int pivot = num[(low + high) / 2];
		while (low <= high) {
			while (num[low] < pivot) {
				low++;
			}
			while (num[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = num[low];
				num[low] = num[high];
				num[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	public void quickSorting(int[] num, int low, int high) {
		int pi = divideConquer(num, low, high);
		if (low < pi - 1) {
			quickSorting(num, low, pi - 1);

		}
		if (pi < high) {
			quickSorting(num, pi, high);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Sorted Array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m4(int[] num) {

		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searchNumber = 77;
		while (li <= hi) {
			if (num[mi] == searchNumber) {
				System.out.println(searchNumber + " is present at the " + mi + " index position.");
				break;
			} else if (num[mi] < searchNumber) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searchNumber + " is not present in array!!");
		}
	}

	public void m5(int[] num) {
		System.out.println("Find duplicate using MAP");
		Map<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		for (int i : num) {
			Integer count = iMap.get(i);
			if (count == null) {
				iMap.put(i, 1);
			} else {
				iMap.put(i, ++count);
			}
		}
		Set<Map.Entry<Integer, Integer>> entSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 0, 7, 77, 6, 0, 2, 3 };
		System.out.println("Array elements are:: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Zero_Binary_Quick1 obj1 = new Zero_Binary_Quick1();
		try {
			Zero_Binary_Quick1 obj2 = (Zero_Binary_Quick1) obj1.clone();
			obj2.m1(arr);
			obj2.m2(arr);
			obj2.quickSorting(arr, 0, arr.length - 1);
			obj2.sortedArray(arr);
			obj2.m4(arr);
			obj2.m5(arr);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
