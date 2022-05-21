package just_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice_36 implements Cloneable {
	int y;

	public void m1(int[] num) {
		int[] a = new int[num.length];
		int j = num.length;

		for (int i = 0; i < num.length; i++) {
			a[j - 1] = num[i];
			j = j - 1;
		}
		System.out.println("\nArray elements reversed:: ");
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
		Set<Integer> iSet = new HashSet<Integer>();

		for (int i : num) {
			iSet.add(i);
		}

		int[] newUniqueElement = new int[iSet.size()];

		int j = 0;
		for (int i : iSet) {
			newUniqueElement[j++] = i;
		}

		System.out.println("Second heighest array element is :: " + newUniqueElement[newUniqueElement.length - 3]);

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
		Set<Integer> iSet = new HashSet<Integer>();
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
		Set<Entry<Integer, Integer>> iSet = iMap.entrySet();
		for (Map.Entry<Integer, Integer> entMap : iSet) {
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
				System.out.println(num[i] + " is a Prime Number");
			} else {
				System.out.println(num[i] + " is not a Prime Number");
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
		System.out.println("Count of even element in array:: " + even);
		System.out.println("Count of odd element in array:: " + odd);

		while (number > 0) {
			int rem = 0;
			rem = number % 10;
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
		System.out.println("All zero element in the end of the array using List: " + allNum);
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

		int searched_Number = 0;
		int li = 0;
		int hi = num.length - 1;
		int mi = (li + hi) / 2;
		while (li <= hi) {
			if (num[mi] == searched_Number) {
				System.out.println(searched_Number + " is Present at " + mi + " location.");
				break;
			} else if (num[mi] < searched_Number) {
				li = mi + 1;
			} else {
				hi = mi - 1;
			}
			mi = (li + hi) / 2;
		}
		if (li > hi) {
			System.out.println(searched_Number + " is not Present at any location.");
		}
	}

	public void m14(int[] num) {
		System.out.println("Occurence of array elements:: ");
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
		boolean isSorted = true;
		if (num == null || num.length == 0) {
			isSorted = true;
		} else {
			for (int i = 1; i < num.length; i++) {
				if (num[i - 1] > num[i]) {
					isSorted = false;
				}
			}
		}

		if (isSorted) {
			System.out.println("is Array elements sorted:: YES");
		} else {
			System.out.println("is Array elements sorted:: NO");
		}

	}

	public void m16(int[] num1, int[] num2) {
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

		System.out.println("Unique element between two array:: ");
		for (Integer i : s1) {
			System.out.println(i);
		}
	}

	public void m17(int[] num1, int[] num2) {
		if (num1.length != num2.length) {
			System.out.println("Can't add two arrays as they are different in length");
		} else {
			int[] additionArr = new int[num1.length];
			for (int i = 0; i < num1.length; i++) {
				additionArr[i] = num1[i] + num2[i];
			}

			System.out.println("Addition of two array:: ");
			for (int i : additionArr) {
				System.out.println(i);
			}
		}
	}

	public void m18(int[] num) {
		System.out.println("Replacing an array element in an array:: ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] == -2) {
				Integer repl = num[i];
				String s = repl.toString();
				s = s.replaceAll("-", "");
				num[i] = Integer.parseInt(s);

			}
		}

		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m19(int[] num1, int[] num2) {
		System.out.println("Merging two array:: ");
		int k = 0;
		int[] mergedArray = new int[num1.length + num2.length];
		for (int i = 0; i < num1.length; i++) {
			mergedArray[k++] = num1[i];
		}
		for (int i = 0; i < num2.length; i++) {
			mergedArray[k++] = num2[i];
		}
		for (int i = 0; i < mergedArray.length; i++) {
			if (i == mergedArray.length - 1) {
				System.out.print(mergedArray[i] + " ");
			} else {
				System.out.print(mergedArray[i] + ", ");
			}
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
		System.out.println("\nSorted Array:: ");
		for (int i : num) {
			System.out.println(i);
		}
	}

	public void m20(int num) {

		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Count length of a number:: " + count);
	}

	public void m21(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("Sum of number:: " + sum);
	}

	public void m22(int num) {
		int reverseNum = 0;
		while (num != 0) {
			reverseNum = reverseNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("Number after reverse:: " + reverseNum);
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

	public void m24(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial is:: " + fact);

	}

	public void m25(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println(num + " is a Perfect Number!!");
		} else {
			System.out.println(num + " is not a Perfect Number!!");
		}
	}

	public void m26(int num) {
		System.out.println("Perfect divisor of " + num + " is:: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void m27(int num) {
		System.out.println("Pattern is:: ");
		int k = 0;
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println(" ");
		}
	}

	public void m28(int num) {
		System.out.println("To check Number is Prime or not");
		int temp = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(num + " is a Prime number");
		} else {
			System.out.println(num + " is not a Prime number");
		}
	}

	public void m29(int num) {
		System.out.println("Prime number between 1 to " + num);
		for (int i = 1; i <= num; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { -1, 22, 3, 5, 6, 0, -2, 6, 0 };
		int[] arr2 = { 1, 22, 3, 5, 6, 0, -2, 0, 0 };
		int number = 986859572;
		Practice_36 obj1 = new Practice_36();

		try {
			Practice_36 obj2 = (Practice_36) obj1.clone();
			System.out.println("Array elements are:: ");
			for (int i = 0; i < arr1.length; i++) {
				if (i == arr1.length - 1) {
					System.out.print(arr1[i] + " ");
				} else {
					System.out.print(arr1[i] + ", ");
				}
			}
			obj2.m1(arr1);
			obj2.m2(arr1);
			obj2.m3(arr1);
			obj2.m4(arr1);
			obj2.m5(arr1);
			obj2.m6(arr1);
			obj2.m7(arr1);
			obj2.m8(arr1, number);
			obj2.m9(arr1);
			obj2.m10(arr1);
			obj2.m11(arr2);
			obj2.m12(arr1);
			obj2.m13(arr1);
			obj2.m14(arr2);
			obj2.m15(arr2);
			obj2.m16(arr1, arr2);
			obj2.m17(arr1, arr2);
			obj2.m18(arr1);
			obj2.m19(arr1, arr2);
			obj2.quickSort(0, arr2.length - 1, arr2);
			obj2.sortedArray(arr2);
			obj2.m20(number);
			obj2.m21(number);
			obj2.m22(number);
			obj2.m23(2008);
			obj2.m24(6);
			obj2.m25(6);
			obj2.m26(17);
			obj2.m27(10);
			obj2.m28(12);
			obj2.m29(100);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
