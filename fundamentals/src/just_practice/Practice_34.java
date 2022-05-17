package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice_34 {

	public void m1(int[] num) {
		int[] a = new int[num.length];
		int j = num.length;
		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("Array elements reverse:: ");
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

		System.out.println("\nSum of arraye elements:: " + sum);
		System.out.println("Second heighest array element:: " + num[num.length - 2]);
		System.out.println("Average of array :: " + sum / num.length);
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
				System.out.println(num[i] + " is a Prime Number!!");
			} else {
				System.out.println(num[i] + " is not a Prime Number!!");
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
			if (i == num.length - 1) {
				System.out.print(num[i] + " ");
			} else {
				System.out.print(num[i] + ", ");
			}

		}

	}

	public void m11(int[] num) {
		System.out.println("\nAll zero element in the end of the array using List: ");
		List<Integer> allNum = new ArrayList<>();
		List<Integer> allZero = new ArrayList<>();
		for (Integer data : num) {
			if (data > 0) {
				allNum.add(data);
			}
			if (data == 0) {
				allZero.add(data);
			}
		}
		allNum.addAll(allZero);
		System.out.println(allNum);
	}

	public void m12(int[] num) {
		int j = num.length - 1;
		System.out.println("All Zero in the beginning of the array:: ");
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

		boolean is_Sorted = true;
		if (num == null || num.length == 0) {
			is_Sorted = true;
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				is_Sorted = false;
			}
		}
		System.out.println("is Array sorted:: " + is_Sorted);

		int searched_element = 5;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (searched_element == num[mi]) {
				System.out.print(searched_element + " is present at " + mi + " index!");
				break;
			}
			if (num[mi] < searched_element) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searched_element + " is not present in array!!");
		}
	}

	public void m14(int[] num) {
		System.out.println("\nOccurence of array elements:: ");
		Map<Integer, Integer> iMap = new HashMap<>();
		for (int i : num) {
			if (iMap.containsKey(i)) {
				iMap.put(i, iMap.get(i) + 1);
			} else {
				iMap.put(i, 1);
			}
		}
		System.out.println(iMap);
	}

	public void m15(int[] num) {
		boolean is_Sorted = true;
		if (num == null || num.length == 0) {
			is_Sorted = true;
		}
		for (int i = 1; i < num.length; i++) {
			if (num[i - 1] > num[i]) {
				is_Sorted = false;
			}
		}
		System.out.println("is Array Sorted?:: " + is_Sorted);
	}

	public void m16(int[] num, int[] num2) {
		System.out.println("Unique element between two array:: ");
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
		System.out.println("Sorted array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m17(int[] num, int[] num2) {
		if (num.length != num2.length) {
			System.out.println("Sorry, can't add the array elements as they are not equal in length!!");
		} else {
			int[] additionArray = new int[num.length];
			for (int i = 0; i < additionArray.length; i++) {
				additionArray[i] = num[i] + num2[i];
			}

			System.out.println("Sum of two array:: ");
			for (int i : additionArray) {
				System.out.println(i);
			}
		}
	}

	public void m18(int[] num) {
		System.out.println("Replacing an array element::");
		int new_element = 202;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 5) {
				num[i] = new_element;
				break;
			}
		}
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m19(int[] num1, int[] num2) {
		System.out.println("Merging the array into one");
		int[] mergedArray = new int[num1.length + num1.length];
		int k = 0;
		for (int i : num1) {
			mergedArray[k++] = i;

		}
		for (int i : num2) {
			mergedArray[k++] = i;

		}
		for (int i = 0; i < mergedArray.length; i++) {
			if (i == mergedArray.length - 1) {
				System.out.print(mergedArray[i] + " ");
			} else {
				System.out.print(mergedArray[i] + ", ");
			}
		}
	}

	public void m20(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("\nCount of number is:: " + count);
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
		int reverseNum = 0;
		while (number != 0) {
			reverseNum = reverseNum * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Number after reverse:: " + reverseNum);
	}

	public void m23(int year) {
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

	public void m24(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
			System.out.println(i + "*" + fact);
		}
		System.out.println("Factorial is:: " + fact);
	}

	public void m25(int num) {
		System.out.println("Perfect divisor of " + num + " is: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void m26(int number) {
		System.out.println("Pattern is:: ");
		int k = 1;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public void m27(int num) {
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

	public static void main(String[] args) {
		int[] arr = { 22, 1, 5, 7, 9, 5, 0, 2, 0 };
		int[] arr2 = { 03, 1, 5, 7, 9, 5, 0, 2, 0 };
		int number = 121463202;
		Practice_34 obj1 = new Practice_34();
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
		obj1.m14(arr2);
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
		obj1.m23(2002);
		obj1.m24(6);
		obj1.m25(25);
		obj1.m26(10);
		obj1.m27(6);
	}

}
