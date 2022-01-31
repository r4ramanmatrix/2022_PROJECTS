package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_17 implements Cloneable {

	public void m1(int[] num, int lengths) {
		int[] a = new int[lengths];
		int j = lengths;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("\nArray elements after reversed:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(a[i]);
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
		System.out.println("Array elements after sorted:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
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
		System.out.println("Largest elemnet in an array:: " + largest);
		System.out.println("Smallest elemnet in an array:: " + smallest);
	}

	public void m4(int[] num) {
		System.out.println("Find duplicate element using brute force method:: ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}

	public void m5(int[] num) {
		System.out.println("Duplicate element using Set");
		Set<Integer> iSet = new HashSet<>();
		int count = 0;
		for (int i : num) {
			if (iSet.add(i) == false) {
				System.out.println(i);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element!");
		}
	}

	public void m6(int[] num) {
		System.out.println("Duplicate element using Map");
		Map<Integer, Integer> iMap = new HashMap<Integer, Integer>();
		for (int i : num) {
			Integer count = iMap.get(i);
			if (count == null) {
				iMap.put(i, 1);
			} else {
				iMap.put(i, ++count);
			}
		}
		int count = 0;
		Set<Map.Entry<Integer, Integer>> entSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("No duplicate element!");
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
		System.out.println("Count of even number in array:: " + even);
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
		System.out.println("Count of even number :: " + even_count);
		System.out.println("Count of odd number :: " + odd_count);
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
				System.out.println(num[i] + " is Prime Number");
			} else {
				System.out.println(num[i] + " is not Prime Number");
			}
		}
	}

	public void m9(int[] num) {
		System.out.println("Only Unique and non repeated number:: ");
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
		System.out.println("All Zero element in the end of the array");
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
		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			System.out.println(num[i]);
		}
	}

	public void m11(int[] num) {
		System.out.println("All Zero element in the end of the array using List:: ");
		List<Integer> allNum = new ArrayList<>();
		List<Integer> allZeroNegative = new ArrayList<>();
		for (int data : num) {
			if (data > 0) {
				allNum.add(data);
			}
			if (data == 0 || data < 0) {
				allZeroNegative.add(data);
			}
		}
		allNum.addAll(allZeroNegative);
		System.out.println(allNum);
	}

	public void m12(int[] num) {
		System.out.println("Array elements");
		for (int i : num) {
			System.out.print(i + " ");
		}
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searchNumber = 99;
		while (li <= hi) {
			if (num[mi] < searchNumber) {
				li = mi + 1;
			} else if (num[mi] == searchNumber) {
				System.out.println("\n" + searchNumber + " is present at the " + mi + " index position.");
				break;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searchNumber + " is not present");
		}
	}

	public void m13(int[] num) {
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
		System.out.println("Occurence of elements:: \n" + iMap);
	}

	public void m14(int[] num, int[] num2) {
		Integer[] i1 = Arrays.stream(num).boxed().toArray(Integer[]::new);
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

		System.out.println("Only unique element between two array:: ");
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

	public void m15(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap Year!!");
				} else {
					System.out.println(year + " is not a leap Year!!");
				}
			} else {
				System.out.println(year + " is a leap Year!!");
			}
		} else {
			System.out.println(year + " is not a leap Year!!");
		}
	}

	public void m16(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number is: " + sum);
	}

	public void m17(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number in counting is:: " + count);
	}

	public void m18(int num) {
		int reverseNum = 0;
		while (num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + reverseNum);
	}

	public static void main(String[] args) {
		int number = 101010;
		int year = 2009;
		int[] arr = { 0, 5, 55, 1, 1, 2, 0, -9, 99, 101 - 100 };
		int[] arr2 = { 0, 5, 55, 1, 1, 2, 0, -9, 99, 101 - 100, 500 };
		System.out.println("Array elements are:: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Practice_17 obj1 = new Practice_17();
		try {
			Practice_17 obj2 = (Practice_17) obj1.clone();
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
			obj2.quickSorting(arr2, 0, arr2.length - 1);
			obj2.sortedArray(arr2);
			obj2.m15(year);
			obj2.m16(number);
			obj2.m17(number);
			obj2.m18(number);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
