package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_24 {

	public void m1(int[] num) {
		int[] a = new int[num.length];
		int j = num.length;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("\nArray elements reversed:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void m2(int[] num) {
		int temp = 0;
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		System.out.println("\nSorted array elements:: ");
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			System.out.println(num[i]);
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Average of array:: " + sum / num.length);
		System.out.println("Second heighest array element :: " + num[num.length - 2]);

	}

	public void m3(int[] num) {
		int largest = num[0];
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];
			} else if (num[i] < smallest) {
				smallest = num[i];
			}
		}
		System.out.println("Largest element in an array:: " + largest);
		System.out.println("Smallest element in an array:: " + smallest);
	}

	public void m4(int[] num) {
		System.out.println("Finding duplicate element using brute force:: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}

	public void m5(int[] num) {
		System.out.println("Finding duplicate element using Set:: ");

		Set<Integer> iSet = new HashSet<>();
		for (int i : num) {
			if (iSet.add(i) == false) {
				System.out.println(i);
			}
		}
	}

	public void m6(int[] num) {
		System.out.println("Finding duplicate element using Map::");
		Map<Integer, Integer> iMap = new HashMap<>();
		int count = 0;
		for (int i : num) {
			if (iMap.containsKey(i)) {
				if (count < iMap.get(i)) {
					count = iMap.get(i) + 1;
				}
				iMap.put(i, iMap.get(i) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				iMap.put(i, 1);
			}
		}
		Set<Map.Entry<Integer, Integer>> entSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
			}
		}
	}

	public void m7(int[] num, int number) {
		int even = 0;
		int odd = 0;
		int even_count = 0;
		int odd_count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Count of even number in an array:: " + even);
		System.out.println("Count of odd number in an array:: " + odd);

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of even number: " + even_count);
		System.out.println("Count of odd number: " + odd_count);
	}

	public void m8(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(num[i] + " is a Prime Number.");
			} else {
				System.out.println(num[i] + " is not a Prime Number.");
			}
		}
	}

	public void m9(int[] num) {
		System.out.println("Only unique and non-repeated number: ");
		for (int i = 0; i < num.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < num.length; j++) {
				if (i != j && num[i] == num[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(num[i]);
			}
		}
	}

	public void m10(int[] num) {
		System.out.println("All zero element in the end of the array: ");
		int[] temp = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				temp[j++] = num[i];
			}
		}
		if (num == null || num.length == 0) {
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) {
				temp[j++] = num[i];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			num[i] = temp[i];
			System.out.println(num[i]);
		}
	}

	public void m11(int[] num) {
		System.out.println("All zero element in the end using List: ");
		List<Integer> allNum = new ArrayList<Integer>();
		List<Integer> allZero = new ArrayList<>();

		for (int Data : num) {
			if (Data > 0) {
				allNum.add(Data);
			} else if (Data == 0) {
				allZero.add(Data);
			}
		}
		allNum.addAll(allZero);
		System.out.println(allNum);

	}

	public void m12(int[] num) {
		System.out.println("Array elements before searching:: ");
		Arrays.sort(num);
		for (int i : num) {
			System.out.print(i + " ");
		}

		int searching_Number = 12;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (num[mi] == searching_Number) {
				System.out.println("\n" + searching_Number + " is present at " + mi + " index position.");
				break;
			} else if (num[mi] < searching_Number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("\n" + searching_Number + " is not present in array!!");
		}
	}

	public void m13(int[] num) {
		int count = 0;
		Map<Integer, Integer> iMap = new LinkedHashMap<>();
		for (int i : num) {
			if (iMap.containsKey(i)) {
				if (count < iMap.get(i)) {
					count = iMap.get(i) + 1;
				}
				iMap.put(i, iMap.get(i) + 1);
			} else {
				if (count < 1) {
					count = 1;
				}
				iMap.put(i, 1);
			}
		}
		System.out.println("Occurence of integer array elements:: " + iMap);
	}

	public void m14(int[] num1, int[] num2) {
		System.out.println("Unique element between two array:: ");
		Integer[] i1 = Arrays.stream(num1).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(num2).boxed().toArray(Integer[]::new);

		List<Integer> li1 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(i1));
		li2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<Integer> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		for (int s : s1) {
			System.out.println(s);
		}
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

	public void quickSort(int[] num, int low, int high) {
		int pi = divideConquer(num, low, high);
		if (low < pi - 1) {
			quickSort(num, low, pi - 1);
		}
		if (high > pi) {
			quickSort(num, pi, high);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Sorted Array using Quick Sort:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m15(int[] num) {
		System.out.println("Array elements:: ");
		for (int i : num) {
			System.out.println(i);
		}
		boolean is_sorted = true;
		if (num == null || num.length == 1) {
			is_sorted = true;
		}

		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				is_sorted = false;
			}
		}
		System.out.println("is array sorted:: " + is_sorted);

	}

	public void m16(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number in counting is:: " + count);
	}

	public void m17(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of numbers:: " + sum);
	}

	public void m18(int num) {
		int revNum = 0;
		while (num != 0) {
			revNum = revNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + revNum);
	}

	public void m19(int num) {
		System.out.println("Pattern is:; ");
		int k = 1;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public void m20(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap Year!!");
				} else {
					System.out.println(year + " is not a Leap Year!!");
				}
			} else {
				System.out.println(year + " is a Leap Year!!");
			}
		} else {
			System.out.println(year + " is not a Leap Year!!");
		}
	}

	public void m21(int num) {
		System.out.println("Divisor of " + num + " is: ");
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void m22(int num) {
		int sum = 0;
		if (num == 0 || num == 1) {
			System.out.println("VOID!!");
		}
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is not a Perfect Number");
		}
	}

	public void m23(int[] num) {
		System.out.println("All Zero element in the beginning:: ");
		int j = num.length - 1;

		for (int i = num.length - 1; i >= 0; i--) {
			if (num[i] != 0) {
				num[j] = num[i];
				j--;
			}
		}
		while (j >= 0) {
			num[j] = 0;
			j--;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 12, 0, 5, 0, 1, 97, 1 };
		int[] arr2 = { 12, 0, 5, 0, 1, 9, 0, 1 };
		int number = 741025896;
		System.out.println("Array Elements:: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Practice_24 obj1 = new Practice_24();
		obj1.m1(arr);
		obj1.m2(arr);
		obj1.m3(arr);
		obj1.m4(arr);
		obj1.m5(arr);
		obj1.m6(arr);
		obj1.m7(arr, number);
		obj1.m8(arr);
		obj1.m9(arr);
		obj1.m10(arr);
		obj1.m11(arr2);
		obj1.m12(arr);
		obj1.m13(arr);
		obj1.m14(arr, arr2);
		obj1.quickSort(arr, 0, arr.length - 1);
		obj1.sortedArray(arr);
		obj1.m15(arr);
		obj1.m16(number);
		obj1.m17(number);
		obj1.m18(number);
		obj1.m19(10);
		obj1.m20(2003);
		obj1.m21(20);
		obj1.m22(86);
		obj1.m23(arr2);
	}
}
