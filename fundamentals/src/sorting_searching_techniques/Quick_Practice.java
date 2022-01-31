package sorting_searching_techniques;

import java.util.ArrayList;
import java.util.List;

public class Quick_Practice {

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

	public void quickSort(int[] num, int low, int high) {
		int pi = divideConquer(num, low, high);
		if (low < pi - 1) {
			quickSort(num, low, pi - 1);
		}
		if (pi < high) {
			quickSort(num, pi, high);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("\nSorted Array :: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

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
			if (num[i] == 0 || num[i] < 0) {
				tempArr[j++] = num[i];
			}
		}
		System.out.println("All Zero and negative number in the end:: ");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}
	}

	public void m2(int[] num) {
		List<Integer> allNum = new ArrayList<>();
		List<Integer> allZeroNegative = new ArrayList<>();

		for (Integer data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data == 0 || data < 0) {
				allZeroNegative.add(data);
			}
		}

		allNum.addAll(allZeroNegative);
		System.out.println("All Zero and negative number in the end using List:: \n"+allNum);
	}
	
	public void m3(int[] num) {
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searchNumber = 99;
		while (li <= hi) {
			if (num[mi] == searchNumber) {
				System.out.println(searchNumber + " is present at the " + mi + " index position");
				break;
			} else if (num[mi] < searchNumber) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searchNumber + " is not present in the array!!");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 11, 2, 1, 0, 99, 99 - 711, 66, 4, 0, };
		System.out.println("Array elements are: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Quick_Practice obj1 = new Quick_Practice();
		obj1.quickSort(arr, 0, arr.length - 1);
		obj1.sortedArray(arr);
		//obj1.m1(arr);
		obj1.m2(arr);
		obj1.m3(arr);
	}

}
