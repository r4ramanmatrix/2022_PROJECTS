package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice_21 implements Cloneable {

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
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println("\nSum of array elements :: " + sum);
		System.out.println("Average of array:: " + sum / num.length);
		System.out.println("Second heighest element in an array:: " + num[num.length - 2]);
	}

	public void m3(int[] arr) {
		int largest = arr[0];
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest element in an array:: " + largest);
		System.out.println("Smallest element in an array:: " + smallest);
	}

	public void m4(int[] arr) {
		System.out.println("Finding duplicate element using brute force:: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public void m5(int[] arr) {
		System.out.println("Finding duplicate element using Set:: ");
		Set<Integer> iSet = new HashSet<>();
		for (int i : arr) {
			if (iSet.add(i) == false) {
				System.out.println(i);
			}
		}
	}

	public void m6(int[] arr) {
		System.out.println("Finding duplicate element using Map:: ");
		Map<Integer, Integer> iMap = new HashMap<>();
		for (int i : arr) {
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

	public void m7(int[] arr, int num) {
		int even = 0;
		int odd = 0;
		int even_count = 0;
		int odd_count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Count of even element: " + even);
		System.out.println("Count of odd element: " + odd);

		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			num = num / 10;
		}
		System.out.println("Count of even: " + even_count);
		System.out.println("Count of odd: " + odd_count);
	}

	public void m8(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < arr[i]; j++) {
				if (arr[i] % 2 == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(arr[i] + " is a Prime Number");
			} else {
				System.out.println(arr[i] + " is not a Prime Number");
			}
		}
	}

	public void m9(int[] arr) {
		System.out.println("Only unique and non-repeated number: ");
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(arr[i]);
			}
		}
	}

	public void m10(int[] arr) {
		System.out.println("All zero and negative element in the end of the array: ");
		int[] tempArr = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				tempArr[j++] = arr[i];
			}
		}
		if (arr == null || arr.length == 0) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] == 0) {
				tempArr[j++] = arr[i];
			}
		}

		for (int i = 0; i < tempArr.length; i++) {
			arr[i] = tempArr[i];
			System.out.print(arr[i] + " ");
		}
	}

	public void m11(int[] arr) {
		List<Integer> allNum = new ArrayList<Integer>();
		List<Integer> allNegativezero = new ArrayList<Integer>();

		for (int data : arr) {
			if (data > 0) {
				allNum.add(data);
			} else if (data < 0 || data == 0) {
				allNegativezero.add(data);
			}
		}

		allNum.addAll(allNegativezero);
		System.out.println("\nAll zero and negative element in the end : " + allNum);

	}

	public void m12(int[] arr) {
		System.out.println("Array elements before searching:: ");
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

		int li = 0;
		int hi = arr.length - 1;
		int mi = (li + hi) / 2;
		int search_number = 3;
		while (li <= hi) {
			if (arr[mi] == search_number) {
				System.out.println("\n" + search_number + " is present at " + mi + " index position!!");
				break;
			} else if (arr[mi] < search_number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(search_number + " is not present in array!!");
		}
	}

	public void m13(int[] arr) {
		int count = 0;
		Map<Integer, Integer> iMap = new LinkedHashMap<>();
		for (int i : arr) {
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

	public void m14(int[] arr1, int[] arr2) {
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
			while (num[low] < pivot) {
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
		if (low < pi - 1) {
			quickSort(num, low, pi - 1);

		}
		if (pi < high) {
			quickSort(num, pi, high);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Sorted array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m15(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Number in counting:: " + count);
	}

	public void m16(int year) {
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

	public void m17(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number is:: " + sum);
	}

	public void m18(int number) {
		int reverseNum = 0;
		while (number != 0) {
			reverseNum = reverseNum * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reverse:: " + reverseNum);

	}

	public void m19(int num) {
		System.out.println("Pattern:: ");
		int k = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public void m20(int num) {
		System.out.println("Divisor of " + num + " is: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void m21(int num) {
		if (num == 0 || num == 1) {
			System.out.println("VOID");
		}
		int sum = 0;
		for (int i = 01; i < num; i++) {
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

	public void m22(int[] arr) {
		for(int i:arr){
			System.out.println(i);
		}
		boolean isOnly = true;
		if (arr.length == 0 || arr.length == 1) {
			isOnly = true;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				isOnly = false;
			}
		}
		System.out.println("Is Array Sorted:: "+isOnly);
	}

	public static void main(String[] args) {
		int[] arr = { 12, 0, 7, 0, 2, 3, 6, 2 };
		int[] arr2 = { 12, 0, 7, 0, 2, 3, 6, 2, 0, -2 };
		int number = 783885913;

		System.out.println("Array elements are: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Practice_21 obj1 = new Practice_21();
		try {
			Practice_21 obj2 = (Practice_21) obj1.clone();
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
			obj2.quickSort(arr2, 0, arr2.length - 1);
			obj2.sortedArray(arr2);
			obj2.m15(number);
			obj2.m16(2000);
			obj2.m17(number);
			obj2.m18(number);
			obj2.m19(6);
			obj2.m20(15);
			obj2.m21(28);
			obj2.m22(arr2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
