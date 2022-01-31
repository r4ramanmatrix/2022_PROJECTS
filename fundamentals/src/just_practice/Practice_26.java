package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice_26 {

	public void m1(int[] num) {
		int a[] = new int[num.length];
		int j = num.length;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reversed:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void m2(int[] num) {
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		System.out.println("\nArray Sorted:: ");
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			System.out.println(num[i]);
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Average of array:: " + sum / num.length);
		System.out.println("Second heighest array element:: " + num[num.length - 2]);
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
		System.out.println("Finding duplicate element using Map:: ");
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
		System.out.println("Count of even element in an array:: " + even);
		System.out.println("Count of odd element in an array:: " + odd);

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of even number:: " + even_count);
		System.out.println("Count of odd number:: " + odd_count);

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
				System.out.println(num[i] + " is a Prime number.");
			} else {
				System.out.println(num[i] + " is not a Prime number.");
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
		List<Integer> allZero = new ArrayList<Integer>();
		for (Integer data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data == 0) {
				allZero.add(data);
			}
		}
		allNum.addAll(allZero);
		if (allNum.contains(0)) {
			System.out.println(allNum);
		} else {
			System.out.println("Array doesn't have any 0 element");
		}
	}

	public void m12(int[] num) {
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

	public void m13(int[] num) {
		System.out.println("Array elements before searching:: ");
		Arrays.sort(num);
		for (int i : num) {
			System.out.println(i);
		}
		int search_element = 20;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (num[mi] == search_element) {
				System.out.println(search_element + " is present at " + mi + " index position.");
				break;
			} else if (num[mi] < search_element) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(search_element + " is not present!!");
		}
	}

	public void m14(int[] num) {
		int count = 0;
		Map<Integer, Integer> iMap = new LinkedHashMap<Integer, Integer>();
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

	public void m15(int[] arr1, int[] arr2) {
		Integer[] i1 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);

		List<Integer> li1 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(i1));
		li2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<Integer> s2 = new HashSet<>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		System.out.println("Only Unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}

	}

	public int divideConquer(int[] num, int low, int high) {
		int pivot = num[(low + high) / 2];
		while (low <= high) {
			while (pivot > num[low]) {
				low++;
			}
			while (pivot < num[high]) {
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
		if (pi - 1 > low) {
			quickSort(num, low, pi - 1);
		}
		if (pi < high) {
			quickSort(num, pi, high);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Array after sorted is:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m16(int[] num) {
		System.out.println("Array elements:: ");
		for (int i : num) {
			System.out.println(i);
		}
		boolean isSorted = true;
		if (num == null || num.length == 1) {
			isSorted = true;
		}

		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				isSorted = false;
			}
		}
		System.out.println("Is Array Sorted:: " + isSorted);
	}

	public void m17(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count of number : " + count);
	}

	public void m18(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number :: " + sum);
	}

	public void m19(int num) {
		int reverseNum = 0;
		while (num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + reverseNum);
	}

	public void m20(int num) {
		System.out.println("Pattern is:: ");
		int k = 1;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public void m21(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap Year");
				} else {
					System.out.println(year + " is not a Leap Year");
				}
			} else {
				System.out.println(year + " is a Leap Year");
			}
		} else {
			System.out.println(year + " is not a Leap Year");
		}
	}

	public void m22(int num) {
		System.out.println("Divisor of " + num + " is: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void m23(int num) {
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

	public void m24() {
		System.out.println("Enter the length of the array:: ");
		Scanner scan = new Scanner(System.in);
		int intLength = scan.nextInt();

		System.out.println("Enter the array elements:: ");
		int[] nums = new int[intLength];
		for (int i = 0; i < intLength; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println("Array elemnts are:: ");
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 11, 2, 0, 21, 0, 9, 1, 4 };
		int[] arr1 = { 0, 11, 2, 0, 21, 0, 9, 1, 4 };
		int[] arr2 = { 20, 11, 2, 0, 21, 10, 9, 1, 4, 0 };
		int number = 989116892;
		Practice_26 obj1 = new Practice_26();
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
		obj1.m12(arr2);
		obj1.m13(arr2);
		obj1.m14(arr);
		obj1.m15(arr, arr2);
		obj1.quickSort(arr, 0, arr.length - 1);
		obj1.sortedArray(arr);
		obj1.m16(arr1);
		obj1.m17(number);
		obj1.m18(number);
		obj1.m19(number);
		obj1.m20(10);
		obj1.m21(2000);
		obj1.m22(9);
		obj1.m23(6);
		obj1.m24();
	}

}
