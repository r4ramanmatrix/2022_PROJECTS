package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice_27 implements Cloneable {

	public void m1(int[] num) {
		int j = num.length;
		int[] a = new int[j];

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements after reversed:: ");
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
		System.out.println("\nSorted array:: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
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
		System.out.println("Largest element in an array :: " + largest);
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
		System.out.println("Count of even element:: " + even);
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
				System.out.println(num[i] + " is Prime number");
			} else {
				System.out.println(num[i] + " is not a Prime number");
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
		int[] tempArr = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				tempArr[j++] = num[i];
			}
		}
		if (num == null || num.length == 0) {
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

	public void m11(int[] num) {
		System.out.println("All zero element in the end using List:");
		List<Integer> allNUm = new ArrayList<Integer>();
		List<Integer> allZero = new ArrayList<Integer>();

		for (Integer data : num) {
			if (data > 0) {
				allNUm.add(data);
			} else if (data == 0) {
				allZero.add(data);
			}
		}
		allNUm.addAll(allZero);
		System.out.println(allNUm);
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
		for (int i = 0; i <= num.length - 1; i++) {
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}
		}

	}

	public void m13(int[] num) {
		int searching_element = 3;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		System.out.println("\nArray elements before searching:: ");
		Arrays.sort(num);
		for (int i : num) {
			System.out.println(i);
		}

		while (li <= hi) {
			if (searching_element == num[mi]) {
				System.out.println(searching_element + " is present at " + mi + " index location.");
				break;
			} else if (searching_element > num[li]) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searching_element + " is not present in an array!!");
		}
	}

	public void m14(int[] num) {
		System.out.println("Occurence of array elements:: ");
		// int count = 0;
		Map<Integer, Integer> iMap = new HashMap<>();
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

	public void quickSort(int[] num, int high, int low) {
		int pi = divideConquer(num, low, high);
		if (pi - 1 > low) {
			quickSort(num, pi - 1, low);
		}
		if (pi < high) {
			quickSort(num, high, pi);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Sorted Array:: ");
		for (int i = 0; i < num.length; i++) {
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}
		}

	}

	public void m16(int[] num) {
		System.out.println("\nArray elements:: ");
		for (int i : num) {
			System.out.println(i);
		}
		boolean isSorted = true;
		if (num == null || num.length == 0 || num.length == 1) {
			isSorted = true;
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				isSorted = false;
			}
		}
		System.out.println("is Array sorted:: " + isSorted);
	}

	public void m17(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count of number:: " + count);
	}

	public void m18(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number:: " + sum);
	}

	public void m19(int num) {

		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + reverse);
	}

	public void m20(int year) {
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

	public void m21(int num) {
		System.out.println("Pattern is:: ");
		int k = 1;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public void m22(int num) {
		System.out.println("Divisor of :: " + num);
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
			System.out.println(num + " is a Perfect number");
		} else {
			System.out.println(num + " is not a Perfect number");
		}

	}

	public void m24() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array:: ");
		int lengthOfArray = scan.nextInt();

		int[] nums = new int[lengthOfArray];
		System.out.println("Enter the array elements:: ");
		for (int i = 0; i < lengthOfArray; i++) {
			nums[i] = scan.nextInt();
		}

		System.out.println("Array elements are:: ");
		for (int i : nums) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		Practice_27 obj1 = new Practice_27();
		System.out.println("Hashcode of obj1 is:: " + obj1.hashCode());
		Practice_27 obj3 = obj1;
		System.out.println("Hashcode of obj3 is:: " + obj3.hashCode());
		int[] arr = { 1, 0, 2, 9, 8, 4, 1, 0, 3 };
		int[] arr2 = { 1, 0, 2, 9, 8, 4, 1, 0, 3, 9, 7, 0 };
		int[] arr3 = { 1, 0, 2, 9, 8, 4, 1, 0, 3, 9, 7, 0 };
		int number = 11550236;
		try {
			Practice_27 obj2 = (Practice_27) obj1.clone();
			System.out.println("Hashcode of obj2 is:: " + obj2.hashCode());
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
			obj2.m12(arr2);
			obj2.m13(arr);
			obj2.m14(arr2);
			obj2.m15(arr, arr2);
			obj2.quickSort(arr2, arr2.length - 1, 0);
			obj2.sortedArray(arr2);
			obj2.m16(arr3);
			obj2.m17(number);
			obj2.m18(number);
			obj2.m19(number);
			obj2.m20(2001);
			obj2.m21(10);
			obj2.m22(26);
			obj2.m23(6);
			obj2.m24();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
