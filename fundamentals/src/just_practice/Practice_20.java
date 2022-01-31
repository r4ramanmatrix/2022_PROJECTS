package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_20 implements Cloneable {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;
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
		System.out.println("\nSorted Array:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Average of array elements:: " + sum / num.length);
		System.out.println("Second heighest element in array:: " + num[num.length - 2]);
	}

	public void m3(int[] num) {
		if (num.length == 0 || num.length < 2) {
			System.out.println("VOID");
		}
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
					;
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
		System.out.println("Count of Even element:: " + even);
		System.out.println("Count of Odd element:: " + odd);

		while (number > 0) {
			int rem = number % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			number = number / 10;
		}
		System.out.println("Count of Even number:: " + even_count);
		System.out.println("Count of Odd number:: " + odd_count);
	}

	public void m8(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num[i] + " is Prime Number.");
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
		int[] tempArr = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				tempArr[j++] = num[i];
			}
		}
		if (num.length == 0) {
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0 || num[i] == 0) {
				tempArr[j++] = num[i];
			}
		}
		System.out.println("All zero and negative element in the end of the array: ");
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.print(num[i] + " ");
		}
	}

	public void m11(int[] num) {
		System.out.println("\nAll zero and negative element in the end : ");
		List<Integer> allNum = new ArrayList<Integer>();
		List<Integer> allZeroNegative = new ArrayList<Integer>();

		for (int data : num) {
			if (data > 0) {
				allNum.add(data);
			} else if (data < 0 || data == 0) {
				allZeroNegative.add(data);
			}
		}
		allNum.addAll(allZeroNegative);
		System.out.println(allNum);
	}

	public void m12(int[] num) {
		System.out.println("Array elements before searching:: ");

		for (int i : num) {
			Arrays.sort(num);
			System.out.print(i + " ");
		}
		int searched_Number = 77;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (num[mi] == searched_Number) {
				System.out.println("\n" + searched_Number + " is present at " + mi + " index position!!");
				break;
			} else if (num[mi] < searched_Number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("\n" + searched_Number + " is not present in array!!");
		}
	}

	public void m13(int[] num) {
		Map<Integer, Integer> iMap = new LinkedHashMap<>();
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
		System.out.println("Occurence of array elements:: " + iMap);
	}

	public void m14(int[] num1, int[] num2) {
		System.out.println("Unique element between two array::");
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

		for (int i : s1) {
			System.out.println(i);
		}
	}

	public int divideConquer(int[] num, int low, int high) {
		int pivot = num[(low + high) / 2];
		while (low <= high) {
			while (num[low] < pivot) {
				low++;
			}
			while (pivot<num[high]) {
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
		System.out.println("Sorted Array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m15(int year) {
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

	public void m16(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		System.out.println("Sum of numbers:: " + sum);
	}

	public void m17(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number in counting :: " + count);
	}

	public void m18(int num) {
		int reverseNum = 0;
		while (num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + reverseNum);
	}

	public void m19(int value) {
		int k = 1;
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public void m20(int num) {
		System.out.println("Divisor of " + num);
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 77, 0, 7, 88, 80, 1, 2, -7, 0, 1, 99, 99 };
		int[] arr2 = { 0, 77, 0, 7, 2, -7, 0, 1, 99, 199 };
		int number = 789654120;
		int year = 2000;
		int nums = 10;
		System.out.println("Array elements:: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Practice_20 obj1 = new Practice_20();
		try {
			Practice_20 obj2 = (Practice_20) obj1.clone();
			obj2.m1(arr, arr.length);
			obj2.m2(arr);
			obj2.m3(arr);
			obj2.m4(arr);
			obj2.m5(arr);
			obj2.m6(arr);
			obj2.m7(arr, number);
			obj2.m8(arr);
			obj2.m9(arr);
			obj2.m10(arr);
			obj2.m11(arr2);
			obj2.m12(arr2);
			obj2.m13(arr);
			obj2.m14(arr, arr2);
			obj2.quickSort(arr, 0, arr.length - 1);
			obj2.sortedArray(arr);
			obj2.m15(year);
			obj2.m16(number);
			obj2.m17(number);
			obj2.m18(number);
			obj2.m19(nums);
			obj2.m20(nums);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
