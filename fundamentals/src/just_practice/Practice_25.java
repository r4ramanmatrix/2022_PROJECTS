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

public class Practice_25 implements Cloneable {

	public void m1(int[] num) {
		int[] a = new int[num.length];
		int j = num.length;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("\nArray elements reversed: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void m2(int[] num) {
		System.out.println("\nSorted Array elements:: ");
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
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			sum += num[i];
		}
		System.out.println("Sum of array elements:: " + sum);
		System.out.println("Average of array:: " + sum / num.length);
		System.out.println("Second heighest element in an array:: " + num[num.length - 2]);
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
		for (int i : num) {
			Integer count = iMap.get(i);
			if (count == null) {
				iMap.put(i, 1);
			} else {
				iMap.put(i, ++count);
			}
		}
		Set<Map.Entry<Integer, Integer>> iSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : iSet) {
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
		System.out.println("Count of even element:: " + even);
		System.out.println("Count of odd element:: " + odd);

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
				System.out.println(num[i] + " is a Prime Number");
			} else {
				System.out.println(num[i] + " is not a Prime Number");
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
		if (num == null || num.length == 0 || num.length == 1) {
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
		System.out.println(allNum);
	}

	public void m12(int[] num) {
		System.out.println("Array elements before searching:: ");
		Arrays.sort(num);
		for (int i : num) {
			System.out.println(i);
		}
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searchNumber = 9;
		while (li <= hi) {
			if (num[mi] == searchNumber) {
				System.out.println(searchNumber + " is present at " + mi + " index position.");
				break;
			} else if (num[mi] < mi) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searchNumber + " is not present in the array");
		}
	}

	public void m13(int[] num) {
		System.out.println("Occurence of integer array elements::");
		Map<Integer, Integer> iMap = new LinkedHashMap<>();
		for (int i : num) {
			Integer count = iMap.get(i);
			if (count == null) {
				iMap.put(i, 1);
			} else {
				iMap.put(i, ++count);
			}
		}
		System.out.println(iMap);
	}

	public void m14(int[] num1, int[] num2) {
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

		System.out.println("Only unique element between two array:: ");
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
		System.out.println("Sorted Array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m15(int[] num) {
		System.out.println("Array elements:: ");
		for (int i : num) {
			System.out.println(i);
		}
		boolean isSorted = true;
		if (num == null || num.length == 0) {
			isSorted = true;
			System.out.println("VOID!!");
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				isSorted = false;
			}
		}
		System.out.println("is Array sorted:: " + isSorted);
	}

	public void m16(int[] num) {
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

	public void m17(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count of number :: " + count);
	}

	public void m18(int num) {
		System.out.println("Sum of number:: ");
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println(sum);
	}

	public void m19(int num) {
		System.out.println("Number after reverse:: ");
		int reverseNum = 0;
		while (num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(reverseNum);
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
			System.out.println("VOID");
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

	public void m24(int num) {
		if (num == 0 || num == 1) {
			System.out.println("Void");
		}
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println("Number is perfect number");
		} else {
			System.out.println("Number is not a perfect number");
		}
	}

	public void m25() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the array length:: ");
		int numRequired = scan.nextInt();

		int[] arra = new int[numRequired];
		System.out.println("Enter the array elements:: ");
		for (int i = 0; i < numRequired; i++) {
			arra[i] = scan.nextInt();
		}
		for(int i:arra){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 11, 2, 0, 21, 0, 9, 1, 4 };
		int[] arr2 = { 0, 11, 2, 0, 21, 0, 9, 1, 4, 8 };
		int number = 25031988;
		System.out.println("Array elements:: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Practice_25 obj1 = new Practice_25();
		try {
			Practice_25 obj2 = (Practice_25) obj1.clone();
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
			obj2.m13(arr);
			obj2.m14(arr, arr2);
			obj2.quickSort(arr, 0, arr.length - 1);
			obj2.sortedArray(arr);
			obj2.m15(arr);
			obj2.m16(arr);
			obj2.m17(number);
			obj2.m18(number);
			obj2.m19(number);
			obj2.m20(10);
			obj2.m21(2004);
			obj2.m22(20);
			obj2.m23(6);
			obj2.m24(28);
			obj2.m25();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
