package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice_30 implements Cloneable {

	public void m1(int[] num) {
		int[] a = new int[num.length];
		int j = num.length;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("\nString after reverse:: ");
		for (int i = 0; i < num.length; i++) {
			if (i == num.length - 1) {
				System.out.print(a[i] + " ");
			} else {
				System.out.print(a[i] + ", ");
			}
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
		System.out.println("\nSorted Array elements:: ");
		for (int i = 0; i < num.length; i++) {
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}
			sum += num[i];
		}
		System.out.println("\nSum of array elements:: " + sum);
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
		if (num == null || num.length == 0) {
			return;
		}
		int[] tempArr = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				tempArr[j++] = num[i];
			}
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

	public void m11(int[] num) {

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
		System.out.println("All zero element in the end of the array using List: ");
		Iterator<Integer> itr = allNum.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
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
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}
		}

	}

	public void m13(int[] num) {
		System.out.println("\nArray elements before searching:: ");
		Arrays.sort(num);
		for (int i : num) {
			if (i == num.length - 1) {
				System.out.print(i + " ");
			} else {
				System.out.print(i + ", ");
			}
		}
		int searchElement = 110;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (num[mi] == searchElement) {
				System.out.print("\n" + searchElement + " is present at " + mi + " index location.");
				break;
			} else if (num[mi] < searchElement) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println("\n" + searchElement + " is not Present!!");
		}

	}

	public void m14(int[] num) {
		Map<Integer, Integer> iMap = new LinkedHashMap<Integer, Integer>();
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

	public void m15(int[] num1, int[] num2) {
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
		System.out.println("Unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public int divideConquer(int low, int high, int[] num) {
		int pivot = num[(low + high) / 2];
		while (low <= high) {
			while (num[low] < pivot) {
				low++;
			}
			while (num[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = num[high];
				num[high] = num[low];
				num[low] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	public void quickSort(int low, int high, int[] num) {
		int pi = divideConquer(low, high, num);
		if (pi - 1 > low) {
			quickSort(low, pi - 1, num);
		}
		if (pi < high) {
			quickSort(pi, high, num);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Sorted Array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m16(int[] num) {
		boolean is_Sorted = true;
		if (num == null || num.length == 0 || num.length == 1) {
			is_Sorted = true;
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				is_Sorted = false;
			}
		}
		System.out.println("is Array sorted:: " + is_Sorted);
	}

	public void m17(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count of number is:: " + count);
	}

	public void m18(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number is:: " + sum);
	}

	public void m19(int num) {
		int revNum = 0;
		while (num != 0) {
			revNum = revNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + revNum);
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
		System.out.println("Divisor of " + num + " is:: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void m22(int num) {
		System.out.println("Pattern is:: ");
		int k = 1;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public void m23(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println(num + " is a Perfect number");
		} else {
			System.out.println(num + " is not a Perfect number");
		}
	}

	public void m24() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of an array:: ");
		int aLength = scan.nextInt();
		System.out.println("Enter the array elements:: ");
		int[] arr = new int[aLength];

		for (int i = 0; i < aLength; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array elements are::");
		for (int i : arr) {
			System.out.println(i);
		}
	}

	public void m25(int num) {
		int fact=1;
		System.out.println("Factorial of " + num + " is:: ");
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		int[] arr = { 77, 1, 2, 0, 6, 0, 9 };
		int[] arr2 = { 77, 1, 2, 0, 6, 0, 9, 111 };
		int[] arr3 = { 77, 1, 2, 0, 6, 0, 9, 111 };
		int number = 987907101;
		System.out.println("Arrsy elements are:: ");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		Practice_30 obj1 = new Practice_30();
		try {
			Practice_30 obj2 = (Practice_30) obj1.clone();
			obj2.m1(arr);
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
			obj2.m12(arr);
			obj2.m13(arr2);
			obj2.m14(arr2);
			obj2.m15(arr, arr2);
			obj2.quickSort(0, arr2.length - 1, arr2);
			obj2.sortedArray(arr2);
			obj2.m16(arr3);
			obj2.m17(number);
			obj2.m18(number);
			obj2.m19(number);
			obj2.m20(2004);
			obj2.m21(25);
			obj2.m22(10);
			obj2.m23(16);
			obj2.m24();
			obj2.m25(5);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
