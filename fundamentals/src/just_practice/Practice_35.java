package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice_35 {

	public void m1(int[] num) {
		System.out.println("Array elements reverse:: ");
		int[] a = new int[num.length];
		int j = num.length;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		for (int i = 0; i < num.length; i++) {
			if (i == num.length - 1) {
				System.out.print(a[i] + " ");
			} else {
				System.out.print(a[i] + ", ");
			}

		}

	}

	public void m2(int[] num) {
		System.out.println("\nSorted array elements:: ");
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
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}
		}
		System.out.println("\nSum of array elements:: " + sum);
		System.out.println("Average of array:: " + sum / num.length);

		Set<Integer> iSet = new HashSet<>();
		for (int i : num) {
			iSet.add(i);
		}
		int[] newArr = new int[iSet.size()];
		int j = 0;
		for (int i : iSet) {
			newArr[j++] = i;
		}
		System.out.println("Second heighest array element in an array:: " + newArr[newArr.length - 1]);
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
			if (iMap.containsKey(i)) {
				iMap.put(i, iMap.get(i) + 1);
			} else {
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

	public void m7(int[] num) {
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

	public void m8(int[] num, int number) {
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

	public void m9(int[] num) {
		System.out.println("Only unqiue and non repeated number:: ");
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
			if (num[i] > 0 || num[i] < 0) {
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
		System.out.println("All zero element in the end of the array using List: ");
		List<Integer> allnum = new ArrayList<Integer>();
		List<Integer> allZero = new ArrayList<Integer>();
		for (int data : num) {
			if (data > 0 || data < 0) {
				allnum.add(data);
			} else if (data == 0) {
				allZero.add(data);
			}
		}
		allnum.addAll(allZero);
		System.out.println(allnum);
	}

	public void m12(int[] num) {
		System.out.println("All Zero in the beginning of the array:: ");
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
		System.out.println("\nArray elements before searching should be sorted:: ");
		boolean isSorted = true;
		if (num == null || num.length == 0) {
			isSorted = true;
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				isSorted = false;
			}
		}

		System.out.println("is Array Sorted:: " + isSorted);
		Arrays.sort(num);
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		int searchedNumber = 9;
		while (li <= hi) {
			if (num[mi] == searchedNumber) {
				System.out.println(searchedNumber + " is present at the " + mi + " index location!!");
				break;
			} else if (searchedNumber > num[mi]) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searchedNumber + " is not present!!");
		}

	}

	public void m14(int[] num) {
		System.out.println("Occurence of array elements:: ");
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
		for (Map.Entry<Integer, Integer> entry : iMap.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

	public void m15(int[] num) {

		boolean isSorted = true;
		if (num == null || num.length == 1) {
			isSorted = true;
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				isSorted = false;
			}
		}
		System.out.println("is Array elements sorted:: " + isSorted);
	}

	public void m16(int[] num, int[] num2) {
		Integer[] i1 = Arrays.stream(num).boxed().toArray(Integer[]::new);
		Integer[] i2 = Arrays.stream(num2).boxed().toArray(Integer[]::new);

		List<Integer> li1 = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();

		li1.addAll(Arrays.asList(i1));
		li2.addAll(Arrays.asList(i2));

		Set<Integer> s1 = new HashSet<>(li1);
		s1.addAll(li2);

		Set<Integer> s2 = new HashSet<>(li1);
		s1.retainAll(li2);

		s1.removeAll(s2);
		System.out.println("Unique element between two array:: ");
		for (int i : s1) {
			System.out.println(i);
		}
	}

	public int divideConquer(int low, int high, int[] num) {
		int pivot = num[(low + high) / 2];
		while (low <= high) {
			while (pivot > num[low]) {
				low++;
			}
			while (pivot < num[high]) {
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

	public void quickSort(int low, int high, int num[]) {
		int pi = divideConquer(low, high, num);
		if (pi - 1 > low) {
			quickSort(low, pi - 1, num);
		}
		if (pi < high) {
			quickSort(pi, high, num);
		}
	}

	public void sortedArray(int[] num) {
		System.out.println("Sorted array using quick sort algorithm:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m17(int[] num1, int[] num2) {
		if (num1.length != num2.length) {
			System.out.println("Length of array1:: " + num1.length);
			System.out.println("Length of array2:: " + num2.length);
			System.out.println("Invalid addition!!");
		} else {
			int[] sumArray = new int[num1.length];

			for (int i = 0; i < num1.length; i++) {
				sumArray[i] = num1[i] + num2[i];
			}
			System.out.println("Sum of two array");
			for (int i = 0; i < sumArray.length; i++) {
				System.out.println(sumArray[i]);
			}
		}

	}

	public void m18(int[] num) {

		int replaceElement = 199;
		int replacedElement = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == replacedElement) {
				num[i] = replaceElement;
			}
		}
		System.out.println("Replacing an array element in an array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m19(int num1[], int num2[]) {
		System.out.println("Merging two array:: ");
		int[] mergedArray = new int[num1.length + num2.length];
		int k = 0;
		for (int i = 0; i < num1.length; i++) {
			mergedArray[k++] = num1[i];
		}

		for (int i = 0; i < num2.length; i++) {
			mergedArray[k++] = num2[i];
		}
		for (int i = 0; i < mergedArray.length; i++) {
			if (i == mergedArray.length - 1) {
				System.out.print(i + " ");
			} else {
				System.out.print(i + ", ");
			}
		}

	}

	public void m20(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		System.out.println("\nCount of number :: " + count);
	}

	public void m21(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		System.out.println("Sum of number :: " + sum);
	}

	public void m22(int number) {
		int reverseNumber = 0;
		while (number != 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reverse:: " + reverseNumber);
	}

	public void m23(int year) {
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

	public void m24(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		System.out.println("Factorial is:: " + fact);
	}

	public void m25(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			System.out.println(number + " is a Perfect Number!!");
		} else {
			System.out.println(number + " is not a Perfect Number!!");
		}

	}

	public void m26(int number) {
		System.out.println("Perfect divisor is:: ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void m27(int number) {
		System.out.println("Pattern is:: ");
		int k = 0;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = { 0, 9, 0, 7, 4, 22, 1, -100, 22, 22 };
		int[] arr2 = { 0, 9, 0, 7, 4, 22, 1, -101, 100 };
		int number = 783881691;

		Practice_35 obj1 = new Practice_35();
		obj1.m1(arr);
		obj1.m2(arr);
		obj1.m3(arr);
		obj1.m4(arr);
		obj1.m5(arr);
		obj1.m6(arr);
		obj1.m7(arr);
		obj1.m8(arr, number);
		obj1.m9(arr);
		obj1.m10(arr);
		obj1.m11(arr2);
		obj1.m12(arr);
		obj1.m13(arr);
		obj1.m14(arr);
		obj1.m15(arr2);
		obj1.m16(arr, arr2);
		obj1.quickSort(0, arr2.length - 1, arr2);
		obj1.sortedArray(arr2);
		obj1.m17(arr, arr2);
		obj1.m18(arr);
		obj1.m19(arr, arr2);
		obj1.m20(number);
		obj1.m21(number);
		obj1.m22(number);
		obj1.m23(2004);
		obj1.m24(6);
		obj1.m25(6);
		obj1.m26(133);
		obj1.m27(10);
	}

}
