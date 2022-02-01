package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.naming.directory.SearchControls;

public class Practice_31 implements Cloneable {

	public void m1(int[] num) {
		int[] a = new int[num.length];
		int j = num.length;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reversed:: ");
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
		System.out.println("\nSorted array elements:: ");
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}
		}
		System.out.println("\nSum of array elements:: " + sum);
		System.out.println("Second heighest array element:: " + num[num.length - 2]);
		System.out.println("Average of array:: " + sum / num.length);
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
		Set<Integer> s1 = new HashSet<Integer>();
		int count = 0;
		for (int i : num) {
			if (s1.add(i) == false) {
				count++;
				System.out.println(i);
			}
		}
		if (count == 0) {
			System.out.println("No Duplicate element present");
		}

	}

	public void m6(int[] num) {
		System.out.println("Finding duplicate element using Map:: ");
		Map<Integer, Integer> iMap = new HashMap<Integer, Integer>();
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
		Set<Entry<Integer, Integer>> entSet = iMap.entrySet();
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
		System.out.println("Count of odd element:: " + odd);

		int rem = 0;
		while (number != 0) {
			if (rem % 10 == 0) {
				if (number % 2 == 0) {
					even_count++;
				} else {
					odd_count++;
				}
			}
			number = number / 10;
		}
		System.out.println("Count of even number:: " + even_count);
		System.out.println("Count of odd number:: " + odd_count);
	}

	public void m8(int[] num) {
		for (int i = 0; i < num.length; i++) {
			boolean is_Prime = true;
			for (int j = 2; j < num[i]; j++) {
				if (num[i] % j == 0) {
					is_Prime = false;
				}
			}
			if (is_Prime) {
				System.out.println(num[i] + " is a Prime Number");
			} else {
				System.out.println(num[i] + " is not a Prime Number");
			}
		}

	}

	public void m9(int[] num) {
		System.out.println("Only unique and non-repeated number: ");
		for (int i = 0; i < num.length; i++) {
			boolean is_Unique = true;
			for (int j = 0; j < num.length; j++) {
				if (i != j && num[i] == num[j]) {
					is_Unique = false;
				}
			}
			if (is_Unique) {
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
			if (num[i] < 0 || num[i] == 0) {
				tempArr[j++] = num[i];
			}
		}

		for (int i = 0; i < tempArr.length; i++) {
			num[i] = tempArr[i];
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}
		}
	}

	public void m11(int[] num) {
		System.out.println("\nAll zero element in the end of the array using List: ");
		List<Integer> allNum = new ArrayList<Integer>();
		List<Integer> allZero = new ArrayList<Integer>();

		for (Integer data : num) {
			if (data > 0 || data < 0) {
				allNum.add(data);
			} else if (data == 0) {
				allZero.add(data);
			}
		}
		allNum.addAll(allZero);
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

		}
	}

	public void m13(int[] num) {
		System.out.println("\nArray elements before searching:: ");
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		int searching_number = 11;
		int high = num.length - 1;
		int low = 0;
		int mi = (low + high) / 2;
		while (low <= high) {
			if (num[mi] == searching_number) {
				System.out.println("\n" + searching_number + " is present at " + mi + " index position.");
				break;
			} else if (num[mi] < searching_number) {
				low = mi + 1;
			} else {
				high = mi - 1;
			}
			mi = (low + high) / 2;
		}
		if (high > low) {
			System.out.println("\n" + searching_number + " is not present in array!!");
		}
	}

	public void m14(int[] num) {
		System.out.println("Occurence of array elements::");
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
		Set<Entry<Integer, Integer>> entSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : entSet) {
			System.out.println(entMap.getKey() + "=" + entMap.getValue());
		}

	}

	public void m15(int[] num1, int[] num2) {
		System.out.println("Unique element between two array:: ");
		Integer[] i1 = Arrays.stream(num1).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(num2).boxed().toArray(Integer[]::new);

		List<Integer> li1 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(i1));
		li2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<Integer>(li1);
		s1.addAll(li2);

		Set<Integer> s2 = new HashSet<Integer>(li1);
		s2.retainAll(li2);

		s1.removeAll(s2);

		for (int i : s1) {
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

		System.out.println("Sorted array using quickSort algorithm");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m17(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count of number: " + count);
	}

	public void m18(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number:: " + sum);
	}

	public void m19(int num) {
		int revNumber = 0;
		while (num > 0) {
			revNumber = revNumber * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + revNumber);
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
		System.out.println("Perfect Divisor of " + num + " is: ");
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
			System.out.println(num + " is a Perfect Number");
		} else {
			System.out.println(num + " is not a Perfect Number");
		}
	}

	public void m24() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array:: ");
		int iLength = scan.nextInt();
		System.out.println("Enter the array elements:: ");
		int[] nums = new int[iLength];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println("Array elements are:: ");
		for (int i : nums) {
			System.out.println(i);
		}
	}

	public void m25(int fNumber) {
		int fact = 1;
		for (int i = 1; i <= fNumber; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + fNumber + " is:: " + fact);
	}

	public void m26(int[] num) {
		System.out.println("Length of array:: ");
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			count++;
		}
		System.out.println(count);
	}

	public int[] m27() {
		int[] sortedArray = { 77, 1, 3, 0, 8, 9 };
		Arrays.sort(sortedArray);
		return sortedArray;
	}

	public void m28(int[] num) {
		System.out.println("Using sorted array:: ");
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searchingNumber = 9;
		while (li <= hi) {
			if (num[mi] == searchingNumber) {
				System.out.println(searchingNumber + " is present at the " + mi + " index position.");
				break;
			} else if (num[mi] < searchingNumber) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searchingNumber + " is not present in array!!");
		}
	}

	public void m29(int[] num, int[] num2) {
		int[] sumofArrayElements;
		if (num.length != num2.length) {
			System.out.println("For addition array length should be equal!!");
		} else {
			sumofArrayElements = new int[num.length];
			for (int i = 0; i < sumofArrayElements.length; i++) {
				sumofArrayElements[i] = num[i] + num2[i];
			}
			System.out.println("Sum of two array elements:: ");
			for (int i : sumofArrayElements) {
				System.out.println(i);
			}
		}
	}

	public void m30(int[] num, int[] num2) {
		int k = 0;
		int[] newArray = new int[num.length + num2.length];
		for (int ele : num) {
			newArray[k] = ele;
			k++;
		}

		for (int ele : num2) {
			newArray[k] = ele;
			k++;
		}

		System.out.println("Merging two array:: ");
		for (int i = 0; i < newArray.length; i++) {
			if (i == newArray.length - 1) {
				System.out.print(newArray[i] + " ");
			} else {
				System.out.print(newArray[i] + ", ");
			}
		}
	}

	public void m31(int[] num) {
		System.out.println("\nRemove duplicate element from array:: ");
		if (num == null || num.length == 1) {
			return;
		}
		for (int i = 0; i < num.length; i++) {
			boolean is_Unique = true;
			for (int j = 0; j < num.length; j++) {
				if (i != j && num[i] == num[j]) {
					is_Unique = false;
					break;
				}
			}
			if (is_Unique) {
				System.out.println(num[i]);
			}
		}
	}

	public void m32(int[] num) {
		System.out.println("Initial Array:: ");
		int count = 0;
		for (int i : num) {
			System.out.println(i);
		}
		System.out.println("Insert an item into an array at a specific index");
		for (int i = 0; i < num.length; i++) {
			count++;
			if (count == 4) {
				num[4] = 100;
			}
		}

		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m33(int[] num) {
		System.out.println("Count repeated element in an array:: ");
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
		Set<Entry<Integer, Integer>> entSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : entSet) {
			if (entMap.getValue() > 1) {
				System.out.println(entMap.getKey() + "=" + entMap.getValue());
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 77, 1, 22, 0, 11, 0, -99, 1, 0 };
		int[] arr2 = { 77, 1, 22, 0, 11, 0, -99, 1, 20 };
		int[] arr3 = { 177, 101, 202, 10, 911, 50, -991, 31, 720 };
		int number = 987456322;
		Practice_31 obj1 = new Practice_31();
		try {
			Practice_31 obj2 = (Practice_31) obj1.clone();
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
			obj2.m13(arr2);
			obj2.m14(arr2);
			obj2.m15(arr, arr2);
			obj2.m16(arr);
			obj2.quickSort(0, arr.length - 1, arr);
			obj2.sortedArray(arr);
			obj2.m17(number);
			obj2.m18(number);
			obj2.m19(number);
			obj2.m20(2004);
			obj2.m21(99);
			obj2.m22(10);
			obj2.m23(16);
			// obj2.m24();
			obj2.m25(6);
			obj2.m26(arr2);
			obj2.m28(obj2.m27());
			obj2.m29(arr, arr2);
			obj2.m30(arr2, arr3);
			obj2.m31(arr2);
			obj2.m32(arr3);
			obj2.m33(arr2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
